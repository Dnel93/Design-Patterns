package Creational.Builder;

public class ComputerBuilder {
    // required parameters
    private String HDD;
    private String RAM;

    // optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public ComputerBuilder(String hdd, String ram){
        this.HDD=hdd;
        this.RAM=ram;
    }

    public ComputerBuilder setGraphicsCardEnabled(boolean graphicsCardEnabled) {
        this.isGraphicsCardEnabled = graphicsCardEnabled;
        return this;
    }

    public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
        this.isBluetoothEnabled = bluetoothEnabled;
        return this;
    }

    public Computer build() {
        return new Computer(this);
    }
}
