package DataStructures;

public class Entry<K, V> {
    private Entry<K, V> next;
    private final K key;
    private V value;

    public Entry(K key, V value) {
        this.key = key;
        this.setValue(value);
    }

    public K getKey() {
        return key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public void setNext(Entry<K, V> next) {
        this.next = next;
    }

    public Entry<K, V> getNext() {
        return next;
    }
}
