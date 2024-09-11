package com.sistemadematricula.examenG1RIVERA.service;

import java.util.List;
import java.util.Optional;

import com.sistemadematricula.examenG1RIVERA.entity.Matricula;

public interface MatriculaService {
	Matricula create(Matricula m);
	Matricula update(Matricula m);
	void delete(Long id);
	Optional<Matricula> read(Long id);
	List<Matricula> readAll();
}
