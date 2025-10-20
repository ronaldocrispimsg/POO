public class Quadrado{
	
	Double lado;

	public double calculaArea(double lado){
       		double area = 4 * lado;
       		return area;
    }
    
	public double calculaPerimetro(double lado){
       		double perimetro = lado * lado;
       		return perimetro;
    }

	public Quadrado(Double ladoQuadrado){
		lado  = ladoQuadrado;
	}
}