package com.aguiiarlucas.project.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_category")
public class Category implements Serializable {

	
	private static final long serialVersionUID = 1L;
 
	@Id // [Chave Primaria]
	@GeneratedValue(strategy = GenerationType.IDENTITY)//[Auto Incremento]
	private Long id;
	private String name;

	public Category() {
		// TODO Auto-generated constructor stub
	}

	public Category(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getid() {
		return id;
	}

	public void setid(Long id) {
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}