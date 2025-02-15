# TD Révision - ParkCar Application

## Description

The "ParkCar" company specializes in Java development and aims to create a Java application for car wash stations. This application provides real-time information to station administrators about the vehicles currently being processed. The system is designed with the following classes:

### Classes Overview

1. **Vehicule**
   - Attributes:
     - `id` (integer): The unique identifier for the vehicle.
     - `marque` (String): The brand of the vehicle.
     - `typeDeCarburant` (String): The type of fuel the vehicle uses.
   - Methods:
     - Constructor with parameters.
     - Getters and Setters.
     - `toString()` method.
     - `equals()` method: Vehicles are identical if they have the same `id` and `marque`.

2. **Voiture**
   - Inherits from `Vehicule`.
   - Additional attribute:
     - `couleur` (String): The color of the car.
   - Methods:
     - Constructor with all attributes.
     - `toString()` method.

3. **Camion**
   - Inherits from `Vehicule`.
   - Additional attribute:
     - `nbrPlace` (integer): The number of seats in the truck.

4. **Station**
   - Attributes:
     - `id` (integer): The unique identifier for the station.
     - `nom` (String): The name of the station.
     - `vehicules` (Array): A collection of vehicles, with a maximum capacity of 10.
   - Methods:
     - Default constructor.
     - Parameterized constructor.
     - `ajouterVehicule()`: Adds a new vehicle for processing, ensuring no duplicate vehicles.
       - Exception: `AjoutVoitureException` is thrown if a duplicate vehicle is added.
     - `toString()` method: Displays station details and its vehicles.
     - `NbrVoitureEssence()`: Returns the number of cars using "essence" as fuel.
     - `NbrVoitureNoire()`: Returns the number of black cars currently being processed.

---

## Tasks to Implement

1. **Vehicule Class**
   - Implement:
     - A parameterized constructor.
     - Getters and Setters for all attributes.
     - `toString()` method.
     - `equals()` method based on `id` and `marque`.

2. **Voiture Class**
   - Implement:
     - A constructor specifying all characteristics.
     - `toString()` method.

3. **Station Class**
   - Implement:
     - Default constructor.
     - Parameterized constructor with all attributes.
     - `ajouterVehicule()`:
       - Checks if the vehicle is already being processed.
       - Throws `AjoutVoitureException` if a duplicate vehicle is added.
     - `toString()` method.
     - `NbrVoitureEssence()` to count vehicles with "essence" fuel type.
     - `NbrVoitureNoire()` to count black vehicles.

---

## Notes

- The station cannot process more than 10 vehicles simultaneously.
- Exception handling is required for duplicate vehicles.

---

## How to Use

1. Clone the repository.
2. Implement the classes and methods as described.
3. Test the functionalities to ensure correctness.
4. Run the application to simulate the car wash station management system.
