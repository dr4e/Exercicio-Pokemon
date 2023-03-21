package br.com.batalha.partida;
import java.util.Random;
import br.com.batalha.pokemon.Pokemon;
import br.com.batalha.treinador.Treinador;

public class Partida {
	private String local;
	String locais[] = new String[]{"Lago", "Praia", "Cidade", "montanhas"};
	Random random = new Random();
	int ranNum = random.nextInt(3);
	
	public void iniciarPartida(Treinador t1, Treinador t2){
		System.out.println("O PAU VAI COMER SOLTO!!!");
		System.out.println("Local da Batalha: " + locais[ranNum]);
		System.out.println("Treinador 1: " + t1.getNome());
		System.out.println("Treinador 2: " + t2.getNome());
	}
	
	public void powerUp (Pokemon poke1, Pokemon poke2){
		if (locais[ranNum].equals(poke1.getVantagem())){
			poke1.setAtaque(poke1.getAtaque() + 3);
		}
		
		if (locais[ranNum].equals(poke2.getVantagem())){
			poke2.setAtaque(poke2.getAtaque() + 3);
		}
	}
	
	public void vencedor(Treinador t1, Treinador t2) {
		if ((t1.getPoke().getResistencia() <= 0) && (t2.getPoke().getResistencia() <=0)){
			System.out.println("Empate!");
		} else if (t1.getPoke().getResistencia() <= 0) {
			System.out.println(t2.getNome() + "Venceu!");
		} else {
			System.out.println(t1.getNome() + "Venceu!");
		}
	}
}