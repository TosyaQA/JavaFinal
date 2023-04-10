package Final;

public class NoteBook {

    private int RAM;
    private int ROM;
    private String OS;
    private String color;
    private Boolean power = false;

    public NoteBook(int RAM, int ROM, String OS, String color) {
        this.RAM = RAM;
        this.ROM = ROM;
        this.OS = OS;
        this.color = color;
    }

    public int getRAM() {
        return this.RAM;
    }

    public int getROM() {
        return this.ROM;
    }

    public String getOS() {
        return this.OS;
    }

    public String getColor() {
        return this.color;
    }

    public void turnOn() {
        this.power = true;
    }

    public void turnOff() {
        this.power = false;
    }

    public String getSpecification() {
        return "ОС: " + this.OS + ", RAM: " + this.RAM + "ГБ, ROM: " + this.ROM + "ГБ, цвет: " + this.color + ".";
    }

}
