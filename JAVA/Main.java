class Main {
  public static void main(String[] args) {
    Car car = new Car("JKL342", new Driver("jorge", "jor123"));
    car.printDataCar();
    Car car2 = new Car("JKL342", new Account("PERRO", "FASD"));
    car2.printDataCar();

    Driver dr = new Driver("DAS", "document");
    dr.printAccount();

    UberX uberx = new UberX("POL422", new Driver("Pedro", "Ped215"), "chevy", "097");
    uberx.setPassenger(4);
    uberx.printDataCar();

    UberVan uberVan = new UberVan("HJK321", new Driver("Kary", "KAR789"));
    uberVan.setPassenger(6);
    uberVan.printDataCar();

  }
}