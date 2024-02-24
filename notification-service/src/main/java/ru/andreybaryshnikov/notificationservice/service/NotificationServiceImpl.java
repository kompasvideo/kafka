package ru.andreybaryshnikov.notificationservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class NotificationServiceImpl implements NotificationService{
    @Override
    public String get1() {
        return "NotificationService get1";
    }

    @Override
    public String get2() {
        return "NotificationService get2";
    }
}
