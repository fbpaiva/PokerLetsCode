
public class Main {

	public static void main(String[] args) {	
		MyScanner scanner = new MyScanner();
		int numeroDeJogadores = 0;
		Poker poker = new Poker();
		Maco maco = new Maco();
		
		System.out.println("Quantos jogadores?");
		numeroDeJogadores = scanner.nextInt();
		
		for ( int i = 0 ; i< numeroDeJogadores ; i++){
			Jogador jogador = new Jogador("Jogador" + (i+1));
			poker.inserirJogador(jogador);
			poker.inserirCartaJogador(i, maco.sortear());
			poker.inserirCartaJogador(i, maco.sortear());
		}
		
		for ( int i = 0 ; i < 5; i++){
			poker.inserirCartaMesa(maco.sortear());
			poker.inserirCartaMesa(maco.sortear());
			poker.inserirCartaMesa(maco.sortear());
			poker.inserirCartaMesa(maco.sortear());
			poker.inserirCartaMesa(maco.sortear());
		}
		
		for(int i = 0; i < numeroDeJogadores; i++){
			Jogador jogador = poker.getJogador(i);
			System.out.println(jogador.getNome());
			
			Carta[] mao = jogador.getMao();
			
			for(int j = 0; j < mao.length; j++){
				System.out.print(mao[j] + " ");
			}
			System.out.println("");
		}
		
		Carta[] mesa = poker.getMesa();

		System.out.println("Mesa");
		for(int j = 0; j < mesa.length; j++){
			System.out.print(mesa[j] + " ");
		}
	}
}
