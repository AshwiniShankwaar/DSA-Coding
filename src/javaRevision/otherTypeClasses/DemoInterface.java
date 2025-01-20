package javaRevision.otherTypeClasses;

public interface DemoInterface {
    public static final int data =10;
    static void demoMethod(int i){
        System.out.println("number is :"+i);
    }
    default int getSqr(){
        return (int)Math.pow(data,2);
    }
    abstract int getSumUptoNumber(int i);
}
