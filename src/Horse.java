public class Horse extends DomestikAnimals {
    String color;
    String nicName;

    public Horse() {
    }

    public Horse(int weight, int age, String gender, String color, String nicName) {
        super(weight, age, gender);
        this.color = color;
        this.nicName = nicName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNicName() {
        return nicName;
    }

    public void setNicName(String nicName) {
        this.nicName = nicName;
    }

    @Override
    public String toString() {
        return "Horse: " +
                "color: " + color + "\n" +
                "nicName: " + nicName + "\n" + super.toString();
    }
}
