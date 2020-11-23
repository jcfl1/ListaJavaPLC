import java.util.*;

public class Texto {
	private String texto;
	
	public Texto(String texto) {
		this.texto = texto;
	}
	
	public String getTexto() {
		return this.texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public void imprimirTexto() {
		System.out.println(this.getTexto());
	}
	
	private ArrayList<String> listaDePalavras() {
		
		String pontuacoes = "!?.,;";
		String strAux = this.getTexto();
		char pontuacaoAtual;
		
		for(int i=0; i<pontuacoes.length(); i++) {
			pontuacaoAtual = pontuacoes.charAt(i);
			strAux = strAux.replace(pontuacaoAtual, ' ');
		}
		
		String[] listaDePalavrasAux = strAux.split(" ");
		ArrayList<String> listaDePalavras = new ArrayList<String>();
		
		for(int i=0; i<listaDePalavrasAux.length; i++) {
			if(listaDePalavrasAux[i].length() > 0) {
				listaDePalavras.add(listaDePalavrasAux[i]);
			}
		}
		
		return listaDePalavras;
	}
	
	public int numeroPalavras() {
		
		ArrayList<String> listaDePalavras = this.listaDePalavras();
		return listaDePalavras.size();
	}
	
	public int frequenciaPalavra(String palavra) {
		ArrayList<String> listaDePalavras = this.listaDePalavras();
		
		int frequencia = 0;
		for(int i=0; i<listaDePalavras.size(); i++) {
			if(listaDePalavras.get(i).equalsIgnoreCase(palavra)) {
				frequencia++;
			}
		}
		
		return frequencia;
	}
	
	private boolean ehSeparador(char c) {
		if(c != '!' && c != '?' && c != '.' && c != ',' && c != ' ' && c != ';') return false;
		return true;
	}

	public Texto substituirPalavra(String palavraAntiga, String palavraNova){
		String novoTexto = "";
		String palavraAtual;
		String aux = this.getTexto();
		ArrayList<String> listaDePalavras = this.listaDePalavras();
		
		int j = 0, i = 0;
		while(i < aux.length()){
			
			if(ehSeparador(aux.charAt(i))){
				novoTexto += aux.charAt(i);
				i++;
			}

			else{
				
				palavraAtual = listaDePalavras.get(j);

				if(palavraAtual.equalsIgnoreCase(palavraAntiga)){
					novoTexto += palavraNova;
					i += palavraAtual.length();
				}
				else{
					novoTexto += palavraAtual;
					i += palavraAtual.length();
				}

				j++;
			}
		}

		Texto novoObjTexto = new Texto(novoTexto);
		return novoObjTexto;
	}
	
	public static void main(String args[]) {
		Texto salve = new Texto("Ola, testando!teste teste teste porta portaria porta-retrato portador porta");
		
		System.out.println("");
		System.out.println("Imprimindo o texto na tela:");
		salve.imprimirTexto();
		System.out.println("Numero de palavras do texto: " + salve.numeroPalavras());
		System.out.println("Ocorrencias da palavra 'teste': " + salve.frequenciaPalavra("teste"));

		Texto novo;
		novo = salve.substituirPalavra("porta", "door");
		
		System.out.println("");
		System.out.println("Novo texto, apos substituirmos a palavra 'porta' por 'door'");
		novo.imprimirTexto();

		// Obs: esse metodo substituirPalavra() substitui de fato uma palavra, e nao uma substring.

	}
	
}