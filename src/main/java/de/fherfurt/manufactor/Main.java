package de.fherfurt.manufactor;

public class Main {

  public static void main(String[] args) {
    // Create a new Address for the Manufacturer
    Address address = new Address("Industriestrasse", 3, "Waltershausen",
      "99880", "Deutschland");

    // Create Manufacturer by calling the Constructor
    Manufacturer m = new Manufacturer("Multicar", address, 1250, 4);

    // Add some revenues to our Manufacturer Instance m
    m.addRevenue(23.8, 2012);
    m.addRevenue(new Revenue(23.6, 2013));

    // Also add some cars
    for (int index = 0; index < 10; ++index) {
      System.out.println("Current index: " + index);
      m.addCar("M31", 2, 3110.0, 145);
//      m.addCar(new Car("TREMO", 2, 2550.0, 102));
    }
  }
}
