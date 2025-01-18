package Target100In30DaysEnd16JanLeetCode.HashTable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class RandomizedSet {
    ArrayList<Integer> set;
    Random r = new Random();
    public RandomizedSet() {
        this.set = new ArrayList<>();
    }

    public boolean insert(int val) {
        if(set.contains(val)){
            return false;
        }
            set.add(val);
            return true;

    }

    public boolean remove(int val) {
        if(set.contains(val)){
            Integer i = val;
            set.remove(i);
            return true;
        }
        return false;
    }

    public int getRandom() {
        int pick = r.nextInt(set.size());
        return set.get(pick);
    }

    public static void main(String[] args) {
        RandomizedSet s = new RandomizedSet();
        System.out.println(s.insert(1));
        System.out.println(s.remove(2));
        System.out.println(s.insert(2));
        System.out.println(s.getRandom());
        System.out.println(s.remove(1));
        System.out.println(s.insert(2));
        System.out.println(s.getRandom());
    }
}
