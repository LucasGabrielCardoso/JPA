package application;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entities.Marca;
import entities.Modelo;
import entities.Automovel;

public class Application {

	public static void main(String[] args) throws ParseException {
		
		System.out.println("\n*** Versão 1 - Inicial ***");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aulajpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Marca mar1 = new Marca(null,"UNO");
		
		Modelo mod1 = new Modelo(null, "Carro que já foi barato", 100);
		
		mar1.adicionarModelo(mod1);
		
		em.persist(mar1);
		em.persist(mod1);
		
		em.getTransaction().commit();
		
		em.close();
	}

}
