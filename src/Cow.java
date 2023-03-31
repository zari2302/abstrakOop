public class Cow extends DomestikAnimals{
    private String nicName;

    public Cow() {
    }

    public Cow(int weight, int age, String gender, String nicName) {
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
        return "Cow: " +
                "nicName: " + nicName + "\n" + super.toString();
    }
}
