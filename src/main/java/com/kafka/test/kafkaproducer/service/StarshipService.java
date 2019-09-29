package com.kafka.test.kafkaproducer.service;

import com.kafka.test.kafkaproducer.dto.StarshipDto;

public interface StarshipService {
    StarshipDto save(StarshipDto dto);

    void send(StarshipDto dto);

    void consume(StarshipDto dto);
}
