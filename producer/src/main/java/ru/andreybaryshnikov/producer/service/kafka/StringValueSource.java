package ru.andreybaryshnikov.producer.service.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.andreybaryshnikov.model.StringValue;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class StringValueSource implements ValueSource {
    private static final Logger log = LoggerFactory.getLogger(StringValueSource.class);
    private final AtomicLong nextValue = new AtomicLong(1);
    private final DataSender valueConsumer;

    public StringValueSource(DataSender dataSender) {
        this.valueConsumer = dataSender;
    }

    @Override
    public void generate() {
        var executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(() -> valueConsumer.send(makeValue()), 0, 1, TimeUnit.SECONDS);
        log.info("generation started");
    }

    private StringValue makeValue() {
        var id = nextValue.getAndAdd(3);
        return new StringValue(id, "stVal:" + id);
    }
}
