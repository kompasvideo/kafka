package ru.andreybaryshnikov.producer.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.andreybaryshnikov.producer.service.ProducerService;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/producer")
public class ProducerController {
    private final ProducerService producerService;

    @GetMapping("/get1")
    public String get1() {
        return producerService.get1();
    }

    @GetMapping("/get2")
    public String get2() {
        return producerService.get2();
    }
}
