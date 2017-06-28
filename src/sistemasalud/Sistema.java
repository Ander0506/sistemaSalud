/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasalud;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author andre
 */
public class Sistema implements Serializable{
    
    private LinkedList<Programa> programas;
    private LinkedList<Columna> columnas;
    private LinkedList<Eps> epss;
    private LinkedList<Paciente> pacientes;
    private LinkedList<Usuario> usuarios;
   
    public Sistema() {
        programas = new LinkedList<>();
        columnas = new LinkedList<>();
        epss = new LinkedList<>();
        pacientes = new LinkedList<>(); 
        usuarios = new LinkedList<>();
    }
    
    public void adicionarPrograma(Programa progAdicionar)throws Exception{
       if (progAdicionar == null) {
            throw new Exception("El programa no puede ser nulo");
        }
        programas.add(progAdicionar);
    }
    public boolean buscarPrograma(Programa progABuscar)throws Exception{
        if (progABuscar == null) {
            throw new Exception("El programa no se encuentra");
        }
        return programas.contains(progABuscar);
    }
    public boolean eliminarPrograma(Programa progAEliminar) throws Exception{
        if (progAEliminar == null) {
            throw new Exception("El programa a eliminar no se encuentra");
        }
        return programas.remove(progAEliminar);
    }
    public Programa RetornarProgramaPorCodigo(String Id){
         Iterator<Programa> it = programas.iterator(); 
         boolean encontrado = false;
         Programa actual = programas.getFirst();
      while(it.hasNext()&& encontrado == false){
           actual = it.next();
          if (actual.getId().equals(Id)) {
              encontrado = true;
          }
         }
      return actual;
    }
    
