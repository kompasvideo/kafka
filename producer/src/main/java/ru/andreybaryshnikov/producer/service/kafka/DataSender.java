package ru.andreybaryshnikov.producer.service.kafka;

import ru.andreybaryshnikov.model.StringValue;

public interface DataSender {
    void send(StringValue value);
}
