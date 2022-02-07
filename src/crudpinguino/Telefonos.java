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
public class Telefonos {
    
    private int idTelefono;
    private String cod_cliente_Tel;
    private String telefono;
    private String contactoTel;
    private String email;

   //cobstructores

    public Telefonos(){
    }
    
    

    public Telefonos( String cod_cliente_Tel, String telefono, String contactoTel, String email) {
        
        this.cod_cliente_Tel = cod_cliente_Tel;
        this.telefono = telefono;
        this.contactoTel = contactoTel;
        this.email = email.toLowerCase();
    }
    
    //getter y setter

    public int getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(int idTelefono) {
        this.idTelefono = idTelefono;
    }

    public String getCod_cliente_Tel() {
        return cod_cliente_Tel;
    }

    public void setCod_cliente_Tel(String cod_cliente_Tel) {
        this.cod_cliente_Tel = cod_cliente_Tel;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContactoTel() {
        return contactoTel;
    }

    public void setContactoTel(String contactoTel) {
        this.contactoTel = contactoTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
    
    
    
}
