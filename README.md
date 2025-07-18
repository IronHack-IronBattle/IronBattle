# 🛡️ IronBattle

**IronHack Java Lab**  
Un simulador de batalla RPG por rondas entre guerreros (`Warrior`) y magos (`Wizard`), con un menú interactivo en consola.

---

## 📁 Estructura del proyecto

- `src/`
  - `characters/`
    - `Character.java` ← clase abstracta base
    - `Warrior.java` ← subclase: Guerrero (usa stamina y fuerza)
    - `Wizard.java` ← subclase: Mago (usa mana e inteligencia)
  - `interfaces/`
    - `Attacker.java` ← interfaz con método attack()
  - `game/`
    - `BattleSimulator.java` ← menú principal + lógica del combate

---

## ⚙️ Funcionalidades

- Crear personajes personalizados (nombre, atributos).
- Simular combates entre guerreros y magos.
- Lógica de batalla por rondas (daño simultáneo).
- Empate reinicia la batalla.
- Menú de navegación por consola.
- Registro completo de la batalla mostrado por pantalla.

---

## 🚀 Cómo compilar y ejecutar

### 1. Compilar todos los archivos Java

```bash
javac src/org/example/**/*.java
