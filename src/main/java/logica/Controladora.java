/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

/**
 *
 * @author leand
 */
public class Controladora {
    ControladoraPersistencia controlPersis;

    public Controladora() {
        controlPersis = new ControladoraPersistencia();
    }

    public Usuario validarUsuario(String usuario, String contrasena) {
//String mensaje = "";
Usuario usr= null;
        List<Usuario> listaUsuarios =  controlPersis.traerUsuarios();
        for(Usuario usu : listaUsuarios){
            if(usu.getNombreUsuario().equals(usuario)){
                if(usu.getContrasena().equals(contrasena)){
                  //  mensaje = "Usuario y contraseña correctos. Bienvenido/a!";
                  usr = usu;  
                  return usr;
                }
                else{
                  //  mensaje = "Contraseña incorrecta";
                  usr = null;  
                  return usr;
                }
            }else{
               // mensaje = "Usuario no encontrado";
               usr = null;
               
                
            }
        }
        return usr;
    }


    public List<Usuario> traerUsuarios() {
       return controlPersis.traerUsuarios();
    }

    public List<Rol> traerRoles() {
        return controlPersis.traerRoles();
    }

    public void crearUsuario(String usuario, String contrasena, String rolRecibido) {
        Usuario usu = new Usuario();
        usu.setNombreUsuario(usuario);
        usu.setContrasena(contrasena);
Rol rolEncontrado = new Rol();
rolEncontrado = this.traerRol(rolRecibido);
if(rolEncontrado != null){
    usu.setRol(rolEncontrado);
}
controlPersis.crearUsuario(usu);
    }

    private Rol traerRol(String rolRecibido) {
       List<Rol> listaRoles = controlPersis.traerRoles();
       for(Rol rol : listaRoles){
           if(rol.getNombreRol().equals(rolRecibido)){
               return rol;
           }
       }
       return null;
    }

    public void eliminarUsuario(int idUsuario) {
        controlPersis.eliminarUsuario(idUsuario);
    }

    public Usuario traerUsuario(int idUsuario) {
        return controlPersis.traerUsuario(idUsuario);
    }

    public void editarUsuario(Usuario usu, String usuario, String contrasena, String rolRecibido) {
        usu.setNombreUsuario(usuario);
        usu.setContrasena(contrasena);
        Rol rolEncontrado = new Rol();
rolEncontrado = this.traerRol(rolRecibido);
if(rolEncontrado != null){
    usu.setRol(rolEncontrado);
}
        controlPersis.editarUsuario(usu);
    }
}
