package src;

class Janwar{
    void eat(){
        System.out.println("Animal eats");
    }
}

class Kutta extends  Janwar{

    void sound(){
        System.out.println("Dog Barks");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Kutta d = new Kutta();
        d.eat();
        d.sound();
    }
}
