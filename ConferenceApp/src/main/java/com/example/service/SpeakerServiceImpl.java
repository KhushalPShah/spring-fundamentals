package com.example.service;

import com.example.model.Speaker;
import com.example.repository.SpeakerRepository;
import com.example.repository.SpeakerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    @Autowired
    private SpeakerRepository repository;

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
