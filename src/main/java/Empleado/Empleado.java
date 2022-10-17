/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleado;

/**
 *
 * @author ochoa
 */
public class Empleado {

    String nombre;
    int horasTrabajadas;
    double costoHora;
    int yearIngreso;

    public String mostrarInfo() {
        var retorno = "El empleado se llama " + this.nombre + " entro en el año " + this.yearIngreso + " trabaja " + this.horasTrabajadas + " horas, pagamos cada hora con un costo de: " + this.costoHora + "$ ";

        return retorno;
    }

    public double calcularIngreso(int yearActual) {
        var retorno = 0.0d;
        var year = yearActual - this.yearIngreso;
        var extra = year * 0.2;
        var ingreso = this.costoHora * this.horasTrabajadas * extra;

        retorno = ingreso;

        return retorno;
    }

    public double calcularBonoHoras() {
        var retorno = 0.0d;
        if (this.horasTrabajadas > 160) {

            var hora = this.costoHora * this.costoHora;
            var extra = this.horasTrabajadas - 160;

            
            retorno = hora * extra;

        } else {

        }

        return retorno;
    }

    public double calcularImpuesto(int limite1, int limite2, int limite3) {

        var retorno = 0.0d;
        var impuesto = this.costoHora * this.horasTrabajadas;

        if (0 == limite1) {
            retorno = 0;
        } else {
            if (impuesto >limite1 && impuesto< limite2) {
                retorno = impuesto * 0.5;
            } else {
                if (impuesto >limite2 && impuesto< limite3) {
                    retorno = impuesto * 0.12;
                } else {
                    if (limite3 < impuesto) {
                        retorno = impuesto * 0.25;
                    } else {

                    }
                }
            }
        }

        return retorno;
    }

    public double calcularTotal(int limite1, int limite2, int limite3,int yearActual) {
        var retorno = 0.0d;

        var total = this.calcularIngreso(yearActual)+this.calcularBonoHoras();
        retorno = total - this.calcularImpuesto(limite1, limite2, limite3);
        
        return retorno;
    }

}
