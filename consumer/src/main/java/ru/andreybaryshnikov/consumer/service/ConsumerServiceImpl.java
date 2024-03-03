package ru.andreybaryshnikov.consumer.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Override
    public String get1() {
        return "ConsumerService get1";
    }

    @Override
    public String get2() {
        return "ConsumerService get2";
    }
}
