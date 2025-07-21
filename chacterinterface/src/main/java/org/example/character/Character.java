package org.example.character;

import java.util.UUID;

public abstract class Character {
    private String id;
    private String name;
    private int hp;
    private boolean isAlive;

    // Constructor con parámetros
    public Character(String name, int hp) {
        this.id = UUID.randomUUID().toString(); // ID generado automáticamente
        this.name = name;
        this.hp = hp;
        this.isAlive = true; // Por defecto, el personaje está vivo
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public boolean isAlive() {
        return isAlive;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
        if (this.hp <= 0) {
            this.hp = 0;
            this.isAlive = false; // Si los puntos de vida son 0 o menos, el personaje muere
        }
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    // Método toString() para mostrar la información del personaje
    @Override
    public String toString() {
        return "Character{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", isAlive=" + isAlive +
                '}';
    }
}
