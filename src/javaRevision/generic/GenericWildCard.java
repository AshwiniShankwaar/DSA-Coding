package javaRevision.generic;
//Wildcards (?, extends, super) are used to handle situations where the exact type is unknown.

//Bounded Wildcards (extends)
//Used when the type must be a subclass of a specific class.

//Lower Bounded Wildcards (super)
//Used when the type must be a superclass of a specific class.

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.List;

class WildCard{
    public void printList(List<?> list){
        for (Object i : list){
            System.out.println(i);
        }
    }
    public double sumSqr(List<? extends Number> list){
        double sum = 0;
        for (Number n:list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public void addSqr(List<? super Double> list){
        for (int i = 1; i <=10; i++) {
            list.add(Math.pow(i,2));
        }
    }
}
public class GenericWildCard {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        WildCard w = new WildCard();
        w.addSqr(list);
        w.printList(list);
        w.sumSqr(list);

    }
}
