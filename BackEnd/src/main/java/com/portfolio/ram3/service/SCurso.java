package com.portfolio.ram3.service;

import com.portfolio.ram3.entity.ECurso;
import com.portfolio.ram3.repository.RCurso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SCurso {

    @Autowired
    public RCurso cursoRepo;

    public List<ECurso> verCursos() {
        List<ECurso> listaCursos = cursoRepo.findAll();
        return listaCursos;
    }

    public void crearCurso(ECurso curso) {
        cursoRepo.save(curso);
    }

    public void borrarCurso(int id) {
        cursoRepo.deleteById(id);
    }

    public ECurso buscarCurso(int id) {
        ECurso expe = cursoRepo.findById(id).orElse(null);
        return expe;
    }

    public void editarCurso(ECurso expe) {
        cursoRepo.save(expe);
    }
}
