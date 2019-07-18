package test;
/**
 *
 * @author david
 */

import Builder.Computer;

public class TestBuilderPattern {
    public static void main(String[] args) {	
        Computer comp = new Computer
                .ComputerBuilder("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();
        System.out.println(comp.getHDD());
        System.out.println(comp.getRAM());
        System.out.println("BluetoothEnabled: " + comp.isBluetoothEnabled());
        System.out.println("GraphicsCardEnabled: " + comp.isGraphicsCardEnabled());
    }
}