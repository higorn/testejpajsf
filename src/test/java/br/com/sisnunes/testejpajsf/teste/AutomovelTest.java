/*
 * File:   AutomovelTest.java
 *
 * Created on 12/03/16, 18:59
 */
package br.com.sisnunes.testejpajsf.teste;

import br.com.sisnunes.testejpajsf.model.Automovel;
import br.com.sisnunes.testejpajsf.service.AutomovelDao;
import br.com.sisnunes.testejpajsf.service.JPAUtil;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * @author higor
 */
public class AutomovelTest extends junit.framework.TestCase
//public class AutomovelTest
{
  private EntityManagerFactory _emf;
  private EntityManager _em;
  private AutomovelDao  _automovelDao;

  @org.junit.Before
  public void setUp() throws Exception
  {
//    _emf = Persistence.createEntityManagerFactory("default");
//    _em = _emf.createEntityManager();
    _em = JPAUtil.getEntityManager();
    _automovelDao = new AutomovelDao(_em);
  }

  @org.junit.After
  public void tearDown() throws Exception
  {
    _em.close();
//    _em.getEntityManagerFactory().close();
//    _emf.close();
  }

  @Test
  public void testAdd()
  {
    Automovel auto = new Automovel();
    auto.setAnoFabricacao(2016);
    auto.setMarca("Ferrari");
    auto.setModelo("La Ferrari");
    auto.setObservacoes("Nunca foi batido");

    _automovelDao.add(auto);

    Automovel auto2 = _automovelDao.get(auto.getId());

    assertEquals(auto, auto2);
  }
}
