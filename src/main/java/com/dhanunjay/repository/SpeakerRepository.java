package com.dhanunjay.repository;

import com.dhanunjay.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
