public class Main {
    public static void main(String[] args){
        ElectricalCar c1=new ElectricalCar("Sedan",1000,2000000,2020,"Coupe");
        GasCar c2=new GasCar(92,6000000,2020,"Subra");
        GasCar c3=new GasCar("Cabriolet",97,1200000,2020,"BMW 980");
        System.out.println(c1.getFuelType());
        System.out.println(c2.getFuelType());
        System.out.println(c3.getFuelType());
    }
}