package org.example.character;

import org.example.interfaces.Attacker;

public class Warrior extends Character implements Attacker {
    //Specific attributes for Warrior
    private int stamina;
    private int strength;

    public Warrior(String name, int hp) {
        super(name, hp);
        this.stamina = 10 + (int) (Math.random() * 41);
        this.strength = 1 + (int) (Math.random() * 10);
    }

    //Getters and Setters
    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    //Defining the attack
    public void attack(Character target) {
        boolean isHeavyAttack = Math.random() < 0.5; // 50% chance
        int damage;

        if (isHeavyAttack && stamina >= 5) {
            damage = strength;
            stamina -= 5;
        } else if (stamina >= 1) {
            damage = strength / 2;
            stamina += 1;
        } else {
            damage = 0;
            stamina += 2;
        }

        int newHp = target.getHp() - damage;
        target.setHp(Math.max(newHp, 0));

        if (newHp <= 0) {
            target.setAlive(false);
        }
        System.out.println(getName() + " attacks " + target.getName() + " with " +
                (damage == 0 ? "No energy" : isHeavyAttack ? "Heavy Attack" : "Weak Attack") +
                " and deals " + damage + " damage. Current HP: " + target.getHp());
    }
}