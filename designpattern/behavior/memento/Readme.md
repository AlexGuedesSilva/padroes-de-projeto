# Exemplo de Padrão Memento em Java

Este projeto demonstra o uso do **padrão Memento** para salvar e restaurar o estado de um objeto sem violar seu encapsulamento.

## Estrutura de pacotes

- `originator`: contém o objeto cujo estado será salvo (`Editor`).
- `memento`: contém o objeto que representa o estado do originador (`EditorState`).
- `caretaker`: gerencia o histórico de estados salvos (`History`).

## Como funciona

1. O `Editor` (Originator) contém o conteúdo que pode ser modificado.
2. O `EditorState` (Memento) armazena uma cópia do estado atual do editor.
3. O `History` (Caretaker) mantém uma pilha de estados para possibilitar desfazer alterações.
4. O `Main` demonstra como salvar estados e restaurar versões anteriores.

## Exemplo de saída

- Conteúdo atual: Terceira versão
- Após desfazer: Segunda versão
- Após outro desfazer: Primeira versão


Este padrão é útil para funcionalidades como **desfazer/refazer** em editores de texto ou jogos.
