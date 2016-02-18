package com.i0dt.i0dtSoft.core;


/**
 * source from: http://websystique.com/spring/spring4-hibernate4-mysql-maven-integration-example-using-annotations/
 */

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.i0dt.i0dtSoft.core.configuration.AppConfig;
import com.i0dt.i0dtSoft.core.model.Utente;
import com.i0dt.i0dtSoft.core.service.UtenteService;

public class AppMain {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "/com/i0dt/i0dtSoft/core/_core.cfg.xml", "/com/i0dt/i0dtSoft/core/_base.cfg.xml" });
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		//AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext();
		//context.scan("com.i0dt.i0dtSoft.core"); 
		//context.refresh();
		 
		UtenteService service = (UtenteService) context.getBean("utenteService");
		List<Utente> utenti =service.findAllUtente();
		System.out.println("Total utente: " + utenti.size());
		for(Utente utente: utenti){
			System.out.println(utente);
		}
	}
}