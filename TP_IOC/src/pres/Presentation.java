package pres;

import Dao.DaoImpl;
import metier.MetierImpl;

public class Presentation {

	public static void main(String[] args) {
		/*
		 * Injection des dépendance par instanciation satique
		 */
		DaoImpl dao = new DaoImpl();
		MetierImpl metier = new MetierImpl();
		metier.setDao(dao);
		System.out.println(metier.calcul());
	}

}
