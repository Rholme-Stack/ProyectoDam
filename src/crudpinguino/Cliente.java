/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudpinguino;

/**
 *
 * @author Pc
 */
public class Cliente {

    //variables 
    private String codCliente;
    private String nombre;
    private String nombreComercial;
    private String contacto;

    //constructores
    
    public Cliente(){
    }

    public Cliente(String codCliente, String nombre, String nombreComercial) {
        this.codCliente = codCliente.toUpperCase();
        this.nombre = nombre;
        this.nombreComercial = nombreComercial;
    }
    
    

    public Cliente(String codCliente, String nombre, String nombreComercial, String contacto) {
        this.codCliente = codCliente.toUpperCase();
        this.nombre = nombre;
        this.nombreComercial = nombreComercial;
        this.contacto = contacto;
    }
    
    ///geter y setter

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    
    //to String

    @Override
    public String toString() {
        return "Cliente{" + "codCliente=" + codCliente + ", nombre=" + nombre + ", nombreComercial=" + nombreComercial + ", contacto=" + contacto + '}';
    }
    
    
    
    
}
