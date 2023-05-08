package entities;

public class Student {
	
	private String name;
	private Integer idade;
	private Double[] notas;
	
	public Student() {}

	public Student(String name, Integer idade, Double[] notas) {
		this.name = name;
		this.idade = idade;
		this.notas = notas;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double[] getNotas() {
		return notas;
	}

	public void setNotas(Double[] notas) {
		this.notas = notas;
	}
	
	
	public double media( Student s){

		double soma =0;
		for (int i =0; i<notas.length;i++) {
			soma+=notas[i];
		}
	
		return soma/notas.length;
	}
}
