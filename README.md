# 🛡️ IronBattle

**IronHack Java Lab**  
A round-based RPG battle simulator where warriors and wizards face off in epic combat, featuring an interactive 
console menu. Choose between a **Warrior** 🥷 or a **Wizard** 🧙‍♂, create your heroes, and watch them fight until 
only one is left standing.... or none at all!
---

## 📁 Project Structure

```src/ 
├── org.example
│ ├── org.example.game 
│ │ └── BattleSimulator.java          ← Battle logic, statistics, winner and loser
│ ├── org.example.character 
│ │ ├── Character.java                ← Abstract basic class
│ │ ├── Warrior.java                  ← Class Warrior extends Character
│ │ └── Wizard.java                   ← Class Wizard extends Character
│ ├── org.example.interfaces 
│ │  └── Attacker.java                ← Common interface for the attack
│ └── Main.java                       ← Entry point
```

---

## 🚀 How to Execute

1. Clone the repository:
   ```bash
   git clone https://github.com/IronHack-IronBattle/IronBattle.git
2. Open the project with **IntelliJ IDEA**.
3. Navigate to the Main.java class: src/main/java/org/example/Main.java
4. Right-click the Main class and select **Run Main**.
5. The simulator will be shown in the console and the game simulation will start and show you:
   - 1️⃣ Create new player 
   - 2️⃣ List all players
   - 3️⃣ Start battle
   - 4️⃣ Exit
   - 🔎 Choose an option
6. Enjoy the fight with a bunch of automatic rounds and visual emojis! 🥷⚔️🧙‍♂️️👊🔥 

## ⚙️ Functionality

1️⃣ Create new player:
  - You can create as many personalised players as you want (a minimum of 2).
  - Choose a character type for each player:
    - Warrior 🥷 with special attributes (Stamina and Strength)
    - Wizard 🧙‍♂️ with special attributes (Mana and Intelligence)

2️⃣ List of players:
  - You will be able to see the list of all players that you have created and their HP (Health Points).

3️⃣ Start battle:
  - The battle will start, but first you will need to select the two players by their index.
  - Round-based battles until one player (or both) lose all their HP, with a one-second pause between each round.
  - The battle can end in a tie! The battle will automatically start  again. The HP will be randomly set again.
  - Visible statistics of the battle in the console.
  - Emojis for visual attacks and effects.
  - Option to play multiple battles without restarting the program.

4️⃣ Exit: 
  - Leave the game.
---
 ## 🛠️ Technologies
- Java
- IntelliJ IDE
- Git & GitHub
- ChatGPT, Copilot

---
## About the Project

### Overall Development

### Extras
- Loser
- Pause

### Biggest Challenges
- Team organization and team communication
- Setting the project correctly from the beginning 
- GITHUB


### Pending and Extra Features
- Team Game or Battle Royal: Being able to play in teams. The user would create several players and would be able to 
  choose the number of players for each team. 
- Equipment: Choosing a better weapon or a shield for the Warrior or a defensive spell or a better staff for the 
  Wizard, which would improve the 
  attack stats.

---
## About the Team