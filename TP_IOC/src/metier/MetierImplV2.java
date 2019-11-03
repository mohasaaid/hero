package metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Dao.IDao;

@Component
public class MetierImplV2 implements IMetier {
	@Autowired
	private IDao dao;
	
	@Override 
	public double calcul() {

		double temperature = dao.getTemperature();
		double resultat = temperature * 10;
		return resultat;
	}

	public IDao getDao() {
		return dao;
	}

	public void setDao(IDao dao) {
		this.dao = dao;
	}
	

}
