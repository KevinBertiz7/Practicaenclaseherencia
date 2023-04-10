/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ESTUDIANTES
 */
public class EmpAsalariado {
    public  class Asalariados extends Empleado{
    double salario=2520000;
    public Asalariados(String n, int id, double sal) {
        super(n, id);
        salario=sal;
    }
   
   

    public void pagar(){
       
       
        System.out.println("su salario es "+salario);
       
       
       
       
    }
    
    
    }

}