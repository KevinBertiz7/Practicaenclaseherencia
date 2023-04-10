/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ESTUDIANTES
 */
public class EmpSalarioPorComision {
    
    public class AsalariadosPorComision extends Empleado {
    double salario=680000;
    double porcentaje;
    public AsalariadosPorComision(String n, int id, double sal, double por) {
        super(n, id);
        salario=sal;
        porcentaje = por;
    }

   
    public double getPorcentaje() {
        return porcentaje;
    }


    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }


    @Override
    public void pagar() {
       
        double sal=salario*0.1;
        double salt=salario+sal;
        double salu=getPorcentaje()*0.3;
        double salariototal=salario+salu+salt;
        System.out.println("su salario es:"+salariototal);
    }

} 
    
}
