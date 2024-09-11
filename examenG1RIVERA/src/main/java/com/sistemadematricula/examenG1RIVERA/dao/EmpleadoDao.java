package com.sistemadematricula.examenG1RIVERA.dao;

import java.util.List;
import java.util.Optional;

import com.sistemadematricula.examenG1RIVERA.entity.Empleado;

public interface EmpleadoDao {
		Empleado create(Empleado em);
		Empleado update(Empleado em);
		void delete(Long id);
		Optional<Empleado> read(Long id);
		List<Empleado> readAll();
}
