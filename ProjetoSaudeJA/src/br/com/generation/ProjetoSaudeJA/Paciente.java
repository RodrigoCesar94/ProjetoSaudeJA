package br.com.generation.ProjetoSaudeJA;

import java.util.Scanner;

public class Paciente implements InterfacePaciente { // implementa??o dos m?todos presentes na interface.
    // declara??o de vari?veis
	private String nome;
	private int   idade;
	Scanner resposta = new Scanner(System.in); // Cria??o do Scanner, para leitura do Console.d
	
	// cria??o de getters and setter, encapsulamento.
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	//Cria??o dos m?todos.
	@Override
	public int pergunta1() {
		int pgt1;
		System.out.println("Voc? est? ou esteve com altera??o do olfato ou paladar ? \n escolha 1 - SIM | 0 - N?O");
		pgt1 = resposta.nextInt();		
		return testaResposta(pgt1);
	}
	
	@Override
	public int pergunta2() {
		int  pgt2;	
		System.out.println("Voc? est? ou esteve com dor de cabe?a ? \n  escolha 1 - SIM | 0 - N?O");
		pgt2 = resposta.nextInt();	
		return testaResposta(pgt2);
		
	}
	@Override
	public int pergunta3() {
	    int pgt3;
		System.out.println("Voc? est? ou esteve com febre ?  \n escolha 1 - SIM | 0 - N?O");
		pgt3 = resposta.nextInt();		
		return testaResposta(pgt3);
	}
	@Override
	public int pergunta4() {
		
        int pgt4;
		System.out.println("Voc? est? ou esteve com tosse seca ? \n escolha 1 - SIM | 0 - N?O");
		pgt4 = resposta.nextInt();		
		return testaResposta(pgt4);			
	}	
	@Override
	public int pergunta5() {
		int pgt5;
		System.out.println("Voc? est? ou esteve com Falta de ar ? \n Escolha 1 - SIM | 0 - N?O");
		pgt5 = resposta.nextInt();		
		return testaResposta(pgt5);
	}
	@Override
	public String pergunta6() {
		String nome;
		System.out.println("Qual seu nome ?");
		nome = resposta.next();
		resposta.nextLine();
		return nome;
		
	}
	@Override
	public int pergunta7() {
		int idade;
		System.out.println("Qual sua idade ?");
		idade = resposta.nextInt();
		return idade;
		
	}
	@Override
	public int testaResposta(int pgt) {
	while(pgt>1||pgt<0) {
				System.out.println("Erro, digite novamente: ");
				pgt = resposta.nextInt();
				
			}
			return pgt;
		  }
	}
	
      
	



