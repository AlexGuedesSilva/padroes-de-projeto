# 🏭 Factory Method - Padrão de Criação

Este projeto demonstra o uso do padrão de projeto **Factory Method** em Java, com uma estrutura realista, separada por pacotes.

---

## 📌 O que é o Factory Method?

O **Factory Method** é um padrão de criação que fornece uma **interface para criar objetos**, mas permite que as subclasses decidam **quais classes instanciar**. Ele **desacopla a criação do objeto** do seu uso, facilitando a expansão e manutenção do código.

---

## 🧱 Estrutura do Projeto

	factory-method/
	├── Main.java
	├── factory/
	│ ├── TransportFactory.java
	│ ├── CarFactory.java
	│ └── BikeFactory.java
	├── transport/
	│ ├── Transport.java
	│ ├── Car.java
	│ └── Bike.java
	
---	
	
## ✅ Vantagens
Criação de objetos desacoplada do código cliente

- Fácil de estender com novas classes.

- Mantém o código organizado e de fácil manutenção.	
	
---		
	
## 🧠 Participantes

**Transport** → Interface do produto

**Car / Bike** → Implementações concretas

**TransportFactory** → Fábrica abstrata com o método createTransport()

**CarFactory / BikeFactory** → Fábricas concretas

**Main** → Cliente que usa o factory method