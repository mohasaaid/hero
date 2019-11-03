package metier;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;


import Dao.IDao;


public class MetierImpl implements IMetier {
	// Couplage Faible
	// Injection de dépendances 
	@Autowired
	private IDao dao;
	
	@Override 
	public double calcul() {

		double temperature = dao.getTemperature();
		double resultat = temperature * 12;
		return resultat;
	}

	public IDao getDao() {
		return dao;
	}

	public void setDao(IDao dao) {
		this.dao = dao;
	}
	

}
