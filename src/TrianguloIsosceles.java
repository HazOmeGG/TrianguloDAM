/**
 * Created by 47974952B on 20/12/2016.
 */
public class TrianguloIsosceles {

    private double base;
    private double lado;
    private String nombre;
    private String color;

    public TrianguloIsosceles (String nombre, double base, double lado, String color){

        this.base = base;
        this.lado = lado;
        this.nombre = nombre;
        this.color = color;

    }

    //-------Getter--------

    public double getBase() {
        return base;
    }

    public double getLado() {
        return lado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    //------Setter-------

    public void setBase(double base) {
        this.base = base;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public double CalcularAltura() {
        double a = Math.pow(base / 2, 2);
        double b = Math.pow(lado, 2);
        double altura = Math.sqrt(b - a);
        return altura;
    }


    public double CalcularArea(){
        return (base * CalcularAltura()) / 2;
    }

    public double CalcularPerimetro() {
        return base + (2*lado);
    }

    @Override
    public String toString() {
        return "TrianguloIsosceles{" +
                ", nombre='" + nombre + '\'' +
                ", base='" + base + '\'' +
                ", lado='" + lado + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}
