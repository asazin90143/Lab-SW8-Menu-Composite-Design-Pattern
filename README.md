# Restaurant POS - Composite Design Pattern Lab

## Project Description
This project implements a hierarchical menu system for a restaurant using the **Composite Design Pattern**. It allows the system to treat individual menu items and bundled categories (like value meals) uniformly.

## Implementation Details
- **Pattern:** Composite
- **Language:** Java
- **Structure:**
    - `MenuComponent`: The interface for all menu elements.
    - `MenuItem`: Leaf nodes representing individual items.
    - `MenuCategory`: Composite nodes representing groups of items or sub-categories.

## How to Run
1. Compile all files: `javac *.java`
2. Run the main application: `java RestoApp`

## Expected Output
MAIN MENU
BARKADA SOLO MEAL
  Classic Burger: P250.00
  Large Fries: P85.00
  Root Beer: P60.00
  Vanilla Sundae: P45.00
===
Total Menu Value: P440.00