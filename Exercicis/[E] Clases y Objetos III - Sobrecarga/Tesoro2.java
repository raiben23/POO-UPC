
/**
 * Joc_Tresor 3: Implementació de modificacions Sobrecàrrega de constructors i métodes
 *
 */

public class Tesoro2{
    
    private String Descripcion;
    private int Altura;
    private double Valor;
    

    private static double  Limite_valor = 150;
	
	public Tesoro2(){};
    
    public Tesoro2(String D,int A, Double V) {
        this.setDescripcion(D);
        this.setAltura(A);
        this.setValor(V); 
    }

    public String getDescripcion(){
        return Descripcion;
    }
    public int getAltura(){
        return Altura;
    }
    public double getValor(){
        return Valor;
    }
    public double getLimite_valor(){
        return Limite_valor;
    }

    public void setDescripcion(String D){
        Descripcion = D;
    }
    public void setAltura(int A){
        Altura = A;
    }
    public void setValor(double V){
        if (V>0) Valor = V;
    }
    


    public void ActuTesoro(String D, double V){
        this.setDescripcion(D);
        this.setValor(V);
    }

    public boolean esValioso(){
        return Valor>=Limite_valor;

    }
	
	public boolean esMasValioso(Tesoro2 t){             // Metodo sobrecargado
		return this.Valor>t.getValor();
	}
	
	public boolean esMasValioso(Double valor){          // Metodo sobrecargado
		return this.Valor>valor;
	}

}