package br.com.batalha.tipos;

import br.com.batalha.pokemon.Pokemon;

public class Eletrico extends Pokemon {
	
	public Eletrico(String nome, String tipo, int ataque, int resistencia, String vantagem) {
		super.setNome(nome);
		super.setTipo(tipo);
		super.setVantagem(vantagem);
		super.setAtaque(ataque);
		super.setResistencia(resistencia);
	}
}