package javaRevision.TypeOfClasses;

public class SingleTonClassDemo {
    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getSingleTon();
        SingleTon singleTon2 = SingleTon.getSingleTon();
        SingleTon singleTon3 = SingleTon.getSingleTon();
        System.out.println((singleTon.equals(singleTon2) && singleTon.equals(singleTon3))?singleTon.getClass():"difference");
    }
}

class SingleTon{
    private static SingleTon singleTon=null;
    private static int i=1;
    private SingleTon(){
        System.out.println("counter: "+i++);
    }

    public static SingleTon getSingleTon(){
        if(singleTon==null){
            singleTon = new SingleTon();
        }
        return singleTon;
    }
}
