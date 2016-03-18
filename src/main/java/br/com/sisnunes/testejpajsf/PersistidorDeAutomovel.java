package br.com.sisnunes.testejpajsf;

import br.com.sisnunes.testejpajsf.model.Automovel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by higor on 22/12/14.
 */
public class PersistidorDeAutomovel
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();

		Automovel auto = new Automovel();
		auto.setAnoFabricacao(2014);
		auto.setMarca("Ferrari");
		auto.setModelo("La Ferrari");
		auto.setObservacoes("Nunca foi batido");

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(auto);
		tx.commit();

		em.close();
		emf.close();
	}
}
