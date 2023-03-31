public class Sheep extends DomestikAnimals {
    String nicName;

    public Sheep() {
    }

    public Sheep(int weight, int age, String gender, String nicName) {
        super(weight, age, gender);
        this.nicName = nicName;
    }

    public String getNicName() {
        return nicName;
    }

    public void setNicName(String nicName) {
        this.nicName = nicName;
    }

    @Override
    public String toString() {
        return "Sheep: " +
                "nicName: " + nicName + "\n" + super.toString();
    }
}
