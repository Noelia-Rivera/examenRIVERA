package com.sistemadematricula.examenG1RIVERA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistemadematricula.examenG1RIVERA.entity.Grado;

@Repository
public interface GradoRepository extends JpaRepository<Grado, Long>{

}
