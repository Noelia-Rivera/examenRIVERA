package com.sistemadematricula.examenG1RIVERA.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemadematricula.examenG1RIVERA.dao.EmpleadoDao;
import com.sistemadematricula.examenG1RIVERA.entity.Empleado;
import com.sistemadematricula.examenG1RIVERA.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

	@Autowired
	private EmpleadoDao dao;
	
	@Override
	public Empleado create(Empleado em) {
		// TODO Auto-generated method stub
		return dao.create(em);
	}

	@Override
	public Empleado update(Empleado em) {
		// TODO Auto-generated method stub
		return dao.update(em);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Empleado> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Empleado> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
