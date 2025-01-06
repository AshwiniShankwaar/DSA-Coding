package Target100In30DaysEnd16JanLeetCode.HashTable;

import java.util.ArrayList;
import java.util.List;

/**
 * Design a HashMap without using any built-in hash table libraries.
 *
 * Implement the MyHashMap class:
 *
 * MyHashMap() initializes the object with an empty map.
 * void put(int key, int value) inserts a (key, value) pair into the HashMap. If the key already
 * exists in the map, update the corresponding value. int get(int key) returns the value to which
 * the specified key is mapped, or -1 if this map contains no mapping for the key.
 * void remove(key) removes the key and its corresponding value if the map contains the
 * mapping for the key.
 * */
public class HashMap {
    class Entity<K,V>{
        K key;
        V value;
        Entity(K key, V value){
            this.key = key;
            this.value = value;
        }
    }
    ArrayList<Entity<Integer,Integer>>[] arr;
    int size;
    public HashMap() {
        int size = 15000;
        arr = new ArrayList[size];
    }
    private int getIndex(int key) {
        return key%size;
    }
    public void put(int key, int value) {
        int keyIndex = getIndex(key);
        if(arr[keyIndex]==null){
            arr[keyIndex] = new ArrayList<>();
            arr[keyIndex].add(new Entity<>(key,value));
        }else{
           ArrayList<Entity<Integer,Integer>> temp = arr[keyIndex];
           boolean found = false;
           for(Entity<Integer,Integer> e: temp){
               if(e.key==key){
                   e.value = value;
                   return;
               }
           }
           arr[keyIndex].addLast(new Entity<>(key,value));
        }
    }

    public int get(int key) {
        int keyIndex = getIndex(key);
        if(arr[keyIndex]==null){
            return -1;
        }
        for (Entity<Integer,Integer> e: arr[keyIndex]){
            if(e.key == key){
                return e.value;
            }
        }
        return -1;
    }

    public void remove(int key) {
        int keyIndex = getIndex(key);
        if(arr[keyIndex]==null){
            return;
        }
        for (Entity<Integer,Integer> e: arr[keyIndex]){
            if(e.key == key){
                arr[keyIndex].remove(e);
                return;
            }
        }
    }
}
