package entities;

public class Item {
	private String nome;
	private Double precoUnitario;
	private int quantidade;

	public Item() {
	}

	public Item(String nome, Double precoUnitario, int quantidade) {
		super();
		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(Double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double valorTotal() {
		return quantidade * precoUnitario;
	}

	@Override
	public String toString() {
		return nome + ", " + valorTotal();
	}

}
