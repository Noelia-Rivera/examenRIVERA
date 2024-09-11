package com.sistemadematricula.examenG1RIVERA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistemadematricula.examenG1RIVERA.entity.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{

}
