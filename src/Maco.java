import java.util.ArrayList;

public class Maco {
	public String[] valoresDisponiveis = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	public String[] naipesDisponiveis = {"P", "C", "E", "O"}; 
	
	ArrayList<Carta> maco = new ArrayList<>();
	
	public Maco(){
		//inicializar um maço com todas as cartas disponível
		
		
	}
	
	public void embaralhar(){
		//embaralha as cartas disponíveis
	}
	
	public Carta sortear(){
		return new Carta("1","2");
	}
	
}
