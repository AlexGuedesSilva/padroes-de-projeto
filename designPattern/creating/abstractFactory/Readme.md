## 📌 Quando usar o Abstract Factory
Use Abstract Factory quando seu sistema precisar trabalhar com famílias de objetos relacionados, e você quiser:

🔄 Trocar famílias dinamicamente – por exemplo, alternar entre temas (Light/Dark), tipos de GUI (Desktop/Mobile), ou diferentes bancos de dados – sem alterar o client code
.

🧩 Garantir compatibilidade entre produtos de uma mesma família (ex: Button + Checkbox do mesmo tema).

Manter o código independente das classes concretas, favorecendo modularidade e manutenibilidade, alinhado aos princípios de responsabilidade única e aberto/fechado 
Reddit.

Encapsular criação múltipla de tipos numa interface comum, evitando lógica de criação espalhada e complexidade nos produtos internos.

## ⚠️ Quando não usar
Evite usar Abstract Factory se:

Seu projeto produz apenas uma única família de produtos fixa ou se não há necessidade real de troca de variantes – nesse caso o padrão adiciona complexidade desnecessária.

Só existe um tipo de produto mutável (ex: apenas Button). Nesses cenários, Factory Method ou uma fábrica simples já atende bem 
Medium.

Seu sistema não exige conjuntos consistentes de objetos ou pode requerer mistura entre diferentes famílias – o padrão se torna rígido demais 
Medium.

## 🔍 Comparativo rápido com outros padrões
Padrão	Quando usar	Escopo	Complexidade
Factory Method	Criar um tipo de objeto, substituindo com subclasse	Um produto por uso	Simples
Abstract Factory	Criar famílias de objetos relacionados	Conjunto de produtos (themes, GUIs)	Mais estruturado
Builder	Montar objetos complexos passo a passo	Objeto complexo só	Médio
Facade	Simplificar acesso a subsistemas complexos	Interface simplificada	Reduz couplagem

Factory Method funciona quando varia um único tipo de produto. Já Abstract Factory atua com múltiplos produtos relacionados entre si.

Builder foca na construção gradual de um objeto complexo — não é ideal para múltiplos produtos simultâneos.

Facade pode ser usado junto ao Abstract Factory quando se deseja simplificar a interação com vários subsistemas externos.

# Abstract Factory – Exemplo em Java

Este projeto demonstra o padrão criacional **Abstract Factory** em Java, com duas famílias de produtos: Windows e Mac.

---

## 📁 Estrutura de pacotes

	src/
	└── abstractfactory/
	├── products/
	│ ├── Button.java
	│ └── Checkbox.java
	├── factories/
	│ ├── GUIFactory.java
	│ ├── WindowsFactory.java
	│ └── MacFactory.java
	└── client/
	├── Application.java
	└── Demo.java
	

- `products`: interfaces abstratas de produtos (`Button`, `Checkbox`).
- `factories`: interface `GUIFactory` + fábricas concretas (`WindowsFactory`, `MacFactory`).
- `client`: lógica do cliente genérico (`Application`) e executável (`Demo`).

---

## ✅ Padrão e vantagens
Abstract Factory permite criar famílias de objetos relacionados (botão + checkbox) sem ligar o cliente a classes concretas.

Facilita a adição de novas famílias (ex: tema Escuro) sem modificar o cliente.

Promove baixo acoplamento, modularidade e consistência entre produtos.

## 🛠️ Possíveis extensões
Adicionar temas como DarkFactory com DarkButton, DarkCheckbox.

Suporte a mais produtos (ex: TextField, RadioButton).

Integração com GUI real (Swing, JavaFX).

## 📚 Referências
Estrutura adaptada de Refactoring.guru, GeeksforGeeks, Baeldung.

Base teórica: Gang of Four – Design Patterns.