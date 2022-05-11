package com.example.repository;

import com.example.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class SpeakerRepositoryImpl implements SpeakerRepository {

    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();
        Speaker s1 = new Speaker();
        s1.setfName("Khushal");
        s1.setlName("Shah");
        speakers.add(s1);
        return speakers;
    }

}
