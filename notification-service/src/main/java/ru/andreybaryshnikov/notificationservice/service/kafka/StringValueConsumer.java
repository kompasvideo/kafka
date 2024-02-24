package ru.andreybaryshnikov.notificationservice.service.kafka;

import ru.andreybaryshnikov.model.StringValue;

import java.util.List;

public interface StringValueConsumer {

    void accept(List<StringValue> value);
}
