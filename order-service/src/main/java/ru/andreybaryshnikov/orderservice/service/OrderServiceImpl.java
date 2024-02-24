package ru.andreybaryshnikov.orderservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public String get1() {
        return "OrderService get1";
    }

    @Override
    public String get2() {
        return "OrderService get2";
    }
}
