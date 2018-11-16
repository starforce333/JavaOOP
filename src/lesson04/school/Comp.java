package lesson04.school;

public class Comp {

    private String cpu;
    private long ram;

    public Comp(String cpu, long ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public long getRam() {
        return ram;
    }

    public void setRam(long ram) {
        this.ram = ram;
    }

    public void connectToUsb (USBDevice device) {
        System.out.println("Device ID = " + device.getDevID());
        System.out.println("Device: " + device.getDevDescr());
        System.out.println("Connect");

    }

    @Override
    public String toString() {
        return "Comp{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                '}';
    }
}
