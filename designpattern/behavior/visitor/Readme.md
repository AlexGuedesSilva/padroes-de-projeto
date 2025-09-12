# Padrão Visitor (Behavioral)

## Objetivo
O **Visitor** é um padrão de projeto comportamental que permite **adicionar operações a objetos** de uma estrutura sem modificar suas classes.  
Isso é feito separando os algoritmos dos objetos sobre os quais eles operam.

---

## Estrutura do Exemplo
- `Element` → Interface que define o método `accept`.
- `Book` e `Fruit` → Elementos concretos que implementam `accept`.
- `Visitor` → Interface que define operações para cada tipo de elemento.
- `PriceVisitor` → Calcula o preço total dos itens.
- `NameVisitor` → Exibe os nomes dos itens.
- `ShoppingCart` → Estrutura que contém os elementos.
- `Main` → Demonstra o uso dos visitantes.

---

## Diagrama Simplificado

	Visitor ----> Book
	| ^
	| |
	v |
	Fruit <-------+


---

## Vantagens
✅ Permite adicionar novas operações sem alterar as classes dos elementos.  
✅ Mantém cada operação encapsulada em uma classe separada.  
✅ Favorece a extensão do sistema.  

## Desvantagens
⚠️ Requer modificar a interface `Visitor` se novos elementos forem adicionados.  
⚠️ Pode aumentar a complexidade do código.  

---

## Saída esperada do exemplo

- Preço total: R$ 152.0
- Livro: Clean Code
- Livro: Design Patterns
- Fruta: Maçã
- Fruta: Banana