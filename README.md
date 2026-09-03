# 🧮 Interface-Driven Calculator in Java

A clean Object-Oriented Programming (OOP) project in Java demonstrating **Interface Inheritance**, method contracts, and class implementations according to UML class diagrams.

---

## 📐 UML Class Diagram

`mermaid
classDiagram
    direction BT
    class CalculosBasicos {
        <<interface>>
        +multiplicacao(Double, Double) Double
    }

    class Calculos {
        <<interface>>
        +soma(Double, Double) Double
        +subtracao(Double, Double) Double
    }

    class Calculadora {
        +Calculadora()
        +soma(Double, Double) Double
        +subtracao(Double, Double) Double
        +multiplicacao(Double, Double) Double
    }

    Calculos --|> CalculosBasicos : extends
    Calculadora ..|> Calculos : implements
`

---

## 🎯 Core Concepts Applied

- **Interfaces:** Defining clean contracts without implementation details.
- **Interface Inheritance (extends):** Demonstrating how the Calculos sub-interface inherits method declarations from CalculosBasicos.
- **Contract Realization (implements):** The concrete class Calculadora implementing all inherited contracts.
- **Java Best Practices:** Explicit constructor definitions and proper use of @Override annotations.

---

## 🚀 Getting Started

### Prerequisites
- JDK 17 or higher
- Git
- Any Java IDE (IntelliJ IDEA, Eclipse, or VS Code)

### Running the Application
1. Clone the repository:
   `ash
   git clone https://github.com/DevFarias11/Java-programming.git
   `
2. Open the project in your IDE.
3. Locate and run Main.java inside package InterfaceCalculator.