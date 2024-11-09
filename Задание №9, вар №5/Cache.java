import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Cache<K, V> {
    private final Map<K, CacheEntry<V>> cacheMap;
    private final long timeout;

    public Cache(long timeout, TimeUnit timeUnit) {
        this.cacheMap = new HashMap<>();
        this.timeout = timeUnit.toMillis(timeout);
    }

    public V get(K key) {
        CacheEntry<V> entry = cacheMap.get(key);
        if (entry != null && !entry.isExpired()) {
            return entry.getValue();
        }
        return null;
    }

    public void put(K key, V value) {
        cacheMap.put(key, new CacheEntry<>(value, System.currentTimeMillis()));
    }

    private class CacheEntry<V> {
        private final V value;
        private final long timestamp;

        public CacheEntry(V value, long timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }

        public V getValue() {
            return value;
        }

        public boolean isExpired() {
            return (System.currentTimeMillis() - timestamp) > timeout;
        }
    }
}