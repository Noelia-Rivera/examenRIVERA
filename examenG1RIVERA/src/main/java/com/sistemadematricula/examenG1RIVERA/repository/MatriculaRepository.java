package com.sistemadematricula.examenG1RIVERA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistemadematricula.examenG1RIVERA.entity.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long>{

}
