public abstract class Instrument {

    private String make;
    private String material;
    private String colour;

    public Instrument(String make, String material, String colour) {
        this.make = make;
        this.material = material;
        this.colour = colour;
    }

    public String getMake() {
        return make;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }
}
