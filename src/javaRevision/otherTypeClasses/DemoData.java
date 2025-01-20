package javaRevision.otherTypeClasses;

import java.util.List;
import java.util.stream.Stream;

public class DemoData{
    public static void main(String[] args) {
        DemoInterface demo = new DemoImpl();
        System.out.println(demo.getSqr());
        System.out.println(DemoImpl.data);
        DemoInterface.demoMethod(10);
        System.out.println(demo.getSumUptoNumber(10));
    }
}
class DemoImpl implements DemoInterface{
    @Override
    public int getSumUptoNumber(int i) {

        return Stream.iterate(1, x->x+1).limit(i).reduce(0,Integer::sum);
    }
}
