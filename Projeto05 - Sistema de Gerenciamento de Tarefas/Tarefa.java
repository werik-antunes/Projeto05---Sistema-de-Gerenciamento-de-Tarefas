package sistemaGerenciamentoTarefa;

public class Tarefa {
	private String descricao;
	private boolean concluida;

	public Tarefa(String descricao) {

		this.descricao = descricao;
		this.concluida = false;

	}

	public String getDescricao() {
		return descricao;
	}

	public boolean getConcluida() {
		return concluida;
	}

	@Override

	public String toString() {

		return "Tarefa{" + "descricao='" + descricao + '\'' + ", concluida=" + concluida + '}';

	}

}
