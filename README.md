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

## 📁 Estructura del proyecto final

- `src/`
  - `main/`
    - `java/`
      - `org.example/`
        - `Main.java`                     ← Entry point (el líder del equipo puede gestionar esto)
        - `character/`
          - `Character.java`              ← Clase abstracta base
          - `Warrior.java`                ← Subclase para guerreros
          - `Wizard.java`                 ← Subclase para magos
        - `interface/`
          - `Attacker.java`               ← Interfaz común para el ataque
        - `battle/`
          - `BattleSimulator.java`        ← Gestiona la lógica de la batalla, los registros y el ganador
        - `utils/`
          - `CharacterFactory.java`       ← (Opcional) Crea personajes aleatorios o desde un archivo CSV

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
