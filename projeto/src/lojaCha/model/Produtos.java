package lojaCha.model;
import java.util.ArrayList;
import java.util.List;

public class Produtos {

	private String nome;
	private String descricao;
	private float preco;
	
	public Produtos(String nome, String descricao, float preco) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
				
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
		
	public void detalhesprodutos() {
		
 	            System.out.println(getNome());
	            System.out.println("Descrição: " + getDescricao());
	            System.out.println("Preço: " + getPreco());
	           	System.out.println("----------------------------"); 
	        }

	}



