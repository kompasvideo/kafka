package ru.andreybaryshnikov.consumer.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.andreybaryshnikov.consumer.service.ConsumerService;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/consumer")
public class ConsumerController {

    private final ConsumerService consumerService;

    @GetMapping("/get1")
    public String get1() {
        return consumerService.get1();
    }

    @GetMapping("/get2")
    public String get2() {
        return consumerService.get2();
    }
}
