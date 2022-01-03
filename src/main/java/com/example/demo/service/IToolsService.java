package com.example.demo.service;

import java.util.Date;
import java.util.List;
import com.example.demo.entities.Outil;

public interface IToolsService {
	// Tools CRUD
	Outil addOutil(Outil m);
	void deleteOutil(Long id);
	Outil updateOutil(Outil p);
	Outil findOutil(Long id);
	List<Outil> findAll();

	// Find by properties.
	List<Outil> findByDate(Date date);
	List<Outil> findBySource(String source);

}
