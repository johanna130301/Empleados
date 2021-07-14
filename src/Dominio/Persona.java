
package Dominio;

public class Persona {
  private String nombre;
  private Fechaempleado fechaN;
  private Fechaempleado fechaI;

    public Persona(String nombre, Fechaempleado fechaN, Fechaempleado fechaI) {
        this.nombre = nombre;
        this.fechaN = fechaN;
        this.fechaI = fechaI;
    }

    public String getNombre() {
        return nombre;
    }

    public Fechaempleado getFechaN() {
        return fechaN;
    }

    public Fechaempleado getFechaI() {
        return fechaI;
    }
  @Override
   public String toString (){
        return "Nombre : "+this.getNombre()+"\nFecha de nacimiento: "+this.getFechaN()+"\nFecha de ingreso: "+this.fechaI;
   }
}
