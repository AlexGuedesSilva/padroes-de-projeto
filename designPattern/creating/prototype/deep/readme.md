# Prototype Pattern – Clonagem Profunda em Java

	prototype-deep/
	├── src/
	│   └── com/example/prototypedeep/
	│       ├── Prototype.java
	│       ├── ConcretePrototype.java
	│       ├── PrototypeFactory.java
	│       └── PrototypeClient.java
	└── README.md


## Estrutura
- `Prototype`: interface com `clone()`.
- `ConcretePrototype`: implementa clonagem profunda via copy-constructor.
- `PrototypeFactory`: armazena e fornece protótipos.
- `PrototypeClient`: demonstra clonagem e isolamento de referências.

## Funcionamento
1. Cliente solicita um clone do protótipo.
2. Clone é gerado com `new ConcretePrototype(source)`, copiando valores e lista.
3. Modificações no clone **não afetam** o original (deep copy).

## Vantagens
- Cria cópias completas (sem referências compartilhadas).
- Útil para objetos complexos com coleções mutáveis :contentReference[oaicite:8]{index=8}.

## Pontos de atenção
- Copy-constructor manual permite controle fino sobre clonagem.
- Alternativamente, pode-se usar `clone()` com `super.clone()` e cópia manual de campos mutáveis :contentReference[oaicite:9]{index=9}.
