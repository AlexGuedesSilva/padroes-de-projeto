# Adapter Design Pattern - Java Implementation

## 📌 Intent

The **Adapter Design Pattern** is a structural design pattern that allows objects with incompatible interfaces to work together by wrapping an existing class with a new interface.

---

## 🧩 Key Concepts

- **Target**: The interface expected by the client.
- **Adaptee**: The existing class that needs adapting.
- **Adapter**: A wrapper that translates calls from the Target to the Adaptee.
- **Client**: The object that interacts with the Target interface.

---

## 🏗 Structure

- `MediaPlayer` (Target): Defines the domain-specific interface used by the client.
- `VlcPlayer`, `Mp4Player` (Adaptee): Classes with different interfaces.
- `MediaAdapter` (Adapter): Bridges the interface between MediaPlayer and advanced players.
- `AudioPlayer` (Client): Uses MediaAdapter to play various formats.

---

## 🎯 Benefits

- **Reusability**: Reuse existing incompatible classes.
- **Flexibility**: Introduce new adapters without modifying existing code.
- **Single Responsibility**: Separates the conversion logic into a single class.

---

## 📦 Package Structure

```
com.example.adapter
├── app
│   └── AdapterPatternDemo.java
├── adapter
│   └── MediaAdapter.java
├── client
│   └── AudioPlayer.java
├── interfaces
│   ├── MediaPlayer.java
│   └── AdvancedMediaPlayer.java
├── players
│   ├── VlcPlayer.java
│   └── Mp4Player.java
```

---

## 🖼 UML Class Diagram

```
        Client
     ------------
     | AudioPlayer|-------------------
     ------------                    |
            uses                    uses
                                     ▼
                          ---------------------
                          |    MediaAdapter    |
                          ---------------------
                          |  +play(String type)|
                          ---------------------
                                   |
                                   ▼
                      ----------------------------
                      | AdvancedMediaPlayer (IF) |
                      ----------------------------
                           ▲             ▲
                      --------------  --------------
                      |   VlcPlayer |  | Mp4Player  |
                      --------------  --------------

```

---

## 🧪 Use Cases

- Integrating a legacy system with a new system.
- Working with third-party APIs that have different interfaces.
- Providing a consistent interface for different systems.

---

## 📚 References

- GoF – Design Patterns: Elements of Reusable Object-Oriented Software
- [Refactoring Guru - Adapter Pattern](https://refactoring.guru/design-patterns/adapter)
