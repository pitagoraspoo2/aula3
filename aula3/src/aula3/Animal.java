package aula3;

public class Animal {
	
	private String nome;
	private String cor;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		
		if (idade > 20) {
			this.idade = 20;
		}else {
			this.idade = idade;
		}		
		
	}
	
	public String comer() {
		return "animal comendo";
	}
	
	public Animal(String nome, String cor, int idade) {		
		this.nome = nome;
		this.cor = cor;
		setIdade(idade);
	}
	
	
	
	public static void main(String[] args) {
		Animal a = new Animal("Toto", "azul", 35);
		
		System.out.println(a.getIdade());
		System.out.println(a.comer());
		
		
	}
	

}
