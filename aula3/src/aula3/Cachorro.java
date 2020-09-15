package aula3;

public class Cachorro extends Animal {

	public String raca;
	

	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}

	

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return super.comer() + ", mas sou um cachorro";
	}


	public Cachorro(String nome, String cor, int idade, String raca) {
		super(nome, cor, idade);
		this.raca = raca;
	}
	
	

	@Override
	public String toString() {
		return "Olá eu sou o " + getNome() + " sou da cor " + getCor() + " e da raça " + getRaca();
	}


	public static void main(String[] args) {
		Cachorro dog = new Cachorro("rex", "verde", 5, "poodle");
		
		System.out.println(dog);
		
	}
	
	
	

}
