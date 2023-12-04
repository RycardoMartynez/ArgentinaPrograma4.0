
package com.portfolio.ram3.repository;


import com.portfolio.ram3.entity.EExperiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository <EExperiencia, Integer>{
    
}
