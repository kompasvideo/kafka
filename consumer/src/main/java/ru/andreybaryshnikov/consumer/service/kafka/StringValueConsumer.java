package ru.andreybaryshnikov.consumer.service.kafka;

import ru.andreybaryshnikov.model.StringValue;

import java.util.List;

public interface StringValueConsumer {

    void accept(List<StringValue> value);
}
