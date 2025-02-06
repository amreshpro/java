package src.design_pattern;

//Singleton → When only one instance of a class is required (e.g., database connection).

 class Singleton {

    private static Singleton instance;

    private Singleton(){}

   public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return  instance;
   }

   void showMessage(){
        System.out.println("Hello singleton pattern");
   }

}


public  class SingletonPattern{

     public static void main(String[] args){

         Singleton singleton = Singleton.getInstance();
         singleton.showMessage();
     }

}