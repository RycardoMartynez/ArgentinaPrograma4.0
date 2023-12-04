


package com.portfolio.ram3.controller;

import com.portfolio.ram3.entity.EExperiencia;
import com.portfolio.ram3.service.SExperiencia;
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
@RequestMapping("/experiencia")//localhost:8080/experiencia
//@CrossOrigin(origins = {"https://frontendportfolioryckdev.web.app","http://localhost:4200"})// se crusa con el frontEnd (angular) 

public class CExperiencia {
    
    @Autowired
    SExperiencia expeServ;

    @GetMapping("/lista")
    @ResponseBody
    public List<EExperiencia> verExperiencia() {
        return expeServ.verExperiencias();
    }

    @GetMapping("/ver/{id}")
    @ResponseBody
    public EExperiencia verExperiencia(@PathVariable int id) {
        return expeServ.buscarExperiencia(id);
    }

    @PostMapping("/crear")
    public void agregarExperiencia(@RequestBody EExperiencia expe) {
        expeServ.crearExperiencia(expe);
        
    }

    @DeleteMapping("/borrar/{id}")
    public void eliminarExperiencia(@PathVariable int id) {
        expeServ.borrarExperiencia(id);
        
    }
    @PutMapping("/editar/{id}")
    public void editarExperiencia(@RequestBody EExperiencia expe){
        expeServ.editarExperiencia(expe);
    }
    
}
