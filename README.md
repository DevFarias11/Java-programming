# 🧮 Interface-Driven Calculator in Java
A clean Object-Oriented Programming (OOP) project in Java demonstrating **Interface Inheritance**, method contracts, and class implementations according to UML class diagrams.
---
## 📐 UML Class Diagram
```mermaid
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
