package pres;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

import Dao.DaoImpl;
import Dao.IDao;
import metier.IMetier;

public class PresentationV2 {

	public static void main(String[] args) {

		try {
			Scanner scanner = new Scanner(new File("config.txt"));
			String daoClassName =  scanner.nextLine();
//			System.out.println(daoClassName);
			// Charger la classe en mémoire
			Class cDao = Class.forName(daoClassName);
			IDao dao =(IDao) cDao.newInstance();
//			System.out.println(dao.getTemperature());
			
			String metierClassName = scanner.nextLine();
			// Charger la classe en mémoire
			Class cMetier = Class.forName(metierClassName);
			// Instancier la classe dynamiquement 
			IMetier metier = (IMetier) cMetier.newInstance();
			
			Method m = cMetier.getMethod("setDao", IDao.class);
			m.invoke(metier, dao);
			
			  System.out.println(metier.calcul());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
}
