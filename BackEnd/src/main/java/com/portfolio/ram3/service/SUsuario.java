
package com.portfolio.ram3.service;

import com.portfolio.ram3.entity.Usuario;
import com.portfolio.ram3.repository.RUsuario;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SUsuario {
     @Autowired
    public RUsuario usuarioRepo;
    
        public List<Usuario> verUsuarios() {
        List<Usuario> listaUsuario = usuarioRepo.findAll();
        return listaUsuario;
    }

    public void crearUsuario(Usuario usuario) {
        usuarioRepo.save(usuario);
    }

    public void borrarUsuario(int id) {
        usuarioRepo.deleteById(id);
    }

    public Usuario buscarUsuario(int id) {
        Usuario usuario = usuarioRepo.findById(id).orElse(null);
        return usuario;
    }
    public void editarUsuario(Usuario usuario) {
        usuarioRepo.save(usuario);
    }
     public boolean verificarCredenciales(String nombreU, String password) {
        Usuario usuario = usuarioRepo.findByNombreU(nombreU);
        if (usuario != null && usuario.getPassword().equals(password)) {
            return true; // Las credenciales son válidas
        }
        return false; // Las credenciales no son válidas
    }
}
