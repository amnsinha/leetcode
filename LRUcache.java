package leetcode;

import java.util.Hashtable;

class LRUCache {
    int capacity;
    Hashtable hashtable = new Hashtable();
    public LRUCache(int capacity) {
        this.capacity = capacity;
        hashtable = new Hashtable(capacity);
    }

    public int get(int key) {
       return (int) hashtable.get(key);
    }

    public void put(int key, int value) {
        hashtable.put(key, value);
    }
}
