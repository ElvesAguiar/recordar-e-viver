package entities;

public class Circle {
	private double raio;

	public Circle() {
	};

	public Circle(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double area() {
		return Math.PI * raio * raio;
	}
}
