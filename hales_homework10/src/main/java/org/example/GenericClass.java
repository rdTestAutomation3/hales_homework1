package org.example;

public class GenericClass<T>{
    private T value;

    //Constructor
    public GenericClass(T value) {
        this.value=value;
    }

    //Değeri ekrana yazdıran metot
    public void printValue() {
        System.out.println("Değer: " + value);
    }

    public static void main(String[] args) {
        //Farklı tipte değerlerle sınıfı kullanma
        GenericClass<String> stringInstance = new GenericClass<>("Hoş geldin yeni yıl");
        stringInstance.printValue();

        GenericClass<Integer> intInstance = new GenericClass<>(2025);
        intInstance.printValue();

        GenericClass<Double> doubleInstance = new GenericClass<>(99.99);
        doubleInstance.printValue();
    }
}



