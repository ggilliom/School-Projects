import java.util.Scanner;

public class CarRentalMain
{
  public static void main(String[] args)
  {
    Scanner garrett = new Scanner(System.in);
    System.out.println("What is the make of your car?");
    String make = garrett.nextLine();
    System.out.println("What is the model of your car?");
    String model = garrett.nextLine();
    System.out.println("What is the license plate of your car?");
    String plate = garrett.nextLine();
    CarRental car = new CarRental(plate);
    car.findCode();
    System.out.println("Make = " + make);
    System.out.println("Model = " + model);
    System.out.println(plate + " = " + car + "\n");
    
    System.out.println("What is the make of your car?");
    make = garrett.nextLine();
    System.out.println("What is the model of your car?");
    model = garrett.nextLine();
    System.out.println("What is the license plate of your car?");
    plate = garrett.nextLine();
    car = new CarRental(plate);
    car.findCode();
    System.out.println("Make = " + make);
    System.out.println("Model = " + model);
    System.out.println(plate + " = " + car);
  }
}


