package atv001;

import java.util.Scanner; //import do Scanner

public class ex002 {

	@SuppressWarnings("resource") //suprimir ou ignorar avisos do compilador 
	public static void main(String[] args) {
		// Novo Scanner
		
		Scanner ler = new Scanner(System.in);
		
		//variaveis
		
		int legis;   // Variavel da Legila��o

		int psico;   // Variavel de Psicotecnica

        int direcao; // Variavel de Direcao
	

		// TITULO
        
		System.out.print(" \n VOC� PODE OBTER  UMA HABILITA��O? (TESTE AGORA!)");

		// PERGUNTAS 

		System.out.print("\n Voc� passou pela psicotecnico: \n (1) Sim \n (2) N�O \n Digite aqui:  ");
		psico = ler.nextInt();
		
		System.out.print("\n Voc� passou pela legisla��o: \n (1) Sim \n (2) N�O \n Digite aqui:  ");
		legis = ler.nextInt();

        System.out.print("\n Voc� passou pela dire��o: \n (1) Sim \n (2) N�O \n Digite aqui:  ");
		direcao = ler.nextInt();
		
		//if's

		if(psico == 1 && legis == 1 && direcao == 1){
            System.out.print("\n VOC� TEM TODAS AS CONDI��ES PARA TER UMA HABILITA��O! "); // se a "psico, legis, direcao = 1" um aviso ser� escrito no console.
        }
		else {
			System.out.print("\n VOC� N�O TEM TODAS AS CONDI��ES PARA TER UMA HABILITA��O "); // se a var. "psico, legis, direcao" for diferente de "1" acionar� um aviso no console.
		}
		
		}

}