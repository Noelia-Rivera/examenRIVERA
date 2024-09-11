package com.sistemadematricula.examenG1RIVERA.dao;

import java.util.List;
import java.util.Optional;

import com.sistemadematricula.examenG1RIVERA.entity.Curso;

public interface CursoDao {
		Curso create(Curso c);
		Curso update(Curso c);
		void delete(Long id);
		Optional<Curso> read(Long id);
		List<Curso> readAll();
}
