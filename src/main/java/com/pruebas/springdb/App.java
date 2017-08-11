package com.pruebas.springdb;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pruebas.beans.Marca;
import com.pruebas.service.MarcaService;
import com.pruebas.service.MarcaServiceImpl;

public class App {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/pruebas/xml/beans.xml");
		MarcaService marcaService = applicationContext.getBean(MarcaServiceImpl.class);

		Marca marca = new Marca();
		marca.setId(3);
		marca.setNombre("Lucati");

		try {
			marcaService.registrar(marca);
			System.out.println("Guardo con exito!");
		} catch (SQLException e) {
			System.out.println("Hay un error al momento de insertar la marca: " + e.getMessage());
		}
		
		((ConfigurableApplicationContext) applicationContext).close();
	}

}
