package ru.andreybaryshnikov.orderservice.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.andreybaryshnikov.orderservice.service.OrderService;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    @GetMapping("/get1")
    public String get1() {
        return orderService.get1();
    }

    @GetMapping("/get2")
    public String get2() {
        return orderService.get2();
    }
}
