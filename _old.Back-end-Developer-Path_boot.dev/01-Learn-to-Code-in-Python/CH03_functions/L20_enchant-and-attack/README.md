# **Enchant and Attack**

In Fantasy Quest, a weapon can be enchanted to do *bonus* damage.

## **Assignment**

**Complete the `enchant_and_attack` function**. It creates a new "enchanted" name for a weapon and calculates how much damage the enchanted weapon will deal to a targeted enemy.
It accepts 3 parameters:

- `target_health`: integer
- `damage`: integer
- `weapon`: string
  It should do the following things in the function body:
- [ ] Calculate and store the "enchanted damage" in a new variable. The enchanted damage should be the input `damage` plus `10`.
- [ ] Calculate and store the "new health" in a new variable. The new health should be the input `target_health` minus the enchanted damage.
- [ ] Create a new variable called `enchanted_weapon`. It should be the input `weapon` with the string "enchanted " added to the beginning of it. For example:
  1. `sword` -> `enchanted sword`
  2. `axe` -> `enchanted axe`
- [ ] Return the enchanted weapon and the new health in that order.
