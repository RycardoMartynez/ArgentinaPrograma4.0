
package com.portfolio.ram3.controller;

import com.portfolio.ram3.entity.EProyecto;
import com.portfolio.ram3.service.SProyecto;
import java.util.List;
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
@RequestMapping("/proyecto")//localhost:8080/proyecto
//@CrossOrigin(origins = {"https://frontendportfolioryckdev.web.app","http://localhost:4200"})// se crusa con el frontEnd (angular) 
public class CProyecto {
     @Autowired
    SProyecto proyeServ;

    @GetMapping("/lista")
    @ResponseBody
    public List<EProyecto> verProyectos() {
        return proyeServ.verProyectos();
    }

    @GetMapping("/ver/{id}")
    @ResponseBody
    public EProyecto verProyecto(@PathVariable int id) {
        return proyeServ.buscarProyecto(id);
    }

    @PostMapping("/crear")
    public void agregarProyecto(@RequestBody EProyecto proyecto) {
        proyeServ.crearProyecto(proyecto);
        
    }

    @DeleteMapping("/borrar/{id}")
    public void eliminarProyecto(@PathVariable int id) {
        proyeServ.borrarProyecto(id);
        
    }
    @PutMapping("/editar/{id}")
    public void editarProyecto(@RequestBody EProyecto proyecto){
        proyeServ.editarProyecto(proyecto);
    }
}
