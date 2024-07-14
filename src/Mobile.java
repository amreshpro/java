package src;

class Android {
    String name;
    String model;
    int price;
    static String device;
void setAndroid(String name,String model,int price){
this.name = name;
this.model = model;
this.price = price;

}
    void display() {
        device = "Phones";
        System.out.println("Name: " + name + " Model: " + model + " Price: Rs." + price);
   System.err.println(device);
    }

    public static void show(Android android) {
        System.out.println("Hello Static");
        System.out.println(android.name +" "+ android.model+" "+ android.price);
    }
}

class Mobile {

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Android android = new Android();
        android.setAndroid("Realme", "Narzo 20", 12000);
        android.display();
        android.show(android);
    }
}