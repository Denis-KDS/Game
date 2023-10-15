public class Creature {
    public double attack;
    private double protection;
    private double health;
    private double maxHealth;
    private double regeneration;

    public Creature() {
        attack = 1;
        protection = 1;
        health = 1;
        maxHealth = 1;
        regeneration = 0;
    }

    public Creature(double attack, double protection, double health, double maxHealth, double regeneration) {
        this.attack = attack;
        this.protection = protection;
        this.health = health;
        this.maxHealth = maxHealth;
        this.regeneration = regeneration;
        setHealth(health = maxHealth);
    }

    public void ShowInfo() {
        System.out.println("AD: " + attack + ", Prot: " + protection + ", XP: " + health + "/" + maxHealth +  ",  Regen: " + regeneration);
    }

    //Геттеры на 4 особенности
    public double getAttack() {
        return attack;
    }

    public double getProtection() {
        return protection;
    }

    public double getMaxHealth() {
        return maxHealth;
    }

    public double getHealth() {
        return health;
    }

    public double getRegeneration() {
        return regeneration;
    }

    //Сеттеры на 4 особенности
    public void setProtection(double protection) {
        this.protection = protection;
    }

    public void setMaxHealth(double maxHealth) {
        this.maxHealth = maxHealth;
    }
    public void setHealth(double health) {
        this.health = health;
        //System.out.println("NewValueHealtg: " + health);
    }

    public void setRegeneration(double regeneration) {
        this.regeneration = regeneration;
        System.out.println("NewValueReg: " + regeneration);
    }
/*
    public void fight() {
        int CurrentHealth = getHealth();
        int CurrentProtection = getProtection() + 1;
    }
*/

    //сообщение о смерти существа
    public void death() {
        System.out.println("death");
    }

}


