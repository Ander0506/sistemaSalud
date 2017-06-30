/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasalud;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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

    public LinkedList<Programa> getProgramas() {
        return programas;
    }
    public LinkedList<Columna> getColumnas() {
        return columnas;
    }
    public LinkedList<Eps> getEpss() {
        return epss;
    }
    public LinkedList<Paciente> getPacientes() {
        return pacientes;
    }
    public LinkedList<Usuario> getUsuarios() {
        return usuarios;
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
    public void ActualizarTablaEps (JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel(); 
        this.vaciarTabla(tabla);
        int cantFilas = epss.size();
        modelo.setRowCount(cantFilas);
        for (int i = 0; i <cantFilas; i++) {
            modelo.setValueAt(epss.get(i).getCode(), i, 0);
            modelo.setValueAt(epss.get(i).getName(), i, 1);
        }
    }
    public int GetPosElementEps(Object obj ){
       
        for (int i = 0; i < epss.size(); i++) {
            Object actual = epss.get(i);
            if(actual.equals(obj)){
                return (i);
            }
        }
       return -1;
    }
    public void EditarEps(String name, String code,Eps epsEditar){
       int pos = GetPosElementEps(epsEditar);
        epss.get(pos).setCode(code);
        epss.get(pos).setName(name);
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
    public Paciente RetornarPacientePorCC(String doc){
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
    
    //Metodos Auxiliares
    
    //Vaciar Tabla
    public void vaciarTabla(JTable table){
        DefaultTableModel dt = (DefaultTableModel) table.getModel();
        for (int i = 0; i < dt.getRowCount(); i++) {
            dt.removeRow(i);
        }
    }
}