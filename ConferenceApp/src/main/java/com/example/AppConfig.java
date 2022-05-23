package com.example;

import com.example.model.Guest;
import com.example.repository.SpeakerRepository;
import com.example.repository.SpeakerRepositoryImpl;
import com.example.service.SpeakerService;
import com.example.service.SpeakerServiceImpl;
import com.example.util.GuestFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.example"})
public class AppConfig {
    @Bean
    public Guest getGuestFromFactory() throws Exception {
        GuestFactory guestFactory = new GuestFactory();
        return guestFactory.getObject();
    }
}
