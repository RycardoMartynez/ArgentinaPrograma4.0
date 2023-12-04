package com.portfolio.ram3.repository;

import com.portfolio.ram3.entity.EProyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RProyecto extends JpaRepository<EProyecto, Integer> {

}
