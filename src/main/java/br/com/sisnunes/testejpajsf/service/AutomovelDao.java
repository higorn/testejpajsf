/*
 * File:   AutomovelDao.java
 *
 * Created on 12/03/16, 14:37
 */
package br.com.sisnunes.testejpajsf.service;

import br.com.sisnunes.testejpajsf.model.Automovel;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 * @author higor
 */
public class AutomovelDao
{
  private EntityManager _em;

  public AutomovelDao(EntityManager em)
  {
    _em = em;
  }

  public Automovel get(Object id)
  {
    Automovel auto = null;
    EntityTransaction tx = _em.getTransaction();
    tx.begin();
    auto = _em.find(Automovel.class, id);
    tx.commit();

    return auto;
  }

  public void add(Automovel automovel)
  {
    EntityTransaction tx = _em.getTransaction();
    tx.begin();
    _em.persist(automovel);
    tx.commit();
  }

  public void del(Automovel automovel)
  {
    EntityTransaction tx = _em.getTransaction();
    tx.begin();
    automovel = _em.merge(automovel);
    _em.remove(automovel);
    tx.commit();
  }
}
