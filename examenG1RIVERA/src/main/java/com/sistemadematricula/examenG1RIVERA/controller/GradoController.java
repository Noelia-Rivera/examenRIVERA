package com.sistemadematricula.examenG1RIVERA.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemadematricula.examenG1RIVERA.entity.Grado;
import com.sistemadematricula.examenG1RIVERA.service.GradoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/grados")
public class GradoController {
	@Autowired
	private GradoService service;
	
	@GetMapping
	public ResponseEntity<List<Grado>> readAll() {
		try {
			List<Grado> grados = service.readAll();
			if (grados.isEmpty()) {
				return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
			} else {
				return new ResponseEntity<>(grados, HttpStatus.OK);
			}
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Grado> crear(@Valid @RequestBody Grado ga) {
		try {
			Grado g = service.create(ga);
			return new ResponseEntity<>(g, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Grado> getGradoId(@PathVariable("id") Long id) {
		try {
			Grado g = service.read(id).get();
			return new ResponseEntity<>(g, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Grado> delGrado(@PathVariable("id") Long id) {
		try {
			service.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Grado> updateGrado(@PathVariable("id") Long id, @Valid @RequestBody Grado ga) {
		Optional<Grado> g = service.read(id);
		if (g.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(service.update(ga), HttpStatus.OK);
			
		}
	}
}
