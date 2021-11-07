package de.fherfurt.manufactor;

public class Car {

  private String name;
  private int numberOfSeats;
  private double loadCapacity;
  private int horsePower;


  public Car( String name, int numberOfSeats, double loadCapacity, int horsePower ) {
    this.name = name;
    this.numberOfSeats = numberOfSeats;
    this.loadCapacity = loadCapacity;
    this.horsePower = horsePower;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNumberOfSeats() {
    return numberOfSeats;
  }

  public void setNumberOfSeats(int numberOfSeats) {
    this.numberOfSeats = numberOfSeats;
  }

  public double getLoadCapacity() {
    return loadCapacity;
  }

  public void setLoadCapacity(double loadCapacity) {
    this.loadCapacity = loadCapacity;
  }

  public int getHorsePower() {
    return horsePower;
  }

  public void setHorsePower(int horsePower) {
    this.horsePower = horsePower;
  }
}
