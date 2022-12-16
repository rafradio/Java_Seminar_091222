public class Notebook {
    private String name;
    private String system;
    private String color;
    private String price;
    private String keyboard;
    private String display;

    public Notebook(String name, String sys, String color, String price, String keyboard, String display) {
        this.name = name;
        this.system = sys;
        this.color = color;
        this.price = price;
        this.keyboard = keyboard;
        this.display = display;

    }

    public String toString () {
        return this.name;
    }

}
