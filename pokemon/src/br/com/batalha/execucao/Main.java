package br.com.batalha.execucao;
import br.com.batalha.partida.Partida;
import br.com.batalha.treinador.Treinador;

public class Main {

	public static void main(String[] args) {
		Treinador dreniodokappa = new Treinador("dreniodokappa");
		Treinador dududescekappa = new Treinador("dududescekappa");
		Partida partida = new Partida();
		
		dreniodokappa.Capturar();
		dreniodokappa.getPoke().pokedex();
		dududescekappa.Capturar();
		dududescekappa.getPoke().pokedex();
		partida.iniciarPartida(dreniodokappa, dududescekappa);
		partida.powerUp(dreniodokappa.getPoke(), dududescekappa.getPoke());
		
		while ((dreniodokappa.getPoke().getResistencia() > 0) && (dududescekappa.getPoke().getResistencia() > 0)) {
			dreniodokappa.Atacar(dududescekappa);
			dududescekappa.Atacar(dreniodokappa);
		}
		
		System.out.println(dreniodokappa.getPoke().getNome() +" "+ dreniodokappa.getPoke().getResistencia());
		System.out.println(dududescekappa.getPoke().getNome() +" "+ dududescekappa.getPoke().getResistencia());
		
		partida.vencedor(dreniodokappa, dududescekappa);
		
	}

}