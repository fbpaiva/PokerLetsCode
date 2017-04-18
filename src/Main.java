
public class Main {

	public static void main(String[] args) {	
		MyScanner scanner = new MyScanner();
		int numeroDeJogadores = 0;
		Poker poker = new Poker();
		Maco maco = new Maco();
		
		System.out.println("Quantos jogadores?");
		numeroDeJogadores = scanner.nextInt();
		
		for ( int i = 1 ; i<= numeroDeJogadores ; i++){
			Jogador jogador = new Jogador("Jogador" + i);
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
	}
}
