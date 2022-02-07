/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudpinguino;

/**
 *
 * @author Pc
 */
public class Usuarios {
    
    private String nombre;
    private String email;
    private String departamento;
    
    
    
    //constructores
    public Usuarios(){
    }

    public Usuarios(String nombre) {
        this.nombre = nombre;
    }

    
    //geter y seter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    
    
    
    
    
    
}
