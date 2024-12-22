package javaRevision.otherTypeClasses;

sealed class Human permits Nitu,Puja{
    public void love(){
        System.out.println("i love you");
    }
}

non-sealed class Nitu extends Human{
    @Override
    public void love() {
        System.out.println("i love you dada");
    }
}

non-sealed class Puja extends Human{
    @Override
    public void love() {
        System.out.println("I love you besti");
    }
}

public class SealedClassesDemo {
    public static void main(String[] args) {
        Nitu n = new Nitu();
        n.love();
        Puja p = new Puja();
        p.love();
    }
}
