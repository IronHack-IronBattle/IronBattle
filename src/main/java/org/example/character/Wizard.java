package org.example.character;


import org.example.interfaces.Attacker;

public class Wizard extends Character implements Attacker {
    //Specific attributes for Wizard
    private int mana;
    private int intelligence;

    public Wizard(String name, int hp, int mana, int intelligence) {
        super(name, hp);
        this.mana = 10 + (int) (Math.random() * 41);
        this.intelligence = 1 + (int) (Math.random() * 50);
    }

    //Getters and Setters
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    //Defining the attack
    public void attack(Character target) {
        boolean isFireball = Math.random() < 0.5; // 50% chance
        int damage;

        if (isFireball && mana >= 5) {
            damage = intelligence;
            mana -= 5;
        } else if (mana >=1) {
            damage = 2;
            mana += 1;
        } else {
            damage = 0;
            mana += 2;
        }

        int newHp = target.getHp() - damage;
        target.setHp(Math.max(newHp, 0));

        if (newHp <= 0) {
            target.setAlive(false);
        }
        System.out.println(getName() + " attacks " + target.getName() + " with " +
                (damage == 0 ? "no energy" : isFireball ? "Fireball" : "Staff hit")
                + " and deals " + damage + " damage. Target HP is now " + target.getHp());
    }
}