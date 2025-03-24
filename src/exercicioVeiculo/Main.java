package exercicioVeiculo;

public class Main {

	public static void main(String[] args) {
		Carro corsinha = new Carro("Corsa", "corsinha", 2025, 300.00, 4);
		corsinha.exibirDetalhes();
		Moto factorzinha = new Moto("Factor", "Yamaha", 2010, 150.00, 125);
		factorzinha.exibirDetalhes();
	}
}