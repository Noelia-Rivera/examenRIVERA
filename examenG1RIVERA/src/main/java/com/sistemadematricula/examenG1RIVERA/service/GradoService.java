package com.sistemadematricula.examenG1RIVERA.service;

import java.util.List;
import java.util.Optional;

import com.sistemadematricula.examenG1RIVERA.entity.Grado;

public interface GradoService {
	Grado create(Grado g);
	Grado update(Grado g);
	void delete(Long id);
	Optional<Grado> read(Long id);
	List<Grado> readAll();
}
