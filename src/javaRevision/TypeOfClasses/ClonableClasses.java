package javaRevision.TypeOfClasses;

public class ClonableClasses {
    public static void main(String[] args) {

        DemoClasses d1 = new DemoClasses(10);
        try {
            DemoClasses d2 = (DemoClasses) d1.clone();
            System.out.println(d1.getValue());
            System.out.println(d2.getValue());

            if(d1.equals(d2)){
                System.out.println("equal");
            }else{
                System.out.println("not equal");
            }
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}

class DemoClasses implements Cloneable {
    int i;
    DemoClasses(int i){
        this.i = i;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public int getValue(){
        return i;
    }
}
