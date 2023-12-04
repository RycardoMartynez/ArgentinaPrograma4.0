
package com.portfolio.ram3.repository;

import com.portfolio.ram3.entity.ECurso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RCurso extends JpaRepository<ECurso, Integer> {
    
}
