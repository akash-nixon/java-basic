class Vehicle {
  protected String brand = "Car";        
  public void fn() {                    
    System.out.println("2015");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";    
  public static void main(String[] args) {
    Car myCar = new Car();
    myCar.fn();
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}
