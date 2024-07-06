package other;

class Base {
    public void hello() {
        System.out.print("Hello");
    }
}

class Sub extends Base {
    @Override
    public void hello() {
        System.out.print("Hello");
    }
}



public class Cast {
    public static void main(String[] args) {

        Base b = new Base();
        Sub c = (Sub) b;// error
        c.hello();
    }
}
