package br.gft;

public class Main {

	public static void main(String[] args) {
		
		Carro c1 = new Carro ("Jeep Renegate",40,5,100,"Jeep",4,2014 );
		System.out.println("----------------------------------------");
		System.out.println("O modelo do seu carro é " + c1.getModelo());
		System.out.println("Sua velocidade é de " + c1.getVelocidade() + " km por hora");
		System.out.println("O carro tem :" + c1.getPassageiros() + " passageiros");
		System.out.println("O combustivel é de: " + c1.getCombustivel() + " litros");
		System.out.println("A marca do carro é : " +c1.getMarca());
		System.out.println("O carro possue : " + c1.getPortas() + " portas");
		System.out.println("O ano do carro é : " + c1.getAnos());
	
	    Avião c2 = new Avião ("Boing 707",890,100,1000,"para turismo","comercial");
	    System.out.println("------------------------------------------");
	    System.out.println("O modelo do avião é " + c2.getModelo());
	    System.out.println("A velocidade do avião é " + c2.getVelocidade() + " km por hora");
	    System.out.println("O avião possue " + c2.getPassageiros() +" passageiros");
	    System.out.println("O avião possue " + c2.getCombustivel() + " litros de gasolina");
	    System.out.println("O tipo do avião é " + c2.getTipo());
	    System.out.println("O uso do avião é para " + c2.getUso());
	    
	    Veiculo c3 = new Veiculo ("Moto",50,1,100);
	    System.out.println("--------------------------------------------");
	    System.out.println("Seu veiculo é uma :" + c3.getModelo());
	    System.out.println("Sua velocidade é de : " + c3.getVelocidade() + " km  por hora");
	    System.out.println("Possue " + c3.getPassageiros() + " passageiro");
	    System.out.println("Seu tanque está com: " + c3.getCombustivel() + "litros");
	}
	
}
