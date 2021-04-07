package Creational.Builder;

public class TestBuilder {

    public static void main(String[] args) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues

        Computer computer = new ComputerBuilder("2 TB", "2GB")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();
        System.out.println(computer);

        Computer computer2 = new ComputerBuilder("2 TB", "2GB")
                .setBluetoothEnabled(true)
                .build();
        System.out.println(computer2);
    }
}
