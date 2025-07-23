# 🧠 Strategy Pattern (Padrão de Estratégia) em Java


## 📁 Estrutura de Diretórios
	
	designpattern.behavior/
	│
	├── strategy/
	│   ├── strategy/
	│   │   ├── Strategy.java               # Interface Strategy
	│   │   ├── ConcreteStrategyA.java      # Estratégia concreta A
	│   │   ├── ConcreteStrategyB.java      # Estratégia concreta B
	│   │   └── Context.java                # Classe que usa uma estratégia
	│
	├── app/
	│   └── Main.java                       # Exemplo de uso do padrão
	│
	└── README.md                           # Documentação do padrão


## 💡 Conceito

O padrão **Strategy** define uma **família de algoritmos**, encapsula cada um deles e os torna intercambiáveis. O Strategy permite que o algoritmo varie independentemente dos clientes que o utilizam.

---

## 📦 Estrutura

- **Strategy.java**: Interface comum para todas as estratégias.
- **ConcreteStrategyA/B.java**: Implementações específicas da estratégia.
- **Context.java**: Classe que utiliza o Strategy e delega o comportamento.
- **Main.java**: Demonstração do uso com troca dinâmica da estratégia.

---

## ✅ Vantagens

- Permite a **troca de algoritmos em tempo de execução**;
- Segue o **princípio aberto/fechado** (OCP - Open/Closed Principle);
- Elimina condicionais complexas (ex: switch/case).

---

## ⚙️ Aplicações

- Cálculo de frete com estratégias diferentes (PAC, SEDEX);
- Algoritmos de ordenação;
- Formatação de dados;
- Políticas de desconto;

---

## 🗂️ Pacotes

- `strategy`: Contém as interfaces e implementações do padrão;
- `app`: Código de exemplo / aplicação cliente.

---

## 📌 Exemplo de Saída

	Executando estratégia A
	Executando estratégia B

--- 

## 🧪 Testes
Pode-se usar JUnit para testar cada estratégia isoladamente, garantindo comportamento esperado.

---

## 📚 Referências
GoF: Design Patterns – Strategy

https://refactoring.guru/pt-br/design-patterns/strategy
