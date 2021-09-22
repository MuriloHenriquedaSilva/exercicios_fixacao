package triangulo;

public class Triangulo {

    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double anguloAB;
    private double anguloBC;
    private double anguloCA;

    public void setLadoA(double ladoA) {
	this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
	this.ladoB = ladoB;
    }

    public void setLadoC(double ladoC) {
	this.ladoC = ladoC;
    }

    public void setAnguloAB(double anguloAB) {
	this.anguloAB = anguloAB;
    }

    public void setanguloBC(double anguloBC) {
	this.anguloBC = anguloBC;
    }

    public void setAnguloCA(double anguloCA) {
	this.anguloCA = anguloCA;
    }

    public double getLadoA() {
	return this.ladoA;
    }

    public double getLadoB() {
	return this.ladoB;
    }

    public double getLadoC() {
	return this.ladoC;
    }

    public double getAnguloAB() {
	return this.anguloAB;
    }

    public double getAnguloBC() {
	return this.anguloBC;
    }

    public double getAnguloCA() {
	return this.anguloCA;
    }

    public boolean validarTriangulo() {
	return this.ladoA < this.ladoB + this.ladoC && this.ladoB < this.ladoA + this.ladoC && this.ladoC < this.ladoA + this.ladoB && this.anguloAB + this.anguloBC + this.anguloCA == 180 && this.anguloAB > 0 && this.anguloBC > 0 && this.anguloCA > 0;
    }

    public String classificarLado() {
	if (this.ladoA == this.ladoB && this.ladoB == this.ladoC) {
	    return "Equilátero";
	} else if (this.ladoA != this.ladoB && this.ladoB != this.ladoC && this.ladoC != this.ladoA) {
	    return "Escaleno";
	}
	return "Isósceles";
    }

    public String classificarAngulo() {
	if (this.anguloAB > 90 || this.anguloBC > 90 || this.anguloCA > 90) {
	    return "Obtusângulo";
	} else if (this.anguloAB < 90 && this.anguloBC < 90 && this.anguloCA < 90) {
	    return "Acutângulo";
	}
	return "Retângulo";
    }

    public String toString() {
	return "\n"
		+ "Medidas dos lados\n"
		+ "A: " + this.ladoA + "\n"
		+ "B: " + this.ladoB + "\n"
		+ "C: " + this.ladoC + "\n"
		+ "Medidas dos ângulos\n"
		+ "AB: " + this.anguloAB + "\n"
		+ "BC: " + this.anguloBC + "\n"
		+ "CA: " + this.anguloCA + "\n"
		+ "Classificação de lado: " + this.classificarLado() + "\n"
		+ "Classificação de ângulo: " + this.classificarAngulo();
    }
}
