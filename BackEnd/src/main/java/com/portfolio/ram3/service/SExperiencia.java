


package com.portfolio.ram3.service;

import com.portfolio.ram3.entity.EExperiencia;
import com.portfolio.ram3.repository.RExperiencia;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SExperiencia {
    
    @Autowired
    public RExperiencia expeRepo;
    
        public List<EExperiencia> verExperiencias() {
        List<EExperiencia> listaExperiencia = expeRepo.findAll();
        return listaExperiencia;
    }

    public void crearExperiencia(EExperiencia expe) {
        expeRepo.save(expe);
    }

    public void borrarExperiencia(int id) {
        expeRepo.deleteById(id);
    }

    public EExperiencia buscarExperiencia(int id) {
        EExperiencia expe = expeRepo.findById(id).orElse(null);
        return expe;
    }
    public void editarExperiencia(EExperiencia expe) {
        expeRepo.save(expe);
    }
}
