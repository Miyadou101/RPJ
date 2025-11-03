package player;

public class Character {
    private String name;
    private int health;
    private int maxHealth;
    
    private int level;
    private int experience;

    private int strength;
    private int agility;
    private int intelligence;



   public Character(String name, int health, int maxHealth, int strength, int agility, int intelligence) {
        this.name = name;
        this.health = health;
        this.maxHealth = maxHealth;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.level = 1;
        this.experience = 0;
   }

   public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public int getMaxHealth() {
        return maxHealth;
    }
    public int getLevel() {
        return level;
    }
    public int getExperience() {
        return experience;
    }
    public int getStrength() {
        return strength;
    }
    public int getAgility() {
        return agility;
    }
    public int getIntelligence() {
        return intelligence;
    }

    public void displayStats() {
        System.out.println("=== " + name + " ===");
        System.out.println("Level: " + level);
        System.out.println("Health: " + health + "/" + maxHealth);
        System.out.println("Experience: " + experience);
        System.out.println("Strength: " + strength);
        System.out.println("Agility: " + agility);
        System.out.println("Intelligence: " + intelligence);
   }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public void gainExperience(int exp) {
        experience += exp;
        while (experience >= level * 100) {
            experience -= level * 100;
            levelUp();

        }
    }

    private void levelUp() {
        level++;
       
    }



}