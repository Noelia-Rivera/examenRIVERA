package com.sistemadematricula.examenG1RIVERA.dao;

import java.util.List;
import java.util.Optional;

import com.sistemadematricula.examenG1RIVERA.entity.Grado;

public interface GradoDao {
	Grado create(Grado g);
	Grado update(Grado g);
	void delete(Long id);
	Optional<Grado> read(Long id);
	List<Grado> readAll();
}
