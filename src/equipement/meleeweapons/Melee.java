package equipement.meleeweapons;


public class Melee {
    private int meleeDamage;
    private double meleeWeight;


    public Melee(int meleeDamage, double meleeWeight) {
        this.meleeDamage = meleeDamage;
        this.meleeWeight = meleeWeight;

    }

    public int getMeleeDamage() {
        return meleeDamage;
    }
    public double getMeleeWeight() {
        return meleeWeight;
    }

    public String getMeleeName() {
        return null;
    }

    

}

