
package Dominio;

public class Empleado {
  private String nombre;
  private Fecha fechaN;
  private Fecha fechaI;

    public Empleado(String nombre, Fecha fechaN, Fecha fechaI) {
        this.nombre = nombre;
        this.fechaN = fechaN;
        this.fechaI = fechaI;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getFechaN() {
        return fechaN;
    }

    public Fecha getFechaI() {
        return fechaI;
    }
  @Override
   public String toString (){
        return "Nombre : "+this.getNombre()+"\nFecha de nacimiento: "+this.getFechaN()+"\nFecha de ingreso: "+this.fechaI;
   }
}
