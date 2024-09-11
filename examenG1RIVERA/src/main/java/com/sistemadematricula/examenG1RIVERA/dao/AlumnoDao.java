package com.sistemadematricula.examenG1RIVERA.dao;

import java.util.List;
import java.util.Optional;

import com.sistemadematricula.examenG1RIVERA.entity.Alumno;

public interface AlumnoDao {
		Alumno create(Alumno a);
		Alumno update(Alumno a);
		void delete(Long id);
		Optional<Alumno> read(Long id);
		List<Alumno> readAll();
}
