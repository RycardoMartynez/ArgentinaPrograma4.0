
package com.portfolio.ram3.controller;

import com.portfolio.ram3.entity.ESkill;
import com.portfolio.ram3.service.SSkill;
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
@RequestMapping("/skill")//localhost:8080/skill
//@CrossOrigin(origins = {"https://frontendportfolioryckdev.web.app","http://localhost:4200"})// se crusa con el frontEnd (angular) 
public class CSkill {
    @Autowired
    SSkill skillServ;

    @GetMapping("/lista")
    @ResponseBody
    public List<ESkill> verSkills() {
        return skillServ.verSkills();
    }

    @GetMapping("/ver/{id}")
    @ResponseBody
    public ESkill verSkill(@PathVariable int id) {
        return skillServ.buscarSkill(id);
    }

    @PostMapping("/crear")
    public void agregarSkill(@RequestBody ESkill skill) {
        skillServ.crearSkill(skill);
        
    }

    @DeleteMapping("/borrar/{id}")
    public void eliminarSkill(@PathVariable int id) {
        skillServ.borrarSkill(id);
        
    }
    @PutMapping("/editar/{id}")
    public void editarSkill(@RequestBody ESkill skill){
        skillServ.editarSkill(skill);
    }
}
