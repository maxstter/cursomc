package com.maximiliano.curso.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maximiliano.curso.domain.Categoria;
import com.maximiliano.curso.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private  CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
		
	}
	

}
