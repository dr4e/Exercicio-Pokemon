package br.com.batalha.treinador;
import br.com.batalha.pokemon.Pokemon;
import br.com.batalha.tipos.*;

import java.util.Random;

public class Treinador {
	private String nome;
	private Pokemon poke;
	private Treinador treinador;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pokemon getPoke() {
		return poke;
	}

	public void setPoke(Pokemon poke) {
		this.poke = poke;
	}

	public Treinador getTreinador() {
		return treinador;
	}

	public void setTreinador(Treinador treinador) {
		this.treinador = treinador;
	}

	public Treinador(String nome){
		this.nome = nome;
	}
	
	public void Capturar() {
		Random random = new Random();
		int ranNum = random.nextInt(3);
		
		switch (ranNum){
		case 0:
			poke = new Aqua("Psyduck", "Aquatico", 1, 13, "Lago");
			break;
		case 1:
			poke = new Fogo("Charmander", "Fogo", 3, 12, "Montanha");
			break;
		case 2:
			poke = new Pedra("Aron", "Pedra", 4, 20, "Praia");
			break;
		case 3:
			poke = new Eletrico("Pikachu", "Eletrico", 5, 10, "Cidade");
			break;
			}
		}
		
	public void Atacar(Treinador t2){
		System.out.println(t2.getPoke().getNome() + " foi atingido");
		t2.poke.setResistencia(t2.poke.getResistencia() - poke.getAtaque());
	}
	
}