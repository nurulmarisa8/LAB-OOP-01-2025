package gamemode.models;

public class Hero { // superclass
    private String name;
    protected int health;
    protected int attackPower;

    public Hero(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void attack() {
        System.out.println(name + " menyerang dengan kekuatan " + attackPower + "!");
    }

    public String getName(){
        return name;
    }
    
}



class Archer extends Hero { //subclass
    public Archer(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    public void attack() {
        System.out.println(getName() + " menyerang dengan Panah " + attackPower + "!");
    }
}

class Wizard extends Hero { //subclass
    public Wizard(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    public void attack() {
        System.out.println(getName() + " menyerang dengan sihir " + attackPower + "!");
    }
}

class Fighter extends Hero { //subclass
    public Fighter(String name, int health, int attackPower) {
        super(name, health, attackPower);  
    }

    public void attack() {
        System.out.println(getName() + " menyerang dengan pukulan " + attackPower + "!");
    }
}

