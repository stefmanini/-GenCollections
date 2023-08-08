package JavaS;

import java.util.Scanner;
import java.util.Stack;

public class Pilha1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos da Classe String,
		// para organizar a retirada de livros em uma pilha. O programa deverá ter um
		// Menu que aceitará as opções 0, 1, 2 e 3:
//			1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
//			2: Listar todos os livros da Pilha
//			3: Retirar um livro da pilha 
//			0: O programa deve ser finalizado. 
//			Caso a pilha esteja vazia e o atendente tente retirar um livro da pilha, ele deverá informar que a pilha está vazia.

		Stack<String> pilha = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		int resposta;
		String livro;

		do {
            System.out.println("\n\tEscolha uma opção:");
            System.out.println("1: Adicionar um novo livro na pilha");
            System.out.println("2: Listar todos os livros da pilha");
            System.out.println("3: Retirar um livro da pilha");
            System.out.println("0: Finalizar programa");
		resposta = leia.nextInt();
		leia.nextLine();

		switch (resposta) {
		case 1:
			System.out.println("Escreva  nome do livro: ");
			livro = leia.nextLine();
			pilha.push(livro);
			break;
		case 2:
			System.out.println("\nListando todos os livros da pilha: " + pilha);
			break;
		case 3: 
			if (pilha.isEmpty()) {
				System.out.println("A pilha está vazia.");
				break;
			}
			System.out.println("Escreva o nome do livro que quer excluir: ");
			livro = leia.nextLine();

			if (pilha.contains(livro)) {
				pilha.remove(livro);
				System.out.println("\nLivro retirado da pilha: " +livro);
				break;
			} else
				System.out.println("Não encontramos o livro citado." + livro);
			break;
		case 0:
			System.out.println("Finalizando o programa.");
			break;
		default:
			System.out.println("\nOpção inválida!!!");
		}
		 } while (resposta != 0);
		leia.close();

	}

}
