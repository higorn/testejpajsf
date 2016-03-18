/*
 * File:   AutomovelBean.java
 *
 * Created on 12/03/16, 22:06
 */
package br.com.sisnunes.testejpajsf.controller;


import br.com.sisnunes.testejpajsf.model.Automovel;
import br.com.sisnunes.testejpajsf.service.AutomovelDao;
import br.com.sisnunes.testejpajsf.service.JPAUtil;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
//import javax.annotation.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * @author higor
 */
@ManagedBean
public class AutomovelBean
{
  private Automovel automovel = new Automovel();
  private List<Automovel> automoveis;

  @PostConstruct
  public void carregaAutomoveis()
  {
    EntityManager em = JPAUtil.getEntityManager();
    Query q = em.createQuery("SELECT a FROM Automovel a", Automovel.class);
    this.automoveis = q.getResultList();
    em.close();
  }

  public List<Automovel> getAutomoveis()
  {
    return automoveis;
  }

  public Automovel getAutomovel()
  {
    return automovel;
  }

/*  public void setAutomovel(Automovel automovel)
  {
    this.automovel = automovel;
  }*/

  public void salva(Automovel automovel)
  {
    System.out.println("Marca: " + automovel.getMarca());
    EntityManager em = JPAUtil.getEntityManager();
    AutomovelDao dao = new AutomovelDao(em);
    dao.add(automovel);
    em.close();
  }

  public void excluir(Automovel automovel)
  {
    EntityManager em = JPAUtil.getEntityManager();
    AutomovelDao dao = new AutomovelDao(em);
    dao.del(automovel);
    em.close();
  }
}
