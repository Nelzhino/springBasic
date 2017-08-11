/**
 * 
 */
package com.pruebas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pruebas.beans.Marca;

/**
 * @author User
 *
 */

@Repository
public class MarcaDaoImpl implements MarcaDao {

	@Autowired
	private DataSource dataSource;

	@Override
	public int registrar(Marca marca) throws SQLException {

		Connection con = dataSource.getConnection();
		PreparedStatement preparedStatement = con.prepareStatement("insert into marca values (?,?)");
		preparedStatement.setInt(1, marca.getId());
		preparedStatement.setString(2, marca.getNombre());
		
		int row = preparedStatement.executeUpdate();
		
		if (row < 1) {
			throw new SQLException(String.format("No se pudo ejecutar la insercion de %s", Marca.class.getSimpleName()));
		}
		
		return row;

	}

}
