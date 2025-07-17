# 📬 Padrão Mediator em Java

Este repositório demonstra o uso do **Padrão Mediator** (comportamental) em Java.

## 🧩 Objetivo

Centralizar a comunicação entre objetos (**Colleagues**) através de um **Mediator**, reduzindo o acoplamento direto entre eles.

---

## 📦 Estrutura de pacotes

	designpattern.behavior.mediator
	│
	├── Mediator.java
	├── ConcreteMediator.java
	│
	├── colleagues
	│ ├── Colleague.java
	│ └── ConcreteColleague.java
	│
	└── app
	└── MainApp.java
	
	

---

## 📐 Diagrama UML

	```text
	+----------------+           +--------------------+
	| «interface»    |           | ConcreteMediator   |
	| Mediator       |◄──────────| - colleagues: List |
	| +register(...) |           | +register(...)     |
	| +relay(...)    |           | +relay(...)        |
	+----------------+           +--------------------+
	       ▲                            ▲
	       |                            |
	+----------------+           +----------------------+
	| Colleague      |           | ConcreteColleague    |
	| - mediator     |           | - name: String       |
	| +send(...)     |           | +receive(...)        |
	| +receive(...)  |           +----------------------+
	+----------------+
		
	
## ✅ Vantagens

Desacoplamento: colegas falam apenas com o Mediator, não entre si.

Centralização: lógica de comunicação concentrada em um único ponto.

Flexibilidade: adição de novos colegas sem alterar os demais .

## ⚠️ Desvantagens
O Mediator pode se tornar excessivamente complexo ("God Object") se absorver muita lógica.

## 📌 Quando aplicar?
Em sistemas com várias interações complexas — ex: GUI, chat, tráfego aéreo .

Quando deseja-se reduzir o número de dependências diretas entre objetos.

## 📝 Alex Guedes
Feito com diversão para organização didática do Padrão Mediator em Java.
Sinta-se à vontade para abrir issues ou contribuir!