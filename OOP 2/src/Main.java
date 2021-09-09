public class Main {
    public static void main(String[] args){
        // The Car Task
        ElectricalCar c1=new ElectricalCar("Sedan",5000,2000000,2020,"SSC tuscan");
        GasCar c2=new GasCar(97,6000000,2020,"kayan");
        GasCar c3=new GasCar("Cabriolet",95,1200000,2020,"BMW X6");
        System.out.println(c1.getFuelType());
        System.out.println(c2.getFuelType());
        System.out.println(c3.getFuelType());
        System.out.println("The total number of cars is "+Car.getNumberOfCars());
        System.out.println();// for space between two tasks
        // The Shape Task
        Shape c=new Circle(9);
        Shape s=new Square(8);
        displayShape(c);
        displayShape(s);
    }
    public static void displayShape(Shape shape){
        System.out.println("This shape is "+shape.getShapeName()+" and its area is equal to " +shape.getArea());
    }
}
