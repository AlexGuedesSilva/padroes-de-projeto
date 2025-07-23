# 🎬 Padrão Facade em Java

Este projeto demonstra o uso do **Facade Pattern**, permitindo ao cliente controlar um sistema complexo (Home Theater) por meio de uma interface simples.

## 🧠 Propósito

O **Facade** fornece uma interface de nível mais alto que torna um subsistema complexo mais simples para uso, sem expor seus detalhes internos (GOF et al.).

### ✅ Vantagens

- Reduz acoplamento entre cliente e subsistemas internos  
- Simplifica chamadas repetitivas em sequência  
- Facilita manutenção e evolução dos subsistemas.

### ⚠️ Desvantagens

- Pode se tornar uma classe muito grande se concentrar lógica demais no Facade  
- Nem sempre necessário em subsistemas muito simples

---

## 📦 Estrutura de pacotes

	designpattern.facade
	├─ facade/
	│ └─ HomeTheaterFacade.java
	├─ subsystem/
	│ ├─ Amplifier.java
	│ ├─ Tuner.java
	│ ├─ DvdPlayer.java
	│ ├─ CdPlayer.java
	│ └─ Projector.java
	└─ app/
	└─ MainApp.java
	

---

## 🧩 Componentes

- **Facade (`HomeTheaterFacade`)**  
  Engloba múltiplos subsistemas e expõe métodos simples como `watchMovie()` e `endMovie()`  

- **Subsystems**:  
  - `Amplifier`, `Tuner`, `DvdPlayer`, `CdPlayer`, `Projector`  
  - Cada classe encapsula comportamento específico do sistema  

- **Client (`MainApp`)**  
  Utiliza apenas o Facade, sem conhecer detalhes internos dos subsistemas

---

## 🚀 Como usar

1. Clone o repositório  
2. Compile com `javac` ou dentro da sua IDE  
3. Execute `MainApp`  
4. Veja no console o fluxo simplificado de operação

---

## 🔗 Referências

- Facade Pattern – definições e casos de uso.

---

## 👨‍💻 Contribuições

Pull‑requests são bem‑vindos. Para melhorias, adicione novos métodos ao Facade ou inclua suporte a mais subsistemas (como `StreamingService`, `Lights`, etc.).

---

## 📝 Alex Guedes

Feito com diversão — este projeto exemplifica um uso prático e organizado do padrão Facade em Java.
	