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

## 🎮 Functionality

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
- Canva: https://www.canva.com/design/DAGt4j3539M/b_Q6m5Mfr2wS2-kQGoRnfw/edit

---
## ⚙️ About the Project

### 🧩 Overall Development
1. **Development Flow and Pace**
   - We followed a clear sequence:
   → Planning → Implementation → Testing → Documentation Updates
   - Development was carried out on a daily basis 
   - This ensured steady progress and allowed for continuous refinement of the project
2. **Team Collaboration**
   - Tasks were organized and tracked using GitHub Projects
   - We used Slack for quick asynchronous communication
   - Zoom was used for real-time discussions and coordination
   - The setup enabled effective task distribution and strong team alignment
3. **Codebase Structure and Consistency**
   - We defined the project structure and coding style during the planning phase
   - The whole team adhered to those guidelines throughout development
   - All code was:
     - Reviewed collaboratively before merging 
     - Released in sync to ensure consistency and stability

### ⚠️ Biggest Challenges
1. **Project Setup:**
   - The project wasn’t properly structured from the beginning. While each developer was familiar with the intended 
   architecture, the main folder structure and empty packages were not established early on.
   - Developers worked independently on separate branches, each with a different folder organization, which led to 
     conflicts.
2. **Team Organization & Communication:**
   - No Team Leader was designated to set up the main folder structure or create the GitHub repository.
   - It was our first time collaborating in teams for a Web Development project, which made coordination more challenging.
3. **GitHub Workflow:**
   - Our GitHub knowledge was limited at the start.
   - We encountered issues when merging branches and updating the main branch.
   - Navigating GitHub and using the correct commands also presented some difficulties.

### 🎁 Extras
1. **Defeated Player Display**: An additional line is printed in the console to highlight the name of the player who 
   was defeated, giving battles a clearer sense of conclusion.

2. **Round Pause Mechanism**: To create a more engaging and readable battle experience, we introduced a 1-second pause between rounds, allowing players to follow the combat flow with ease.

### 💡Pending and Extra Features
- **Team Battles / Battle Royale Mode**: Players can form teams and create multiple characters, selecting the desired number of fighters per team. This mode opens the door to strategic gameplay with alliances and cooperative combat.

- **Equipment System**: Introduce gear customization, allowing Warriors to equip enhanced weapons and shields, and Wizards to choose improved staffs or defensive spells. These upgrades would boost attack or defense stats and add tactical depth to each battle.

---
## 🧑‍💻 About the Team
🌍 We are an international team with members who speak Spanish, English, Catalan, Russian, and Italian. We come from diverse professional and cultural backgrounds, which enriches our collaboration and brings multiple perspectives to the development of the project.