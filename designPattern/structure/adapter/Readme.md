# Adapter Design Pattern - Java Implementation

## 📌 Intent

The **Adapter Design Pattern** is a structural design pattern that allows objects with incompatible interfaces to work together by wrapping an existing class with a new interface.


## 📌 Intenção
O padrão de design do adaptador consiste em padrões de design estruturais que permitem que interfaces incompatíveis trabalhem juntas, encapsulando uma classe existente com uma nova interface.

---

## 🧩 Key Concepts

- **Target**: The interface expected by the client.
- **Adaptee**: The existing class that needs adapting.
- **Adapter**: A wrapper that translates calls from the Target to the Adaptee.
- **Client**: The object that interacts with the Target interface.

## 🧩 Conceitos-chave

- **Destino**: A interface esperada pelo cliente.
- **Adaptado**: A classe existente que precisa ser adaptada.
- **Adaptador**: Um wrapper que traduz chamadas do Destino para o Adaptado.
- **Cliente**: O objeto que interage com a interface Destino.

---

## 🏗 Structure

- `MediaPlayer` (Target): Defines the domain-specific interface used by the client.
- `VlcPlayer`, `Mp4Player` (Adaptee): Classes with different interfaces.
- `MediaAdapter` (Adapter): Bridges the interface between MediaPlayer and advanced players.
- `AudioPlayer` (Client): Uses MediaAdapter to play various formats.

## 🏗 Estrutura

- `MediaPlayer` (Destino): Define a interface específica de domínio usada pelo cliente.
- `VlcPlayer`, `Mp4Player` (Adaptee): Classes com diferentes interfaces.
- `MediaAdapter` (Adaptador): Faz a ponte entre o MediaPlayer e players avançados.
- `AudioPlayer` (Cliente): Utiliza o MediaAdapter para reproduzir vários formatos.

---

## 🎯 Benefits

- **Reusability**: Reuse existing incompatible classes.
- **Flexibility**: Introduce new adapters without modifying existing code.
- **Single Responsibility**: Separates the conversion logic into a single class.

## 🎯 Benefícios

- **Reusabilidade**: Reutilize classes incompatíveis existentes.
- **Flexibilidade**: Introduza novos adaptadores sem modificar o código existente.
- **Responsabilidade Única**: Separe a lógica de conversão em uma única classe.

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

## 🧪 Casos de Uso

- Integração de um sistema legado com um novo sistema.
- Trabalho com APIs de terceiros com interfaces diferentes.
- Fornecimento de uma interface consistente para diferentes sistemas.

---

## 📚 References

- GoF – Design Patterns: Elements of Reusable Object-Oriented Software
- [Refactoring Guru - Adapter Pattern](https://refactoring.guru/design-patterns/adapter)

## 📚 Referências

- GoF – Padrões de Projeto: Elementos de Software Reutilizável Orientado a Objetos
- [Refactoring Guru - Padrão Adaptador](https://refactoring.guru/design-patterns/adapter)
