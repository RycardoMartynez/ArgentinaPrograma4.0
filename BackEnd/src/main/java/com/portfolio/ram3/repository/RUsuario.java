
package com.portfolio.ram3.repository;

import com.portfolio.ram3.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RUsuario extends JpaRepository<Usuario, Integer>{

    public Usuario findByNombreU(String nombreUsuario);
    
}
