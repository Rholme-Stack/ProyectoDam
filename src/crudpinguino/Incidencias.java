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
public class Incidencias {
    
    private String cod_Cliente_llamada;
    private String tipoLlamada;
    private String comentarios;
    private String usuario;
    
    //constructores
    
    public Incidencias() {
      
    }

    public Incidencias(String comentarios) {
        this.comentarios = comentarios;
    }
    
    

    public Incidencias(String cod_Cliente_llamada, String tipoLlamada, String comentarios, String usuario) {
        this.cod_Cliente_llamada = cod_Cliente_llamada;
        this.tipoLlamada = tipoLlamada;
        this.comentarios = comentarios;
        this.usuario = usuario;
    }

    ///constructores
    
    public String getCod_Cliente_llamada() {
        return cod_Cliente_llamada;
    }

    public void setCod_Cliente_llamada(String cod_Cliente_llamada) {
        this.cod_Cliente_llamada = cod_Cliente_llamada;
    }

    public String getTipoLlamada() {
        return tipoLlamada;
    }

    public void setTipoLlamada(String tipoLlamada) {
        this.tipoLlamada = tipoLlamada;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

   
    
    //to string

   
    
    
    
    
  
    
    
    
}
