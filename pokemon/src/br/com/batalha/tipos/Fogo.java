package br.com.batalha.tipos;
import br.com.batalha.pokemon.Pokemon;

public class Fogo extends Pokemon {

	public Fogo(String nome, String tipo, int ataque, int resistencia, String vantagem) {
		super.setNome(nome);
		super.setTipo(tipo);
		super.setVantagem(vantagem);
		super.setAtaque(ataque);
		super.setResistencia(resistencia);
	
	}

}
