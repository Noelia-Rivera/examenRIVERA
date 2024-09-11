package com.sistemadematricula.examenG1RIVERA.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sistemadematricula.examenG1RIVERA.dao.MatriculaDao;
import com.sistemadematricula.examenG1RIVERA.entity.Matricula;
import com.sistemadematricula.examenG1RIVERA.repository.MatriculaRepository;

@Component
public class MatriculaDaoImpl implements MatriculaDao{

	@Autowired
	private MatriculaRepository repository;
	
	@Override
	public Matricula create(Matricula m) {
		// TODO Auto-generated method stub
		return repository.save(m);
	}

	@Override
	public Matricula update(Matricula m) {
		// TODO Auto-generated method stub
		return repository.save(m);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Matricula> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Matricula> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
