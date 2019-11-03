package pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.IMetier;

public class PresentationAvecSpring {

	public static void main(String[] args) {
		// Demander a Spring de lire le ficher config.xml
//		ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");
		
		/*
		 *  Scanner la classes dans les packages Dao metier
		 */
		ApplicationContext springContext = new AnnotationConfigApplicationContext("Dao", "metier");
		IMetier metier = springContext.getBean(IMetier.class);
		
		System.out.println(metier.calcul());
	}

}
