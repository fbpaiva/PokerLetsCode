import java.util.ArrayList;

public class Poker {
	ArrayList<Jogador> jogadores = new ArrayList();
	private Carta mesa[] = new Carta[5];

	public void inserirCartaMesa(Carta carta){
		for(int i = 0; i < mesa.length; i++){
			if(mesa[i] == null){
				mesa[i] = carta;
				return;
			}
		}
	}

	public void inserirCartaJogador(int posicao, Carta carta){
		Jogador jogador = jogadores.get(posicao);
		jogador.inserirCarta(carta);
	}

	public void inserirJogador(Jogador jogador){
		jogadores.add(jogador);
	}

	public Jogador getJogador(int posicao){
		return jogadores.get(posicao);
	}

	public Carta[] getMesa(){
		return mesa;
	}
}
