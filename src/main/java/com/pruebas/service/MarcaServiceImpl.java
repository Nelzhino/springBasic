package com.pruebas.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebas.beans.Marca;
import com.pruebas.dao.MarcaDao;

@Service
public class MarcaServiceImpl implements MarcaService{

	@Autowired
	private MarcaDao marcaDao;

	@Override
	public int registrar(Marca marca) throws SQLException {
		return marcaDao.registrar(marca);
	}
	
		
}
