# Design Patterns
📚 Design Patterns (GoF)
Este repositório contém os 23 padrões clássicos de design orientado a objetos conforme Gamma, Helm, Johnson e Vlissides (1995).

## Padrões Creacionais
Controlam o processo de criação de objetos, abstraindo lógica complexa e promovendo flexibilidade.

- **Abstract Factory** : provê interface para criar famílias de objetos relacionados sem expor classes concretas.

- **Builder**: separa a construção de um objeto de sua representação.

- **Factory Method**: define método criador, permitindo subclasses decidirem qual classe instanciar.

- **Prototype**: cria novos objetos clonando instâncias-protótipo.

- **Singleton**: garante que uma classe tenha apenas uma instância com acesso global.

## Padrões Estruturais
Tratam da composição de classes e objetos para formar estruturas maiores com baixo acoplamento.

- **Adapter**: adapta interfaces incompatíveis.

- **Bridge**: separa abstração e implementação permitindo variações independentes.

- **Composite**: compõe objetos em estruturas de árvore, tratando compostos e folhas uniformemente.

- **Decorator**: adiciona responsabilidades a objetos dinamicamente.

- **Facade**: fornece interface unificada para subsistemas complexos.

- **Flyweight**: share objetos para reduzir consumo de memoria.

- **Proxy**: usa um objeto substituto para controlar acesso a outro objeto.


## Padrões Comportamentais
Focados em comunicação entre objetos, fluxo de controle e responsabilidades.

- **Chain of Responsibility**: passa requisição por uma cadeia de handlers até alguém processar.

- **Command**: encapsula uma requisição como objeto, permitindo logging, undo, filas.

- **Interpreter**: define representação de gramática e interpreta sentenças da linguagem.

- **Iterator**: fornece acesso sequencial a elementos sem expor estrutura interna.

- **Mediator**: centraliza comunicação entre objetos para reduzir acoplamento.

- **Memento**: realiza snapshot do estado de um objeto para restaurá-lo depois.

- **Observer**: define dependência um-para-muitos entre objetos; atualiza dependentes automaticamente.

- **State**: permite que um objeto altere comportamento quando seu estado interno muda.

- **Strategy**: encapsula algoritmos, tornando-os intercambiáveis.

- **Template Method**: define esqueleto de algoritmo, deixando etapas para subclasses.

- **Visitor**: adiciona novas operações a elementos de uma estrutura sem modificar os elementos.