    public void adicionarColumna(Columna columnaAdicionar)throws Exception{
       if (columnaAdicionar == null) {
            throw new Exception("La columna no puede ser nulo");
        }
        columnas.add(columnaAdicionar);
    }
    public boolean buscarColumna(Columna columnaABuscar)throws Exception{
        if (columnaABuscar == null) {
            throw new Exception("La columna no se encuentra");
        }
        return columnas.contains(columnaABuscar);
    }
    public boolean eliminarColumna(Columna columnaAEliminar) throws Exception{
        if (columnaAEliminar == null) {
            throw new Exception("La columna a eliminar no se encuentra");
        }
        return columnas.remove(columnaAEliminar);
    }
    public Columna RetornarColumnaPorCodigo(String Id){
         Iterator<Columna> it = columnas.iterator(); 
         boolean encontrado = false;
         Columna actual = columnas.getFirst();
      while(it.hasNext()&& encontrado == false){
           actual = it.next();
          if (actual.getCodigo().equals(Id)) {
              encontrado = true;
          }
         }
      return actual;
    }
    
    
    public void adicionarEps(Eps epsAdicionar)throws Exception{
       if (epsAdicionar == null) {
            throw new Exception("La eps no puede ser nulo");
        }
        epss.add(epsAdicionar);
    }
    public boolean buscarEps(Eps epsABuscar)throws Exception{
        if (epsABuscar == null) {
            throw new Exception("La eps no se encuentra");
        }
        return epss.contains(epsABuscar);
    }
    public boolean eliminarEps(Eps epsAEliminar) throws Exception{
        if (epsAEliminar == null) {
            throw new Exception("La columna a eliminar no se encuentra");
        }
        return epss.remove(epsAEliminar);
    }
    public Eps RetornarEpsPorCodigo(String Id){
         Iterator<Eps> it = epss.iterator(); 
         boolean encontrado = false;
         Eps actual = epss.getFirst();
      while(it.hasNext()&& encontrado == false){
           actual = it.next();
          if (actual.getCode().equals(Id)) {
              encontrado = true;
          }
         }
      return actual;
    }
    public Eps RetornarEpsPorNombre(String nombre){
         Iterator<Eps> it = epss.iterator(); 
         boolean encontrado = false;
         Eps actual = epss.getFirst();
      while(it.hasNext()&& encontrado == false){
           actual = it.next();
          if (actual.getName().equals(nombre)) {
              encontrado = true;
          }
         }
      return actual;
    }
    
    
    public void adicionarPaciente(Paciente UsuarioAdicionar)throws Exception{
       if (UsuarioAdicionar == null) {
            throw new Exception("El usuario no puede ser nulo");
        }
        pacientes.add(UsuarioAdicionar);
    }
    public boolean buscarPaciente(Paciente UsuarioABuscar)throws Exception{
        if (UsuarioABuscar == null) {
            throw new Exception("El usuario no se encuentra");
        }
        return pacientes.contains(UsuarioABuscar);
    }
    public boolean eliminarPaciente(Paciente usuarioAEliminar) throws Exception{
        if (usuarioAEliminar == null) {
            throw new Exception("El usuario a eliminar no se encuentra");
        }
        return pacientes.remove(usuarioAEliminar);
    }
    public Paciente RetornarEpsPorCC(String doc){
         Iterator<Paciente> it = pacientes.iterator(); 
         boolean encontrado = false;
         Paciente actual = pacientes.getFirst();
      while(it.hasNext()&& encontrado == false){
           actual = it.next();
          if (actual.getDocumento().equals(doc)) {
              encontrado = true;
          }
         }
      return actual;
    }
    
    
    public void Inicializar() throws Exception{
        
        Item a = new Item("Dosis 1");
        Item b = new Item("Dosis 2");
        Item c = new Item("Dosis 3");
        Item d = new Item("Dosis 4");
       
       Columna hepatitis = new Columna("001","Hepatitis");
       Columna neumo = new Columna("002","Neumococo");
       Columna influenza = new Columna("003","Influenza");
       Columna bcg = new Columna("004","Bcg");
       Columna sarampion = new Columna("005","sarampion");
       Columna fiebre = new Columna("006","fiebre amarilla");
  
       hepatitis.adicionarItem(a);
       hepatitis.adicionarItem(b);
       hepatitis.adicionarItem(c);
       neumo.adicionarItem(a);       
       neumo.adicionarItem(b);
       influenza.adicionarItem(a);
       influenza.adicionarItem(b);
       bcg.adicionarItem(a);
       bcg.adicionarItem(b);
       bcg.adicionarItem(c);
       sarampion.adicionarItem(a);
       sarampion.adicionarItem(b);
       sarampion.adicionarItem(c);
       fiebre.adicionarItem(a);
       
        adicionarColumna(sarampion);
        adicionarColumna(fiebre);
        adicionarColumna(bcg);
        adicionarColumna(hepatitis);
        adicionarColumna(neumo);
        adicionarColumna(influenza);
       
       Programa adulto = new Programa("1","Adulto Mayor");
       Programa adolescente = new Programa("2","Adolescente");
       Programa recienNacido = new Programa("3","Neonatos");
       Programa primeraInfancia = new Programa("4","Adulto Mayor");
       
        adicionarPrograma(adolescente);
        adicionarPrograma(adulto);
        adicionarPrograma(recienNacido);
        adicionarPrograma(primeraInfancia);
       
       adulto.adicionarcolumna(hepatitis);
       adulto.adicionarcolumna(influenza);
       adolescente.adicionarcolumna(sarampion);
       recienNacido.adicionarcolumna(bcg);
       recienNacido.adicionarcolumna(fiebre);
       primeraInfancia.adicionarcolumna(influenza);
       primeraInfancia.adicionarcolumna(neumo);
       
       
       Eps nuevaEps = new Eps("Nueva Eps","Ne");
       Eps saludCoop = new Eps("SaludCoop","Sc");
       Eps saludTotal = new Eps("SaludTotal","St");
       Eps coomeva = new Eps("coomeva","Coo");

       adicionarEps(saludTotal);
       adicionarEps(saludCoop);
       adicionarEps(nuevaEps);
       adicionarEps(coomeva);
        
        
    }
    
    
}
