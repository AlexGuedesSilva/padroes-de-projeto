# Flyweight Pattern Example (Java)

## 🔍 O que é o Flyweight?

O Flyweight é um **padrão estrutural** que reduz o uso de memória ao compartilhar objetos que possuem grande parte do seu estado comum (*intrínseco*), enquanto a parte variável (*extrínseca*) é fornecida externamente ao realizar operações.

## 🧩 Estrutura do exemplo

- `Icon` – interface Flyweight com método `draw(x, y)`.
- `ConcreteIcon` – implementação que armazena apenas o **tipo** (estado intrínseco).
- `IconFactory` – gerencia instâncias criadas em cache (`HashMap`) para evitar duplicação.
- `App` – cliente que solicita ícones por tipo e passa coordenadas (estado extrínseco).

## ⚙️ Componentes do padrão

1. **Flyweight Interface** (`Icon`)  
2. **Concrete Flyweight** (`ConcreteIcon`) – guarda estado intrínseco compartilhável.  
3. **Flyweight Factory** – gerencia instâncias, reutilizando conforme necessário.  
4. **Cliente** – fornece estado extrínseco.

## 🧠 Características técnicas

- **Estado intrínseco**: imutável e compartilhado (*type* no `ConcreteIcon`).
- **Estado extrínseco**: contexto específico (coordenadas) passado na chamada `draw(x,y)`.
- **Imutabilidade**: objetos Flyweight devem ser imutáveis para serem seguros para compartilhamento.
- **Economia de memória**: menor instâncias em cache, útil para muitos objetos similares (ex: interfaces gráficas com muitos ícones).
- **Factory**: centraliza criação e reutilização de instâncias para evitar duplicidade.

## ✅ Vantagens

- Reduz **uso de memória**;
- Melhora **desempenho** em cenários com muitos objetos repetidos ($\rightarrow$ exemplo de editor de texto, onde cada caractere ```).
- Facilita **código limpo**, evitando instâncias redundantes indefinidas.

## ⚠️ Cuidados

- **Complexidade** aumenta, pois é necessário separar estado intrínseco/extrínseco e gerenciar factory;
- **Não aplicável** para poucos objetos ou quando o estado intrínseco varia muito.

## 🎯 Quando usar Flyweight
Aplicações com muitos objetos similares (gui, jogos, editores);

Memória ou performance são restritivas;

Estado pode ser claramente dividido em intrínseco/extrínseco.