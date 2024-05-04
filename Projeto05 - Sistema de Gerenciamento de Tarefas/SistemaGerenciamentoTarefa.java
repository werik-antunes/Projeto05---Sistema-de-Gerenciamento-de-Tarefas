package sistemaGerenciamentoTarefa;

import java.util.ArrayList;

import java.util.Scanner;

public class SistemaGerenciamentoTarefa {

	public static void main(String[] args) {
		ArrayList<Tarefa> tarefas = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("Menu:");
			System.out.println("1) Adicionar tarefa");
			System.out.println("2) Mostrar todas as tarefas");
			System.out.println("3) Marcar tarefa como concluida");
			System.out.println("4) Sair.....");
			System.out.println("Escolha uma opção");
			int opcao = sc.nextInt();

			if (opcao == 1) {
				System.out.println("Digite a descrição da tarefa: ");
				String descricao = sc.nextLine();

				Tarefa tarefa = new Tarefa(descricao);
				tarefas.add(tarefa);
				System.out.println("Tarefa adicionada com sucesso!");

			} else if (opcao == 2) {
				System.out.println("Tarefa:");
				for (int i = 0; i < tarefas.size(); i++) {
					System.out.println((i + 1) + "." + tarefas.get(i));
				}
			} else if (opcao == 3) {
				System.out.println("Digite o número da tarefa que deseja marcar como concluída: ");
				int numTarefa = sc.nextInt();
				if (numTarefa >= 1 && numTarefa <= tarefas.size()) {
					Tarefa tarefa = tarefas.get(numTarefa - 1);
					

					System.out.println("Tarefa marcada como concluída com sucesso!");

				} else {

					System.out.println("Número de tarefa inválido.");

				}

			} else if (opcao == 4) {

				System.out.println("Saindo...");

				break;

			} else {

				System.out.println("Opção inválida. Tente novamente.");

			}

		}

	}

}
