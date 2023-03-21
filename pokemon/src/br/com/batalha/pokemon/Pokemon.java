package br.com.batalha.pokemon;

public class Pokemon {
	private String nome, tipo, vantagem;
	private int ataque, resistencia;
	
	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getResistencia() {
		return resistencia;
	}

	public void setResistencia (int resistencia) {
		this.resistencia = resistencia;
	}
	
	public void pokedex() {
		System.out.println("-------------------- Pokedex --------------------");
		System.out.println("| nome: "+ this.getNome());
		System.out.println("| tipo: "+ this.getTipo());
		System.out.println("| ataque: "+ this.ataque);
		System.out.println("| resistencia: "+ this.resistencia);
		System.out.println("-------------------- ------- --------------------");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getVantagem() {
		return vantagem;
	}

	public void setVantagem(String vantagem) {
		this.vantagem = vantagem;
	}
}