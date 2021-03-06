package Clases;
/**
 * Componente
 */
public class Componente {

    private Fabricante fabricante;
    private int Codigo_producto;
    private String Descripcion;
    private double PVP;

    public Componente(){}

    public Componente(int Codigo_producto,Fabricante fabricante, String Descripcion, double PVP){
        setFabricante(fabricante);
        setCodigo_producto(Codigo_producto);
        setDescripcion(Descripcion);
        setPVP(PVP);
    }

    public Fabricante getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public int getCodigo_producto() {
        return this.Codigo_producto;
    }

    public void setCodigo_producto(int Codigo_producto) {
        this.Codigo_producto = Codigo_producto;
    }

    public String getDescripcion() {
        return this.Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getPVP() {
        return this.PVP;
    }

    public void setPVP(double PVP) {
        this.PVP = PVP;
    }

    @Override
    public String toString(){
        return fabricante.toString() + Codigo_producto + " " + Descripcion + " Precio: " + PVP;
    }
}