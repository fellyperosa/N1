

	import java.util.Random;
import java.util.Scanner;
public class Principal {
	
	        public static void main (String args []){ 
	        	
	        	Scanner leitor = new Scanner (System.in);
	        	Random gerador = new Random();
	        	
	        	System.out.println("ok, vamos jogar 5 rodadas");
	        	System.out.println("Escolha entre 0, 1 e 2 , sendo : ");
				System.out.println("Pedra = 0 ");
				System.out.println("Papel = 1  ");
				System.out.println("Tesoura = 2 :");
	        	
	        	
	        	int numeroUsuario;
	        	int escolhaComputador;
	        	int pontosUsuario = 0;
	        	int pontosComputador = 0;
	        	
		        	for(int i = 0; i < 5; i++) {  //Coloquei com 5 rodadas,para se ter um resultado por rodada, ao invez de resultado por jogo...
		        	numeroUsuario = leitor.nextInt();
		        	escolhaComputador = gerador.nextInt(3) + 1;
		        	
		        	
		        	switch(escolhaComputador) {// foi a forma mais simples que encontrei para mostrar as escolhas de cada participante...
		        	case 1:
		        		System.out.println("Computador escolheu papel");
		        		break;
		        	case 2:
		        		System.out.println("Computador escolheu pedra");
		        		break;
		        	case 3:
		        		System.out.println("Computador escolheu tesoura");
		        		break;
		        		
		        	}
		        	switch(numeroUsuario) {// foi a forma mais simples que encontrei para mostrar as escolhas de cada participante...
		        	case 1:
		        		System.out.println("Voçê escolheu papel");
		        		break;
		        	case 2:
		        		System.out.println("Voçê escolheu pedra");
		        		break;
		        	case 3:
		        		System.out.println("Voçê escolheu tesoura");
		        		break;
		        	}
		        	
		        	if(numeroUsuario == escolhaComputador) {
		        		System.out.println("Rodada empatada");
		        	}
		        	else if((numeroUsuario - escolhaComputador) == -1 ||
		        			(numeroUsuario - escolhaComputador) == 2){
		        		System.out.println("Voçê venceu esta rodada");
		        		pontosUsuario++;// abreviacao para pontosUsuarios = pontosUsuarios +1
		        	}
		        	else {
		        		System.out.println("Computador Venceu esta rodada");
		        		pontosComputador++;//abreviacao para pontosComputador = pontosComputador +1
		        	}
		        	}
		        	if(pontosUsuario> pontosComputador) {
		        		System.out.println("Voçê foi o vencedor do jogo!");
		        	}
		        	else if(pontosUsuario< pontosComputador) {
		        		System.out.println("Computador foi o vencedor do jogo!");
		        }
		        	else {
		        		System.out.println("Empate entre jogadores!");
		        	}
		        }
}
				
	