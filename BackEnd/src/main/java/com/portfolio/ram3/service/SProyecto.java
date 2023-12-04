
package com.portfolio.ram3.service;

import com.portfolio.ram3.entity.EProyecto;
import com.portfolio.ram3.repository.RProyecto;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyecto {
    
    @Autowired
    public RProyecto proyeRepo;
    
        public List<EProyecto> verProyectos() {
        List<EProyecto> listaProyecto = proyeRepo.findAll();
        return listaProyecto;
    }

    public void crearProyecto(EProyecto proyecto) {
        proyeRepo.save(proyecto);
    }

    public void borrarProyecto(int id) {
        proyeRepo.deleteById(id);
    }

    public EProyecto buscarProyecto(int id) {
        EProyecto proyecto = proyeRepo.findById(id).orElse(null);
        return proyecto;
    }
    public void editarProyecto(EProyecto proyecto) {
        proyeRepo.save(proyecto);
    }
    
}
