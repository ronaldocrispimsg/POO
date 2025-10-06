public class Retangulo{
       double comprimento = 1.0;
       double largura = 1.0;

       public double perimetro(double comprimento, double area){
       		double pMetro = 2 * (comprimento + largura);
       		return pMetro;
       }

       public double area(double comprimento, double area){
       		double mArea = comprimento * largura;
       		return mArea;
       }
}

