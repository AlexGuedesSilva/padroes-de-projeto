# Bridge Design Pattern - Java Implementation

## 📌 Intent

The **Bridge Design Pattern** is a structural pattern that **decouples an abstraction from its implementation** so that both can vary independently. It is useful when both the **abstractions** and their **implementations** need to be extended through **inheritance**.

---

## 🧩 Key Concepts

- **Abstraction**: Defines the interface for the control part of the two class hierarchies. It maintains a reference to an object of the implementation hierarchy.
- **Refined Abstraction**: Extends the interface defined by Abstraction.
- **Implementor**: Defines the interface for implementation classes.
- **Concrete Implementor**: Implements the Implementor interface.

---

## 🏗 Structure

- `Device` (Implementor): Defines operations like `turnOn`, `turnOff`, `setVolume`, etc.
- `Tv`, `Radio` (Concrete Implementors): Provide specific implementations of `Device`.
- `RemoteControl` (Abstraction): Contains a reference to a `Device` and delegates operations.
- `AdvancedRemoteControl` (Refined Abstraction): Extends `RemoteControl` with additional features like `mute`.
- `BridgePatternDemo` (Client): Demonstrates usage of the abstraction and implementation.

---

## 🎯 Benefits

- **Decouples abstraction and implementation**.
- **Improves code extensibility**: You can extend abstraction and implementation independently.
- **Reduces code duplication**: Avoids a complex inheritance hierarchy.

---

## 📦 Package Structure

```
com.example.bridge
├── app
│   └── BridgePatternDemo.java
├── abstraction
│   ├── RemoteControl.java
│   └── AdvancedRemoteControl.java
├── implementation
│   ├── Device.java
│   ├── Tv.java
│   └── Radio.java
```

---

## 🖼 UML Class Diagram

```
       Abstraction                        Implementor
   --------------------            -----------------------
   | RemoteControl       |<>------>|     Device           |
   --------------------            -----------------------
            ▲                                 ▲
            |                                 |
   ----------------------          -----------------------
   | AdvancedRemoteControl |      |       Tv             |
   ----------------------          |      Radio           |
                                   -----------------------
```

---

## 🧪 Use Cases

- When you want to avoid a permanent binding between abstraction and implementation.
- When implementation might change frequently or need to support multiple platforms/devices.
- When you want to share an implementation among multiple objects.

---

## 📚 References

- GoF – Design Patterns: Elements of Reusable Object-Oriented Software
- [Refactoring Guru - Bridge Pattern](https://refactoring.guru/design-patterns/bridge)
