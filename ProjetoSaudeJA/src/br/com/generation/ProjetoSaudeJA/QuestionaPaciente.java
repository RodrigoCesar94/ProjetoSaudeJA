package br.com.generation.ProjetoSaudeJA;

public class QuestionaPaciente extends Paciente  {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente(); // cria??o do objeto p1, que herda classe paciente.
		int soma = 0;String risco = null;//Declara??o de vari?veis
	
		
	System.out.println("Ol? ! 91% das pessoas com COVID apresentam sintomas, com base nos seus simtomas "
			+ "indicaremos \n o melhor curso de a??o para voc?. Vamos Come?ar ? \n");// Mensagem inicial
			
	//Atribuindo valores as vari?veis atrav?s de objeto.		
	String pgt6 = p1.pergunta6(); 
	int pgt7 = p1.pergunta7();
	int pgt1 = p1.pergunta1();
	int pgt2 = p1.pergunta2();
	int pgt3 = p1.pergunta3();
	int pgt4 = p1.pergunta4();
	int pgt5 = p1.pergunta5();
	
	// determina??o da soma das respostas 0 e 1, das perguntas 1 a 5, relacionadas aos sintomas. 
	soma = pgt1+pgt2+pgt3+pgt4+pgt5;
	
	// sa?da do c?digo
	if (pgt7 >= 60) {
		risco = ", voc? est? no grupo de risco para sua idade | \n ";
	} else {
		risco = ", voc? n?o est? no grupo de risco para sua idade | \n  ";
	}

	if(soma>=2) {
		System.out.println(pgt6+risco+"\nVoc? possui os principais sintomas da COVID que o diferem de uma gripe comum, procure"
				+ " um m?dico imediatamente. ");
	}
	if(soma==1) {
		System.out.println(pgt6+risco+"\nVoc? possui um sintoma dentre os principais que diferem de uma gripe comum. "
				+ "\nConv?m realizar um teste e ajuda m?dica para tratamento deste sintoma");
	}
	if(soma<1) {
		System.out.println(pgt6+risco+"N?o possui nenhum sintoma. ? importante permanecer em casa, e continuar com \nas medidas"
				+ " de prote??o. Use m?scara, ?lcool em gel e vacine-se");
	}
	System.out.println("\nObrigado por utilizar o Sa?deJA!!");
	System.out.println(soma);
	}

    
	}
	

	
		
	


