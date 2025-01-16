package javaRevision.generic;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

interface Pair<K,V>{
    K getKey();
    V getValue();
}
class EntryDemo<K,V> implements Pair<K,V>{

    K key;
    V value;
    EntryDemo(K key, V value){
        this.key = key;
        this.value = value;
    }
    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}
public class GenericInterface {
    public static void main(String[] args) {
        List<EntryDemo<Integer,String>> demo = new ArrayList<>();
        demo.add(new EntryDemo<>(1,"Ashwini"));
        demo.add(new EntryDemo<>(2,"Puja"));
        demo.add(new EntryDemo<>(3,"Nitu"));

        for (EntryDemo<Integer,String> e:demo){
            System.out.println(e.getKey()+": "+e.getValue());
        }

    }
}
