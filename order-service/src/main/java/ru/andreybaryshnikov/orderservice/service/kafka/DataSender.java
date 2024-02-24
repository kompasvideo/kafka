package ru.andreybaryshnikov.orderservice.service.kafka;

import ru.andreybaryshnikov.model.StringValue;

public interface DataSender {
    void send(StringValue value);
}
