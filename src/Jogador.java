
public class Jogador {

	private String nome;
	private Carta jogador[] = new Carta[2];

	public void inserirCarta(Carta carta) {
		int posicao = jogador.length-1;
		jogador[posicao] = carta;
	}
	
    public Jogador (String umNome) {
    	nome = umNome;
    }
    
    public Carta[] getMao(){
    	return jogador;
    }
    
    public String getNome(){
    	return nome;
    }
}
