package javaRevision.otherTypeClasses;

import java.util.ArrayList;
import java.util.List;

class Name<T>{
    T name;
    Name(T name){
        this.name = name;
    }
    public T getName() {
        return name;
    }
}
interface HumanNature{
    String mood(String type);
    int getSizeOfList(List<? extends Number> l);
}
class Mood implements HumanNature{

    @Override
    public String mood(String type) {
        return "i am "+type;
    }

    @Override
    public int getSizeOfList(List<? extends Number> l) {
        return l.size();
    }
}

class HumanNaturedata<T extends HumanNature>{
    T moodType;
    ArrayList<Double> list;
    HumanNaturedata(T condition){
        this.moodType = condition;
        list = new ArrayList<Double>();
    }
    void whatsMode(){
        System.out.println(moodType.mood("Angry"));
    }
    void listSize(){
        System.out.println(moodType.getSizeOfList(list));
    }
}

public class GenericClasses{
    public static void main(String[] args) {

        Name<String> name1 = new Name<>("Puja");
        System.out.println(name1.getName());
        Name<String> name2 = new Name<>("Nitu");
        System.out.println(name2.getName());
        HumanNature m = new Mood();
        HumanNaturedata<HumanNature> data = new HumanNaturedata<HumanNature>(m);
        data.whatsMode();
        data.listSize();
        Name<String> name3 = new Name<>("Ashwini");
        System.out.println(name3.getName());
    }
}
