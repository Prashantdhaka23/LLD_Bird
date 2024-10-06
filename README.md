
# Bird LLD (Low-Level Design)

This project implements a Low-Level Design (LLD) for a bird hierarchy featuring five types of birds: **Pigeon**, **Crow**, **Sparrow**, **Ostrich**, and **Penguin**. The design adheres to SOLID principles to ensure maintainability, scalability, and reuseability.

## Requirements

- **Bird Types**:
  - **Crow**: Can fly and makes a sound ("Caw").
  - **Sparrow**: Can fly and makes a sound ("Chirp").
  - **Pigeon**: Can fly but makes a sound ("Coo").
  - **Ostrich**: Cannot fly but makes a sound ("Boom").
  - **Penguin**: Cannot fly but makes a sound ("Squawk").

- **Behaviors**:
  - All birds can eat and make sounds.
  - Crow and Sparrow have the same flying behavior.

## SOLID Principles

- **Single Responsibility Principle (SRP)**: Each bird class handles its own behavior (flying, eating, making sounds).
  
- **Open/Closed Principle (OCP)**: The design allows for the addition of new bird types without modifying existing code.

- **Liskov Substitution Principle (LSP)**: Subtypes (e.g., Crow, Sparrow) can be used interchangeably where the base type (Bird) is expected.

- **Interface Segregation Principle (ISP)**: Specific interfaces are created for behaviors, ensuring that classes only implement what they need.

- **Dependency Inversion Principle (DIP)**: Higher-level modules do not depend on lower-level modules, but both depend on abstractions (interfaces).

## Usage

To create and interact with different bird types:

```java
Bird crow = new Crow();
System.out.println(crow.fly()); // Outputs: "Flying like Crow/Sparrow"
System.out.println(crow.makeSound()); // Outputs: "Caw Caw Caw"

Bird pigeon = new Pigeon();
System.out.println(pigeon.makeSound()); // Outputs: "Coo Coo Coo"
```

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/Prashantdhaka23/LLD_Bird.git
   cd LLD_Bird
   ```

2. Build the project:
   ```bash
   mvn clean install
   ```

## Testing

To run the tests, execute:

```bash
mvn test
```

## Contributing

Contributions are welcome! Please create a pull request or raise an issue for any suggestions or improvements.

## License

This project is licensed under the MIT License.
