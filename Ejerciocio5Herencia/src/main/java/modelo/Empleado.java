/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ESTUDIANTES
 */
public abstract class Empleado {
    private String nombre;
    private int Identificacion;
  
    public Empleado(String n, int id) {
        super();
        nombre = n;
        Identificacion = id;
      
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getIdentificacion() {
        return Identificacion;
    }
    public void setIdentificacion(int identificacion) {
        Identificacion = identificacion;
    }
  
  
    public abstract void pagar();
  
  
}
    
    
    

