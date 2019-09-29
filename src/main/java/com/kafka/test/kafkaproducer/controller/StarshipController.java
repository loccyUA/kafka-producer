package com.kafka.test.kafkaproducer.controller;

import com.kafka.test.kafkaproducer.dto.StarshipDto;
import com.kafka.test.kafkaproducer.service.StarshipService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequiredArgsConstructor
public class StarshipController {
    private final StarshipService service;

    @PostMapping
    public void send(@RequestBody StarshipDto dto) {
        service.send(dto);
    }
}
