package com.timichanga.dojosAndNinjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.timichanga.dojosAndNinjas.models.Dojo;
import com.timichanga.dojosAndNinjas.repositories.DojoRepository;

import com.timichanga.dojosAndNinjas.models.Ninja;
import com.timichanga.dojosAndNinjas.repositories.NinjaRepository;

@Service
public class AppService {
	
	// adding the Dojo & Ninja repositories as dependencies
    private final DojoRepository dojoRepository;
    private final NinjaRepository ninjaRepository;
    
    // make a constructor
    public AppService(DojoRepository dojoRepository, NinjaRepository ninjaRepository) {
        this.dojoRepository = dojoRepository;
        this.ninjaRepository = ninjaRepository;
    }
    
    // methods to use
    
    // returns all the Dojos
    public List<Dojo> allDojos() {
        return (List<Dojo>)this.dojoRepository.findAll();
    }
    // creates a Dojo
    public Dojo createDojo(Dojo d) {
        return this.dojoRepository.save(d);
    }
    
	// creates a ninja
	public Ninja createNinja(Ninja n) {
	    return this.ninjaRepository.save(n);
	}
	
	public Dojo dojoInfo(Long id) {
		return this.dojoRepository.findById(id).orElse(null);
	}
}
