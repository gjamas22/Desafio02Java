package br.gft;

public class Avi�o extends Veiculo {
	private String tipo;
	 private String uso;
	
	 public Avi�o(String modelo, int velocidade, int passageiros, int combustivel, String tipo, String uso) {
		super(modelo, velocidade, passageiros, combustivel);
		this.tipo = tipo;
		this.uso = uso;
	
	 }

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}
}
