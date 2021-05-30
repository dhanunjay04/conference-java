package com.dhanunjay.service;

import com.dhanunjay.model.Speaker;
import com.dhanunjay.repository.HibernateSpeakerRepositoryImpl;
import com.dhanunjay.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl (SpeakerRepository speakerRepository){
            repository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll()
    {
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
