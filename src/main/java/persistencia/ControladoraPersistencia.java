/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Rol;
import logica.Usuario;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author leand
 */
public class ControladoraPersistencia {
    UsuarioJpaController usuJPA = new UsuarioJpaController();
    RolJpaController rolJPA = new RolJpaController();

    public List<Usuario> traerUsuarios() {
        return usuJPA.findUsuarioEntities();
    }

    public List<Rol> traerRoles() {
        return rolJPA.findRolEntities();
    }

    public void crearUsuario(Usuario usu) {
        usuJPA.create(usu);
    }

    public void eliminarUsuario(int idUsuario) {
        try {
            usuJPA.destroy(idUsuario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuario(int idUsuario) {
        return usuJPA.findUsuario(idUsuario);
    }

    public void editarUsuario(Usuario usu) {
        try {
            usuJPA.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
