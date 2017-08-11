/**
 * 
 */
package com.pruebas.dao;

import java.sql.SQLException;

import com.pruebas.beans.Marca;

/**
 * @author User
 *
 */
public interface MarcaDao {
	
	int registrar(Marca marca) throws SQLException;
}
