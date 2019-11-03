package Dao;

import org.springframework.stereotype.Component;


public class DaoImpl implements IDao {

	@Override
	public double getTemperature() {
		/*
		 * Se connecter a la base de donnee pour récupérer la température
		 */
		double data = 25;
		return data;	
	}

}
