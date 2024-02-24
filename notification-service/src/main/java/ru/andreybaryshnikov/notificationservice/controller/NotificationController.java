package ru.andreybaryshnikov.notificationservice.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.andreybaryshnikov.notificationservice.service.NotificationService;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/notification")
public class NotificationController {

    private final NotificationService notificationService;

    @GetMapping("/get1")
    public String get1() {
        return notificationService.get1();
    }

    @GetMapping("/get2")
    public String get2() {
        return notificationService.get2();
    }
}
