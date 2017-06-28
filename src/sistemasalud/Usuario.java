/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasalud;

/**
 *
 * @author andre
 */
public class Usuario {
    
    public String nombre;
    public String apellidos;
    public String id;
    public String correo;
    public String tipo;
    public String sexo;
    public Boolean estado;

    public Usuario(String nombre, String apellidos, String id, String correo, String tipo, String sexo) throws Exception {
        
        if (id== null) { throw new Exception("id No puede Ser nulo"); } 
        if (nombre== null) { throw new Exception("nombre No puede Ser nulo"); } 
        if (apellidos== null) { throw new Exception("apellidos No puede Ser nulo"); } 
        if (correo== null) { throw new Exception("correo No puede Ser nulo"); } 
        if (sexo== null) { throw new Exception("Sexo No puede Ser nulo"); } 
        if (tipo== null) { throw new Exception("tipo No puede Ser nulo"); } 

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = id;
        this.correo = correo;
        this.tipo = tipo;
        this.sexo = sexo;
        this.estado = true;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getId() {
        return id;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getSexo() {
        return sexo;
    }

    public Boolean getEstado() {
        return estado;
    }
    
    public void setid(String id) throws Exception {
        if (id == null) { throw new Exception("EL id No puede ser nulo"); }
        else{
        this.id = id;
        }
    }public void setnombre(String nombre) throws Exception {
        if (nombre == null) { throw new Exception("EL nombre No puede ser nulo"); }
        else{
        this.nombre = nombre;
        }
    }public void setapellidos(String apellidos) throws Exception {
        if (apellidos == null) { throw new Exception("EL apellidos No puede ser nulo"); }
        else{
        this.apellidos = apellidos;
        }
    }public void setcorreo(String correo) throws Exception {
        if (correo == null) { throw new Exception("EL correo No puede ser nulo"); }
        else{
        this.correo = correo;
        }
    }public void setSexo(String sexo) throws Exception {
        if (sexo == null) { throw new Exception("EL Sexo No puede ser nulo"); }
        else{
        this.sexo =sexo;
        }
    }public void settipo(String tipo) throws Exception {
        if (tipo == null) { throw new Exception("EL tipo No puede ser nulo"); }
        else{
        this.tipo = tipo;
        }
    }
    
    public void activar(){
        estado = true;
    }
    
    public void desactivar(){
        estado = false;
    }
    
    
    
    
    
    
    
}
