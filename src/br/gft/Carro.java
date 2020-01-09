package br.gft;

public class Carro extends Veiculo {
	private String marca;
	private int portas;
	private int anos;
	
	public Carro(String modelo, int velocidade, int passageiros, int combustivel, String marca, int portas, int anos) {
		super(modelo, velocidade, passageiros, combustivel);
		this.marca = marca;
		this.portas = portas;
		this.anos = anos;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public int getAnos() {
		return anos;
	}

	public void setAnos(int anos) {
		this.anos = anos;
	}
}
