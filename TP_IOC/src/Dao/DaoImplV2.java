package Dao;

import org.springframework.stereotype.Component;

@Component
public class DaoImplV2 implements IDao {

	@Override
	public double getTemperature() {
		/*
		 * Dans cette version, je me connecte a un web service pour réccupérer
		 * la temperature
		 */
		
		double data = 10;
		return data;
	}

}
