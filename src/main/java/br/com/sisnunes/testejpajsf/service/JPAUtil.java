/*
 * File:   JPAUtil.java
 *
 * Created on 12/03/16, 20:08
 */
package br.com.sisnunes.testejpajsf.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author higor
 */
public class JPAUtil
{
  private static final EntityManagerFactory _emf = Persistence.createEntityManagerFactory("default");

  public static EntityManager getEntityManager()
  {
    return _emf.createEntityManager();
  }

  public static void closeEntityManagerFactory()
  {
    _emf.close();
  }
}
