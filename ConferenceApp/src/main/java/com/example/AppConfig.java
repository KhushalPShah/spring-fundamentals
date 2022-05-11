package com.example;

import com.example.repository.SpeakerRepository;
import com.example.repository.SpeakerRepositoryImpl;
import com.example.service.SpeakerService;
import com.example.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        return new SpeakerServiceImpl();
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new SpeakerRepositoryImpl();
    }
}
