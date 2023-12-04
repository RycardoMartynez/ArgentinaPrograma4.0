package com.portfolio.ram3.controller;

import com.portfolio.ram3.entity.Usuario;
import com.portfolio.ram3.service.SUsuario;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")//localhost:8080/usuario
//@CrossOrigin(origins = {"https://frontendportfolioryckdev.web.app","http://localhost:4200"})// se crusa con el frontEnd (angular) 
public class CUsuario {

    @Autowired
    SUsuario usuarioServ;

    //  @GetMapping("/lista")
    // @ResponseBody
    // public List<Usuario> verUsuarios() {
    //      return usuarioServ.verUsuarios();
    //  }
  //  @GetMapping("/ver/{id}")
  //  @ResponseBody
  //  public Usuario verUsuario(@PathVariable int id) {
  //      return usuarioServ.buscarUsuario(id);
  //  }

   //    @PostMapping("/crear")
    //   public void agregarUsuario(@RequestBody Usuario usuario) {
   //       usuarioServ.crearUsuario(usuario);
   //   }
    //   @DeleteMapping("/borrar/{id}")
    //   public void eliminarUsuario(@PathVariable int id) {
    //      usuarioServ.borrarUsuario(id);
    //  }
    //   @PutMapping("/editar/{id}")
    //   public void editarUsuario(@RequestBody Usuario usuario) {
    //       usuarioServ.editarUsuario(usuario);
    //   }
    @PostMapping("/login")
    public boolean login(@RequestBody Map<String, String> credentials) {
        String nombreU = credentials.get("nombreU");
        String password = credentials.get("password");
        return usuarioServ.verificarCredenciales(nombreU, password);
    }

}
