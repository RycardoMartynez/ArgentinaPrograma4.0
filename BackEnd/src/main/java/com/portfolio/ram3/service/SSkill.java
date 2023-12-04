
package com.portfolio.ram3.service;

import com.portfolio.ram3.entity.ESkill;
import com.portfolio.ram3.repository.RSkill;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SSkill {
    @Autowired
    public RSkill skillRepo;
    
        public List<ESkill> verSkills() {
        List<ESkill> listaSkill = skillRepo.findAll();
        return listaSkill;
    }

    public void crearSkill(ESkill skill) {
        skillRepo.save(skill);
    }

    public void borrarSkill(int id) {
        skillRepo.deleteById(id);
    }

    public ESkill buscarSkill(int id) {
        ESkill skill = skillRepo.findById(id).orElse(null);
        return skill;
    }
    public void editarSkill(ESkill skill) {
        skillRepo.save(skill);
    }
}
