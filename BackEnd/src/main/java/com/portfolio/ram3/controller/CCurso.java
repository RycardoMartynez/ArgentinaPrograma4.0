
package com.portfolio.ram3.controller;

import com.portfolio.ram3.entity.ECurso;
import com.portfolio.ram3.service.SCurso;
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
@RequestMapping("/curso")//localhost:8080/curso
//@CrossOrigin(origins = {"https://frontendportfolioryckdev.web.app","http://localhost:4200"})// se crusa con el frontEnd (angular) 
public class CCurso {
    @Autowired
    SCurso cursoServ;

    @GetMapping("/lista")
    @ResponseBody
    public List<ECurso> verCurso() {
        return cursoServ.verCursos();
    }

    @GetMapping("/ver/{id}")
    @ResponseBody
    public ECurso verCurso(@PathVariable int id) {
        return cursoServ.buscarCurso(id);
    }

    @PostMapping("/crear")
    public void agregarCurso(@RequestBody ECurso curso) {
        cursoServ.crearCurso(curso);
        
    }

    @DeleteMapping("/borrar/{id}")
    public void eliminarCurso(@PathVariable int id) {
        cursoServ.borrarCurso(id);
        
    }
    @PutMapping("/editar/{id}")
    public void editarExperiencia(@RequestBody ECurso curso){
        cursoServ.editarCurso(curso);
    }
    
}
