package com.sistemadematricula.examenG1RIVERA.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sistemadematricula.examenG1RIVERA.dao.CursoDao;
import com.sistemadematricula.examenG1RIVERA.entity.Curso;
import com.sistemadematricula.examenG1RIVERA.repository.CursoRepository;

@Component
public class CursoDaoImpl implements CursoDao{

	@Autowired
	private CursoRepository repository;
	
	@Override
	public Curso create(Curso c) {
		// TODO Auto-generated method stub
		return repository.save(c);
	}

	@Override
	public Curso update(Curso c) {
		// TODO Auto-generated method stub
		return repository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Curso> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Curso> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
