package br.com.fiap.padaria.model;

public class produto {
	//atributos
	private int id,quantidade;
	private String nome;
	private double precoCusto,precoVenda;
	private boolean promocao;
	
	//metodos
	double calcularLucro() {
		double lucro = precoVenda - precoCusto;
		return lucro;
	}
	void atualizarEstoque(int qtd) {
		quantidade += qtd;
	}
	
	//getters e Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	
	public double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	public boolean isPromocao() {
		return promocao;
	}
	public void setPrecoVenda(boolean promocao) {
		this.promocao = promocao;
	}
}
