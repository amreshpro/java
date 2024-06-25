package  src;
class  OOPS1{
    public static void main(String[] args) {
        Car c1 = new Car("Baleno Swift", "White");
  c1.displayDetail();
    }
}


class Car{
    String color;
    String model;
//    cosntructor
    Car(){

    }
     Car(String model,String color){
        this.color = color;
        this.model = model;
    }
    void updateCar(String model,String color){
        this.color = color;
        this.model = model;
    }
    void displayDetail(){
        System.out.println("Model: "+this.model + ", Color: "+this.color);
            }

}