# Padrão Composite – Exemplo em Java

## Visão Geral

Este projeto demonstra o **Composite Pattern**, um padrão estrutural que permite tratar objetos simples e compostos de forma uniforme, formando uma estrutura hierárquica (árvore) :contentReference[oaicite:9]{index=9}.

## Componentes Principais

- `Graphic` — interface comum a todos os componentes.
- `Ellipse` — implementação de folha; não possui filhos.
- `CompositeGraphic` — componente que agrupa outros `Graphic` e delega operações a eles.
- `Program` — cliente que usa a interface `Graphic` sem diferenciar classes concretas.

## Estrutura de Diretórios

	designpattern/structure/composite
	├── component/Graphic.java
	├── leaf/Ellipse.java
	├── composite/CompositeGraphic.java
	└── Program.java
	
## Considerações Técnicas

A interface Graphic é genérica o suficiente para suportar tanto folhas quanto compostos.

CompositeGraphic implementa métodos de adicionar e remover componentes, suportando estrutura em árvore.

O cliente lida apenas com Graphic, sem necessidade de cast ou verificação de tipo .
