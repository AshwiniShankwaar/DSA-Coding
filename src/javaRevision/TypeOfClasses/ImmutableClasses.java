package javaRevision.TypeOfClasses;

public class ImmutableClasses {
    public static void main(String[] args) {
        Immutable i = new Immutable(10,20);
        i.getValue();
        Immutable i2 = i.modify(100,200);
        i2.getValue();
        Immutable i3 = i.modify(10,20);
        i3.getValue();

        System.out.println(i.equals(i2));
        System.out.println(i2.equals(i3));
        System.out.println(i.equals(i3));
    }
}

final class Immutable{
    private int x;
    private int y;
    Immutable(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Immutable modify(int x, int y) {
        if(x == this.x && y == this.y){
            return this;
        }
        return new Immutable(x, y);
    }
    public void getValue(){
        System.out.println(x+" "+y);
    }
}
