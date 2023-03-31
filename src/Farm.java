import java.util.Arrays;

public class Farm {
    private String adress;
    private Cow[] cows;
    private Sheep[] sheeps;
    private Horse[] horses;
    private String ownerName;

    public Farm() {
    }

    public Farm(String adress, Cow[] cows, Sheep[] sheeps, Horse[] horses, String ownerName) {
        this.adress = adress;
        this.cows = cows;
        this.sheeps = sheeps;
        this.horses = horses;
        this.ownerName = ownerName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm: " +
                "adress: " + adress + "\n" +
                "cows: " + Arrays.toString(cows) + "\n" +
                "sheeps: " + Arrays.toString(sheeps) + "\n" +
                "horses: " + Arrays.toString(horses) + "\n" +
                "ownerName: " + ownerName + "\n";
    }
}


