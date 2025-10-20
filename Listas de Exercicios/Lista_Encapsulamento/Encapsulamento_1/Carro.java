public class Carro{
	private Double combustivel;
	private Double quilometragem = 0.0;

	public Carro(Double combustivel){
		if(combustivel > 0.0){
			this.combustivel = combustivel;
		}else{
        	this.combustivel = 0.0;
        }
	}

	public Double getCombustivel(){
        return combustivel;
    }

    public void setCombustivel(Double combustivel){
        if(combustivel >= 0){
            this.combustivel = combustivel;
        }
    }

    public Double getQuilometragem(){
        return quilometragem;
    }

    public void setQuilometragem(Double quilometros){
        if(quilometros >= 0){
            this.quilometragem = quilometros;
        }
    }

	public void abastecer(Double litros){
        if(litros > 0){
            combustivel += litros;
        }
    }

	public Double autonomia(){
        return combustivel * 12;
    }

    public void percorrerDistancia(int distancia){
	    Double gasto = distancia / 12.0;

	    if(gasto <= combustivel){
	        quilometragem += distancia;
	        combustivel -= gasto;
	    }else{
	        System.out.println("Combustível insuficiente para percorrer esta distância.");
    	}
    }
}
