# Prototype Pattern – Exemplo Java

## 📁 Estrutura de Pastas

	prototype/
	├── src/
	│   └── com/example/prototype/
	│       ├── Prototype.java
	│       ├── UMLClass.java
	│       ├── UMLAttribute.java
	│       ├── UMLAssociation.java
	│       ├── PrototypeFactory.java
	│       └── UMLTool.java
	└── README.md

– `Prototype.java`: interface com método `clone()`.  
– `UMLClass`, `UMLAttribute`, `UMLAssociation`: protótipos concretos.  
– `PrototypeFactory`: gerencia e retorna clones.  
– `UMLTool`: demonstra o uso.


## Como funciona
1. O cliente pede um clone via `PrototypeFactory`.  
2. Este retorna uma cópia do protótipo armazenado no cache.  
3. O cliente pode modificar o clone sem afetar o original.

## Vantagens
- Reduz overhead de criação repetida de objetos complexos :contentReference[oaicite:9]{index=9}.
- Permite uso polimórfico: o cliente não sabe a classe concreta.

## Observações
- `super.clone()` gera uma restauração superficial (shallow copy).  
- Para campos mutáveis, implementar clonagem profunda (deep copy).  
- Alternativas incluem copy-constructors ou serialização :contentReference[oaicite:10]{index=10}.

## ✅ Pontos técnicos destacados
Elemento				| 			Descrição  
Interface Prototype		|		Declara a clonagem genérica via clone()
Implementações (ex. UMLClass) |	Usam super.clone() para criar cópias superficiais
Fábrica de protótipos		|	Permite gerenciamento centralizado do cache e clonagem
Cliente (UMLTool)			|	Se beneficia de polimorfismo e baixo acoplamento
Shallow vs Deep Copy			|	A implementação gera cópia superficial; deep copy é necessária 							|	se houver referências mutáveis
