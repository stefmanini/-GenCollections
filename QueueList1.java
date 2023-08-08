package JavaS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> filaClientes = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);

		int opcao = -1;
		while (opcao != 0) {
			System.out.println("Menu:");
			System.out.println("1: Adicionar um novo Cliente na fila");
			System.out.println("2: Listar todos os Clientes na fila");
			System.out.println("3: Chamar (retirar) uma pessoa da fila");
			System.out.println("0: Sair do programa");
			System.out.print("Escolha uma opção: ");

			opcao = scanner.nextInt();
			scanner.nextLine(); // Limpar o buffer

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do Cliente: ");
				String nomeCliente = scanner.nextLine();
				filaClientes.offer(nomeCliente); // Adicionar à fila
				System.out.println("Cliente adicionado à fila.");
				break;
			case 2:
				System.out.println("Clientes na fila:");
				for (String cliente : filaClientes) {
					System.out.println(cliente);
				}
				break;
			case 3:
				if (!filaClientes.isEmpty()) {
					String clienteChamado = filaClientes.poll(); // Retirar da fila
					System.out.println("Cliente chamado: " + clienteChamado);
				} else {
					System.out.println("A fila está vazia.");
				}
				break;
			case 0:
				System.out.println("Programa finalizado.");
				break;
			default:
				System.out.println("Opção inválida. Escolha novamente.");
				break;
			}
		}

		scanner.close();
	}
}
