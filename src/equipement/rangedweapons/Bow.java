package equipement.rangedWeapons;


public class Bow extends Ranged {
    private int range;
    private String ammoType;

    public Bow(String rangedName, int rangedDamage, int range, String ammoType) {
        super(rangedName, rangedDamage);
        this.range = range;
        this.ammoType = ammoType;
    }
}