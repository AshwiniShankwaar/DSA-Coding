package Target100In30DaysEnd16JanLeetCode.HashTable;

import java.util.ArrayList;
import java.util.List;

/**
 * Design a HashSet without using any built-in hash table libraries.
 *
 * Implement MyHashSet class:
 *
 * void add(key) Inserts the value key into the HashSet.
 * bool contains(key) Returns whether the value key exists in the HashSet or not.
 * void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet,
 * do nothing.
 *
 * */
public class HashSet {
    int size;
    ArrayList<Integer>[] arr;
    public HashSet() {
        size = 15000;
        arr = new ArrayList[size];
    }

    public void add(int key) {
        int index = getIndex(key);
        if(arr[index] == null){
            arr[index] = new ArrayList<>();
            arr[index].add(key);
        }
        else if(!arr[index].contains(key)) arr[index].addLast(key);
    }

    private int getIndex(int key) {
        return key%size;
    }

    public void remove(int key) {
        int index = getIndex(key);

        if(arr[index]!=null && arr[index].contains(key)){
            arr[index].remove(Integer.valueOf(key));
        }
    }

    public boolean contains(int key) {
        int index = getIndex(key);
        if(arr[index] == null) return false;
        return arr[index].contains(key);
    }

    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(1);
        set.remove(5);
        set.add(2);
        System.out.println(set.contains(1));
        System.out.println(set.contains(3));
        set.add(2);
        System.out.println(set.contains(2));
        set.remove(2);
        System.out.println(set.contains(2));
    }
}
