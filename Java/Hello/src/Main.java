class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("Hola Mundo");
        UberX uberX = new UberX("AMQ123", new Account(01, "Andres Herrera", "AND123", "prueba@gmail.com", "1234"), "Chevrolet", "Sonic");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("FGH345", new Account(02, "Andres Herrera", "AND123", "prueba@gmail.com", "1234"));
        uberVan.setPassenger(6);

        // Car car2 = new Car("QWE567", new Account("Andrea Herrera", "ANDA876"));
        // car2.passengers = 3;
        // car2.printDataCar();
    }
}