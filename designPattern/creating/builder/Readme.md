## 🗂️ Estrutura do projeto

	builder-example/
	  └─ src/main/java/com/example/builder/
	        ├─ product/
	        │    └─ Computer.java        // Produto (complexo)
	        ├─ variants/
	        │    ├─ ComputerBuilder.java // Interface do Builder
	        │    └─ GamingComputerBuilder.java // ConcreteBuilder
	        ├─ director/
	        │    └─ ComputerDirector.java // Diretor opcional
	        └─ Demo.java                 // Cliente (main)
	        
---	       

## 🔄 Comparativo com o Padrão Clássico

| Elemento             | No Código (Projeto)                         | No Padrão Clássico    |
|----------------------|---------------------------------------------|------------------------|
| **Builder (interface)**      | `ComputerBuilder`                        | `Builder`              |
| **Concrete Builder**         | `GamingComputerBuilder`                  | `ConcreteBuilder`      |
| **Director**                 | `ComputerDirector.constructGamingPC()`   | `Director`             |
| **Product**                  | `Computer`                               | `Produto`              |
| **Client**                   | `Demo.java`                              | `Cliente`              |

---

## 🧠 Explicações

- **ComputerBuilder** define uma interface fluida (`storage()`, `graphicsCard()`, `build()`).
- **GamingComputerBuilder** implementa essa interface para configurar um PC Gamer com valores padrão (ex.: 1024GB de armazenamento, GPU ativa), permitindo customização.
- **ComputerDirector** concentra um fluxo de montagem predefinido via `constructGamingPC()`, sem que o cliente precise controlar passo a passo.
- **Computer** é um objeto imutável, criado com segurança pelo builder interno (`Computer.ComputerBuilder`).
- **Demo** ilustra o uso flexível: com `Director` para montagem automática, ou direto no builder para configurações manuais.

---

## 🧩 Vantagens

- Código **fluente**, legível e modular.
- **Imutável** por design (atributos `final` em `Computer`).
- Facilita adoção de novas variantes (**ex.: OfficeComputerBuilder**).
- Combina **director** com builder interno para máxima flexibilidade.

---

## 🛠️ Possíveis Extensões

- Adicionar `OfficeComputerBuilder`, `ServerComputerBuilder`, etc.
- Criar **Step Builder** para configurar obrigatoriedade de parâmetros em sequência.
- Gerar testes unitários com JUnit.
- Gerar diagramas UML para documentação.

---

## 💡 Referências
A separação de Builder e ConcreteBuilder segue práticas recomendadas em linguagens orientadas a objetos .

A estrutura com inner static ajuda a manter coesão — o builder interno ainda pode ser aproveitado pelo builder concreto .
