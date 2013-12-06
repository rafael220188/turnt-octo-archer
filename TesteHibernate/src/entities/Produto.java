package entities;

import javax.persistence.Column;
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id;

@Entity
//anotações (ex: @Entity) que fazem com que o Hibernate saiba que esta classe
//deve ser representada na base de dados e como o mapeamento será realizado
public class Produto {
	@Id 
	@GeneratedValue 
	int id; 
	String nome; 
	@Column
	double preco;
	@Column
	
	public int getId() { 
		return id; 
	}
	
	private void setId(int id) { 
		this.id = id; 
	}
	
	public String getNome() { 
		return nome; 
	}
	
	public void setNome(String nome) { 
		this.nome = nome; 
	}
	
	public double getPreco() { 
		return preco; 
	}
	
	public void setPreco(double preco) { 
		this.preco = preco; 
	}
	
}
