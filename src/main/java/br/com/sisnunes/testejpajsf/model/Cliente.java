package br.com.sisnunes.testejpajsf.model;
/**
 * Created by higor on 22/12/14.
 */

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente
{
	private static final long serialVersionUID = 1L;
	@Id
	private String cpf;

	public String getCpf()
	{
		return cpf;
	}

	public void setCpf(String cpf)
	{
		this.cpf = cpf;
	}

	@Override
	public int hashCode()
	{
		int hash = 0;
		hash += (cpf != null ? cpf.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object)
	{
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Cliente))
		{
			return false;
		}
		Cliente other = (Cliente) object;
		if ((this.cpf == null && other.cpf != null) || (this.cpf != null && !this.cpf.equals(other.cpf)))
		{
			return false;
		}
		return true;
	}

	@Override
	public String toString()
	{
		return "Cliente[ id=" + cpf + " ]";
	}
}