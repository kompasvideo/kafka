package ru.andreybaryshnikov.producer.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class ProducerServiceImpl implements ProducerService {
    @Override
    public String get1() {
        return "ProducerService get1";
    }

    @Override
    public String get2() {
        return "ProducerService get2";
    }
}
