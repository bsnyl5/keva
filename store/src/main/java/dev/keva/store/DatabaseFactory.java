package dev.keva.store;

import dev.keva.store.impl.ChronicleMapImpl;
import dev.keva.store.impl.ConcurrentHashMapImpl;
import lombok.Setter;

@Setter
public final class DatabaseFactory {
    public synchronized static KevaDatabase createChronicleMap(DatabaseConfig config) {
        return new ChronicleMapImpl(config);
    }

    public synchronized static KevaDatabase createConcurrentMap() {
        return new ConcurrentHashMapImpl();
    }
}
