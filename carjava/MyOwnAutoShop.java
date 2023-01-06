public class MyOwnAutoShop {
    public static void main (String[]args){
        Sedan sedan = new Sedan(122,234.1,"blue",21,2.3);
        Ford ford1 = new Ford(789,245.0,"red",312,1234);
        Ford ford2 = new Ford(89,25.0,"green",3,124);
        Car car = new Car(1234,678.8,"grey");

        System.out.println("Sedan price is:" + sedan.getSalePrice());
        System.out.println("ford1 price is:" + ford1.getSalePrice());
        System.out.println("ford2 price is:" + ford2.getSalePrice());
        System.out.println("Car price is:" + car.getSalePrice());


    }
}