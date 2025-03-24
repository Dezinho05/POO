package exercicioVeiculo;

public abstract class Veiculo {
	private String modelo;
	private String marca;
	private int ano;
	private double precoDiaria;

	public Veiculo(String modelo, String marca, int ano, double precoDiaria) {
		super();
		setModelo(modelo);
		setMarca(marca);
		setAno(ano);
		setPrecoDiaria(precoDiaria);

	}

	public String getModelo(){
		return modelo;
	}

	public void setModelo(String modelo){
		this.modelo = modelo;
		System.out.println("Modelo inserido.");
	}

	public String getMarca(){
		return marca;
	}

	public void setMarca(String marca){
		this.marca = marca;
		System.out.println("Marca inserida.");
	}

	public int getAno(){
		return ano;
	}

	public void setAno(int ano){
		this.ano = ano;
		System.out.println("Ano inserido.");
	}

	public double getPrecoDiaria(){
		return precoDiaria;
	}

	public void setPrecoDiaria(double precoDiaria){
		if(precoDiaria < 0) {
			System.out.println("Valor inválido, insira um valor positivo.");
		}else{
			this.precoDiaria = precoDiaria;
			System.out.println("Valor inserido com sucesso!");
		}
	}

	public String toString() {
		return "Informacoes do veiculo: [Modelo=" + getModelo() + ", Marca=" + getMarca() + " , Ano=" + getAno()
				+ " , Preco da diaria=" + getPrecoDiaria() + "]";
	}

	public abstract void exibirDetalhes();
		//System.out.println(this.toString());
}
