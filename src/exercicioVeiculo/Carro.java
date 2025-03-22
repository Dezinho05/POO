package exercicioVeiculo;

public class Carro extends Veiculo implements Alugavel {
	
	private int quantidadePortas;
	
	public Carro(String modelo, String marca, int ano, double precoDiaria, int quantidadePortas) {
		super(modelo, marca, ano, precoDiaria);
		this.setQuantidadePortas(quantidadePortas);
	}
	
	private int getQuantidadePortas() {
		return quantidadePortas;
	}

	private void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	
	public void exibirDetalhes() {
		System.out.println(super.toString() + "\n" + toString());
	}
	
	public int calcularAluguel(int dias) {
		
		return 0;
	}
	
	public String toString() {
		return "Carro [quantidadePortas=" + getQuantidadePortas() + "]";
	}

}
