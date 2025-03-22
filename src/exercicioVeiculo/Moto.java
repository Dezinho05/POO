package exercicioVeiculo;

public class Moto extends Veiculo implements Alugavel{
	
	private int cilindrada;
	
	public Moto(String modelo, String marca, int ano, double precoDiaria, int cilindrada) {
		super(modelo, marca, ano, precoDiaria);
		setCilindradas(cilindrada);
	}
	
	private int getCilindrada() {
		return cilindrada;
	}

	private void setCilindradas(int cilindrada){
		this.cilindrada = cilindrada;
	}

	public void exibirDetalhes() {
		System.out.println(super.toString() + "\n" + toString());
	}
	
	public int calcularAluguel(int dias) {
		return 0;
	}

	public String toString(){
		return "Moto [cilindradas =" + getCilindrada() + "]";
	}
}
