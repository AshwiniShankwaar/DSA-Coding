package javaRevision.generic;

// Generic Class
class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

// Usage
public class GenericClassDemo {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setValue(10);
        System.out.println("Integer Box Value: " + intBox.getValue());

        Box<String> strBox = new Box<>();
        strBox.setValue("Hello Generics");
        System.out.println("String Box Value: " + strBox.getValue());
    }
}

