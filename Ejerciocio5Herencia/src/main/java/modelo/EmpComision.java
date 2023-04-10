/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ESTUDIANTES
 */
public class EmpComision {
    
    public class EmpleadosPorComision extends Empleado {
    double salario=2500000;
    double porcentaje;
    public EmpleadosPorComision(String n, int id, double sal,double por) {
        super(n, id);
   
        salario=sal;
        porcentaje=por;
    }
   

   
    public double getPorcentaje() {
        return porcentaje;
    }



    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }



    @Override
    public void pagar() {
        salario=getPorcentaje()*0.3;
        double sal= getPorcentaje()-salario;
        System.out.println("salario:"+sal);
       
    }

}
    
}
