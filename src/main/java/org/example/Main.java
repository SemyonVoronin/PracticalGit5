package org.example;
public class Main {    
  public static int fib(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return fib(n-1) + fib(n-2);

    }
    public static void main(String[] args) {
        House house = new House(15);
        System.out.println(house);
      
        for (int i = 0; i < 10; i++) {
              System.out.println(fib(i));
          }
    }
}
class House {
    public final int floors;

    public House(int floors) {
        if (floors <= 0)
            throw new IllegalArgumentException("Floors must be positive");

        this.floors = floors;
    }

    @Override
    public String toString() {
        String str = "дом с " + floors;

        if (floors % 10 == 1 && floors % 100 != 11) {
            return str + " этажом";
        }

        return str + " этажами"; 
    }

}