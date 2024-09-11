package com.sistemadematricula.examenG1RIVERA.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sistemadematricula.examenG1RIVERA.dao.GradoDao;
import com.sistemadematricula.examenG1RIVERA.entity.Grado;
import com.sistemadematricula.examenG1RIVERA.repository.GradoRepository;

@Component
public class GradoDaoImpl implements GradoDao{

	@Autowired
	private GradoRepository repository;
	
	@Override
	public Grado create(Grado g) {
		// TODO Auto-generated method stub
		return repository.save(g);
	}

	@Override
	public Grado update(Grado g) {
		// TODO Auto-generated method stub
		return repository.save(g);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Grado> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Grado> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
