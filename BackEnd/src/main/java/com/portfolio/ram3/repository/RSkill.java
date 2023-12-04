
package com.portfolio.ram3.repository;

import com.portfolio.ram3.entity.ESkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSkill extends JpaRepository<ESkill, Integer> {
    
}
