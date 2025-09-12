# Padrão de Projeto - Interpreter (Interpretador)

## 📖 Definição
O **Interpreter Pattern** (Interpretador) é um padrão de projeto **comportamental**.  
Ele define uma representação gramatical para uma linguagem e usa um interpretador para avaliar sentenças dessa linguagem.

É usado principalmente quando precisamos:
- Interpretar **expressões simples** repetidamente.
- Criar uma mini-gramática ou linguagem de regras.
- Modelar árvores de sintaxe de forma clara.

---

## 🛠 Estrutura

- **Expression (Interface/Abstract Class):** Declara o método `interpret`.
- **TerminalExpression:** Implementa a interpretação para símbolos básicos (números, variáveis, constantes).
- **NonTerminalExpression:** Implementa regras gramaticais, combinando outras expressões.
- **Context:** Mantém informações necessárias durante a interpretação (ex: valores de variáveis).
- **Client (InterpreterDemo):** Constrói a árvore de sintaxe abstrata e chama `interpret`.

---

## 🔍 Fluxo do nosso projeto

```mermaid
flowchart LR
    A[Expressão Infixa] --> B[Parser Infixo]
    B --> C[Expressão Pós-fixa (RPN)]
    C --> D[Parser RPN]
    D --> E[Árvore de Expressão]
    E --> F[Interpretador]
    F --> G[Resultado Final]
````
    

## 📂 Estrutura de Pacotes

	com.example.interpreter/
	│── Context.java
	│── InterpreterDemo.java
	│── InfixParser.java
	│── ExpressionParser.java
	│
	└── expression/
	    ├── Expression.java
	    ├── NumberExpression.java
	    ├── VariableExpression.java
	    ├── PlusExpression.java
	    ├── MinusExpression.java
	    ├── MultiplyExpression.java
	    └── DivideExpression.java
		

---

## ▶️ Exemplo

```java
	Context context = new Context();
	context.assign("x", 7);
	context.assign("y", 3);
	
	InfixParser infixParser = new InfixParser();
	ExpressionParser rpnParser = new ExpressionParser();
	
	String exprInfix = "( 10 + x ) * ( y - 2 )";
	String exprPostfix = infixParser.toPostfix(exprInfix);
	
	Expression expression = rpnParser.parse(exprPostfix);
	int result = expression.interpret(context);
	
	System.out.println("Resultado: " + result); // 17
```

---

## ✅ Vantagens
- Clareza ao modelar linguagens simples.  
- Facilidade de expandir a gramática criando novas expressões.
- Permite criar linguagens simples com facilidade.
- Extensível: basta adicionar novas expressões (*, /, %, >, <, etc.).
- O parser infixo torna a sintaxe natural para o usuário.

## ⚠️ Desvantagens
- Complexidade cresce muito para gramáticas grandes.  
- Pode gerar classes em excesso.
- Parsing mais complexo exige bibliotecas próprias (ANTLR, por exemplo).
---

## 🎯 Quando Usar
- Interpretação de expressões matemáticas.  
- Regras de negócio configuráveis por meio de linguagem própria.  
- Implementação de mini DSLs (Domain Specific Languages).
