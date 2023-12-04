package com.portfolio.ram3.controller;

import com.portfolio.ram3.entity.Persona;
import com.portfolio.ram3.service.SPersona;
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
@RequestMapping("/persona")//localhost:8080/persona
//@CrossOrigin(origins = {"https://frontendportfolioryckdev.web.app","http://localhost:4200",})// se crusa con el frontEnd (angular) 
public class CPersona {

    @Autowired
    SPersona persoServ;

    @GetMapping("/lista")
    @ResponseBody
    public List<Persona> verPersonas() {
        return persoServ.verPersonas();
    }

    @GetMapping("/ver/{id}")
    @ResponseBody
    public Persona verPersona(@PathVariable int id) {
        return persoServ.buscarPersona(id);
    }

    @PostMapping("/crear")
    public void agregarPersona(@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
       
    }

    @DeleteMapping("/borrar/{id}")
    public void eliminarPersona(@PathVariable int id) {
        persoServ.borrarPersona(id);
        
    }
    @PutMapping("/editar")
    public void updatePersona(@RequestBody Persona pers){
        persoServ.editarPersona(pers);
    }

}
