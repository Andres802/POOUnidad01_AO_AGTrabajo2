/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Empleado;

/**
 *
 * @author ochoa
 */
public class Trabajo2 {

    public static void main(String[] args) {
        
        
        System.out.println("--------------------- Empleado --------------------");
        System.out.println("---------------------  1. Primer Empleado --------------------- ");
        var emple = new Empleado();
        
        emple.nombre = "Andres";
        emple.yearIngreso = 2002;
        emple.costoHora = 15;
        emple.horasTrabajadas = 60;
        
        System.out.println("-" + emple.mostrarInfo());
        System.out.println("- Su ingreso basico es: " + emple.calcularIngreso(2010) +" $");
        System.out.println("- Su bono de horas extras es: " + emple.calcularBonoHoras() + " $");
        System.out.println("-su pago de impuesto es: " + emple.calcularImpuesto(23, 0, 13) + " $");
        System.out.println("- El calculo total del empleado es: " + emple.calcularTotal(23, 0, 13, 2010) + " $");
        
        
        System.out.println("---------------------  2. Segundo Empleado --------------------- ");
        var emple1 = new Empleado();
        
        emple1.nombre = "Sebastian";
        emple1.yearIngreso = 2012;
        emple1.costoHora = 5;
        emple1.horasTrabajadas = 165;
        
        System.out.println("-" + emple1.mostrarInfo());
        System.out.println("- Su ingreso basico es: " + emple1.calcularIngreso(2022) +" $");
        System.out.println("- Su bono de horas extras es: " + emple1.calcularBonoHoras() + " $");
        System.out.println("-su pago de impuesto es: " + emple1.calcularImpuesto(1, 20, 13) + " $");
        System.out.println("- El calculo total del empleado es: " + emple1.calcularTotal(1, 20, 13, 2022) + " $");
        
        
        System.out.println("---------------------  3. Tercer Empleado --------------------- ");
        var emple2 = new Empleado();
        
        emple2.nombre = "Esteban";
        emple2.yearIngreso = 1999;
        emple2.costoHora = 13;
        emple2.horasTrabajadas = 80;
        
        System.out.println("-" + emple2.mostrarInfo());
        System.out.println("- Su ingreso basico es: " + emple2.calcularIngreso(2015) +" $");
        System.out.println("- Su bono de horas extras es: " + emple2.calcularBonoHoras() + " $");
        System.out.println("-su pago de impuesto es: " + emple2.calcularImpuesto(1, 0, 23) + " $");
        System.out.println("- El calculo total del empleado es: " + emple2.calcularTotal(1, 0, 23, 2015) + " $");
    }
}
