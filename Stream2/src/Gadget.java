public class Gadget {
    private String name;
    private String type;
    private String manufacturer;
    private double price;

    
    public Gadget() {
        super();
    }

    public Gadget(String name, String type, String manufacturer, double price) {
        this.name = name;
        this.type = type;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
