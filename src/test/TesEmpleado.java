
package test;

import Dominio.Persona;
import Dominio.Fechaempleado;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class TesEmpleado {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        Fechaempleado fNacimiento;
        Fechaempleado fIngreso;
        Persona empleado1;
        int anio,mes,dia;
        String nombre;
        System.out.println("Ingrese el nombre de la persona(Empleado)");
        nombre =  entrada.nextLine();
        System.out.println("Fecha de nacimiento del empleado");
        System.out.printf("Año: ");
        anio=entrada.nextInt();
        System.out.printf("Mes: ");
        mes=entrada.nextInt();
        System.out.printf("Dia: ");
        dia=entrada.nextInt();
        fNacimiento = new Fechaempleado(anio,mes,dia);
        System.out.println("Fecha de Ingreso del empleado a la Empresa");
        System.out.printf("Año: ");
        anio=entrada.nextInt();
        System.out.printf("Mes: ");
        mes=entrada.nextInt();
        System.out.printf("Dia: ");
        dia=entrada.nextInt();
        fIngreso = new Fechaempleado(anio,mes,dia);
        empleado1 =new Persona(nombre,fNacimiento,fIngreso);
        System.out.println("\n Resumen de los datos Ingresados");
        System.out.println(empleado1);
        System.out.println("\n * Segun la fecha de nacimiento :");
        EdadNacimiento(fNacimiento);
        System.out.println("\n * Segun la fecha de ingreso");
        EdadIngreso(fIngreso);
    }
    public static void EdadNacimiento(Fechaempleado fNacimiento){
        int anio=fNacimiento.getAnio();
        int mes=fNacimiento.getMes();
        int dia=fNacimiento.getDia();
        Period p = Period.between(LocalDate.of(anio,mes,dia), LocalDate.now());
        System.out.printf("El empleado tiene : %d años, %d meses, %d días \n",  p.getYears(), p.getMonths(), p.getDays());
}
    public static void EdadIngreso(Fechaempleado fIngreso){
        int anio=fIngreso.getAnio();
        int mes=fIngreso.getMes();
        int dia=fIngreso.getDia();
        Period p = Period.between(LocalDate.of(anio,mes,dia), LocalDate.now());
        System.out.printf("El empleado trabaja en la empresa : %d años, %d meses, %d días \n",  p.getYears(), p.getMonths(), p.getDays());
    }
}
