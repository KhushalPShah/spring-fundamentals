package com.example.service;

import com.example.model.Speaker;
import com.example.repository.SpeakerRepository;
import com.example.repository.SpeakerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpeakerServiceImpl implements SpeakerService {
//    @Autowired
    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("Constructor Called");
    }

    public SpeakerRepository getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println("Setter Called");
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll() {
        System.out.println("findAll Called");
        return repository.findAll();
    }
}
