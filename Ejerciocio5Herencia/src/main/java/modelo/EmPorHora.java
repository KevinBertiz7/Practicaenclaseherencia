/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ESTUDIANTES
 */
public class EmPorHora {
    public class EmpleadosPorHoras extends Empleado {
double salario;
int hora;
    public EmpleadosPorHoras(String n, int id, double sa,int h) {
        super(n, id);
   
        salario=sa;
        hora=h;
    }
   

   
    public int getHora() {
        return hora;
    }



    public void setHora(int hora) {
        this.hora = hora;
    }


   
@Override
    public void pagar() {
       
        if (hora<=39){
            salario=getHora()*2500;
           
            System.out.println("su salario es:"+salario);
           
               
        }
        if (hora>=40){
            salario=getHora()*3750;
            System.out.println("su salario es:"+salario);
        }
           
        }
       
       
    }
    
}
