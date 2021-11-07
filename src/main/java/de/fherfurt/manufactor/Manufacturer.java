package de.fherfurt.manufactor;

public class Manufacturer {
  // Some constants
  private static final int MAX_NUMBER_OF_REVENUE_YEARS = 10;
  private static final double EMPTY_REVENUE_VALUE = -1.0;
  private static final String EMPTY_CAR_VALUE = "no car";

  // Some members
  private String name;
  private Address address;
  private int numberOfEmployees;

  // A String array containing the names of all cars
  private Car[] cars;
  // Track the number of cars
  private int currentNumberOfCars = 0;

  // Contains revenues of the last 10 years in millions
  private Revenue[] revenues;

  public Manufacturer(String name, Address address, int numberOfEmployees, int numberOfCars) {
    this.name = name;
    this.address = address;
    this.numberOfEmployees = numberOfEmployees;
    this.cars = new Car[numberOfCars];
    this.revenues = new Revenue[MAX_NUMBER_OF_REVENUE_YEARS];

    // Some other initializations
  }

  public void addRevenue(Revenue newRevenue) {

    for (int index = MAX_NUMBER_OF_REVENUE_YEARS - 1; index > 0; index--) {
      this.revenues[index] = this.revenues[index - 1];
    }

    this.revenues[0] = newRevenue;
  }

  public void addRevenue(double revenue, int year) {
    this.addRevenue(new Revenue(revenue, year));
  }

  public void addCar(Car car) {
    // Still space left for a new car?
    if (currentNumberOfCars < this.cars.length) {
      this.cars[currentNumberOfCars] = car;
      currentNumberOfCars++;
    } else {
      System.out.println("No space for a new car!");
    }
  }

  public void addCar(String name, int numberOfSeats, double loadCapacity, int horsePower) {
    this.addCar(new Car(name, numberOfSeats, loadCapacity, horsePower));
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public int getNumberOfEmployees() {
    return numberOfEmployees;
  }

  public void setNumberOfEmployees(int numberOfEmployees) {
    this.numberOfEmployees = numberOfEmployees;
  }

  public Car[] getCars() {
    return cars;
  }

  public void setCars(Car[] cars) {
    this.cars = cars;
  }

  public int getCurrentNumberOfCars() {
    return currentNumberOfCars;
  }

  public void setCurrentNumberOfCars(int currentNumberOfCars) {
    this.currentNumberOfCars = currentNumberOfCars;
  }

  public Revenue[] getRevenues() {
    return revenues;
  }

  public void setRevenues(Revenue[] revenues) {
    this.revenues = revenues;
  }
}
