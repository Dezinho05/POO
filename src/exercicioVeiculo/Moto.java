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

	
	public double calcularAluguel(int dias) {
		return getPrecoDiaria() * dias;
	}
	
	public double calcularAluguel(int dias, float discount) {
		return (getPrecoDiaria() * dias) - discount;
	}
	
	
	public String toString(){
		return "Moto [Modelo:" + getModelo() + "Marca:" + getMarca() + "Ano:" + getAno() + "Diaria:" + getPrecoDiaria() + "Cilindradas:" + getCilindrada() + "]";
	}

	public void exibirDetalhes() {
		System.out.println(super.toString() + "\n" + toString());
	}
}