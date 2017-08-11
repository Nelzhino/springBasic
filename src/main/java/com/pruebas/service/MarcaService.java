package com.pruebas.service;

import java.sql.SQLException;

import com.pruebas.beans.Marca;

public interface MarcaService {
	
	int registrar(Marca marca) throws SQLException;
}
