
public class Jogador {

	private String nome;
	private Carta cartas[] = new Carta[2];

	public void inserirCarta(Carta carta) {
		for(int i = 0; i < cartas.length; i++){
			if(cartas[i] == null){
				cartas[i] = carta;
				return;
			}
		}
	}

    public Jogador (String umNome) {
    	nome = umNome;
    }

    public Carta[] getMao(){
    	return cartas;
    }

    public String getNome(){
    	return nome;
    }
}
