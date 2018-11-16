package lesson04.school;

public class FlashDrive implements USBDevice, Comparable {

    private String vendor;
    private int size;

    public FlashDrive(String vendor, int size) {
        this.vendor = vendor;
        this.size = size;
    }

    public FlashDrive() {
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "FlashDrive{" +
                "vendor='" + vendor + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        FlashDrive other = (FlashDrive) o;

        if (this.size > other.size) {
            return 1;
        }
        if (this.size < other.size) {
            return -1;
        }

        return 0;
    }

    @Override
    public int getDevID() {
        return hashCode();
    }

    @Override
    public String getDevDescr() {
        return toString();
    }
}
