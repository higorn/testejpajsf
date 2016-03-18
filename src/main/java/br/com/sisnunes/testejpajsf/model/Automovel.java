/*
 * File:   Automovel.java
 *
 * Created on 22/12/2014, 15:44:38
 */

package br.com.sisnunes.testejpajsf.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author higor
 */
@Entity
public class Automovel implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String marca;
	private String modelo;
	private Integer anoFabricacao;
	private Integer anoModelo;
	private String observacoes;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getMarca()
	{
		return marca;
	}

	public void setMarca(String marca)
	{
		this.marca = marca;
	}

	public String getModelo()
	{
		return modelo;
	}

	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}

	public Integer getAnoFabricacao()
	{
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao)
	{
		this.anoFabricacao = anoFabricacao;
	}

	public Integer getAnoModelo()
	{
		return anoModelo;
	}

	public void setAnoModelo(Integer anoModelo)
	{
		this.anoModelo = anoModelo;
	}

	public String getObservacoes()
	{
		return observacoes;
	}

	public void setObservacoes(String observacoes)
	{
		this.observacoes = observacoes;
	}

	@Override
	public int hashCode()
	{
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object)
	{
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Automovel))
		{
			return false;
		}
		Automovel other = (Automovel) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
		{
			return false;
		}
		return true;
	}

	@Override
	public String toString()
	{
		return "Automovel[ id=" + id + " ]";
	}

}
