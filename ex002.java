package atv001;

import java.util.Scanner; //import do Scanner

public class ex002 {

	@SuppressWarnings("resource") //suprimir ou ignorar avisos do compilador 
	public static void main(String[] args) {
		// Novo Scanner
		
		Scanner ler = new Scanner(System.in);
		
		//variaveis
		
		int legis;   // Variavel da Legilação

		int psico;   // Variavel de Psicotecnica

        int direcao; // Variavel de Direcao
	

		// TITULO
        
		System.out.print(" \n VOCÊ PODE OBTER  UMA HABILITAÇÃO? (TESTE AGORA!)");

		// PERGUNTAS 

		System.out.print("\n Você passou pela psicotecnico: \n (1) Sim \n (2) NÃO \n Digite aqui:  ");
		psico = ler.nextInt();
		
		System.out.print("\n Você passou pela legislação: \n (1) Sim \n (2) NÃO \n Digite aqui:  ");
		legis = ler.nextInt();

        System.out.print("\n Você passou pela direção: \n (1) Sim \n (2) NÃO \n Digite aqui:  ");
		direcao = ler.nextInt();
		
		//if's

		if(psico == 1 && legis == 1 && direcao == 1){
            System.out.print("\n VOCÊ TEM TODAS AS CONDIÇÕES PARA TER UMA HABILITAÇÃO! "); // se a "psico, legis, direcao = 1" um aviso será escrito no console.
        }
		else {
			System.out.print("\n VOCÊ NÃO TEM TODAS AS CONDIÇÕES PARA TER UMA HABILITAÇÃO "); // se a var. "psico, legis, direcao" for diferente de "1" acionará um aviso no console.
		}
		
		}

}