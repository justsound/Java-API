import java.util.Objects;

public class Laptop {

    private String company;
    private String color;
    private int RAM;
    private String OS;
    private int hardDisk;

    public Laptop(String company, int RAM, String color, String OS, int hardDisk) {
        this.company = company;
        this.RAM = RAM;
        this.color = color;
        this.OS = OS;
        this.hardDisk = hardDisk;
    }

    public String getTitle() {
        return company;
    }

    public String getOS() {
        return OS;
    }

    public String getColor() {
        return color;
    }

    public int getRAM() {
        return RAM;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    @Override
    public String toString() {
        return "Laptop : " + company + "\' RAM : " + RAM + "\'' color : " + color + "\'' OS: " + OS
                + "\'' hardDisk : "
                + hardDisk + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Laptop))
            return false;
        Laptop laptop = (Laptop) o;
        return company.equals(laptop.company) && color.equals(laptop.color) && RAM == laptop.RAM
                && OS.equals(laptop.OS) && hardDisk == laptop.hardDisk;
    }

    @Override
    public int hashCode() {
        return 6 * company.hashCode() + 12 * hardDisk + 7 * OS.hashCode() + 2 * RAM + 8 * color.hashCode();
    }

}
