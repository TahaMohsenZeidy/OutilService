package com.example.demo.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import com.example.demo.dao.OutilRepository;
import com.example.demo.entities.Outil;

@Service
public class ToolsImpl implements IToolsService{
	@Autowired
	OutilRepository outilRepository;

	@Override
	public Outil addOutil(Outil m) {
		outilRepository.save(m);
		return m;
	}

	@Override
	public void deleteOutil(Long id) {
		outilRepository.deleteById(id);
	}

	@Override
	public Outil updateOutil(Outil p) {
		outilRepository.saveAndFlush(p);
		return p;
	}

	@Override
	public Outil findOutil(Long id) {
		return (Outil) outilRepository.findById(id).get();
	}

	@Override
	public List<Outil> findAll() {
		return outilRepository.findAll();
	}

	@Override
	public List<Outil> findByDate(Date date) {
		return outilRepository.findByDate(date);
	}

	@Override
	public List<Outil> findBySource(String source) {
		return outilRepository.findBySource(source);
	}

}
