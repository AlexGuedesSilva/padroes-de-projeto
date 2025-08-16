# 🎯 O que é o Padrão Command?

O padrão Command é um padrão comportamental que encapsula uma solicitação como um objeto, permitindo parametrizar clientes com diferentes solicitações, enfileirar ou registrar solicitações e suportar operações que podem ser desfeitas. 

Esse padrão é útil quando se deseja desacoplar o objeto que invoca a operação daquele que sabe como executá-la, promovendo maior flexibilidade e extensibilidade no código.
Medium

# 🛠️ Estrutura do Padrão Command

A implementação clássica do padrão Command envolve os seguintes componentes:

Command (Interface ou Classe Abstrata): Declara um método para executar a operação.

ConcreteCommand: Implementa a interface Command e define a ligação entre um objeto Receiver e uma ação.

Receiver: Sabe como realizar as operações associadas à execução de uma solicitação.

Invoker: Solicita a execução do comando.

Client: Cria e configura os objetos ConcreteCommand.

# ✅ Vantagens do Padrão Command

Desacoplamento: Separa o objeto que invoca a operação daquele que sabe como executá-la.

Extensibilidade: Novos comandos podem ser adicionados sem alterar o código existente.

Undo/Redo: Facilita a implementação de funcionalidades de desfazer e refazer.

Enfileiramento de Solicitações: Permite enfileirar solicitações para execução posterior.

# 📌 Aplicações Comuns

Interfaces Gráficas: Botões que executam ações específicas.

Sistemas de Automação: Controle de dispositivos como luzes, portas, etc.

Sistemas de Undo/Redo: Editor de texto, por exemplo.

Sistemas de Agendamento de Tarefas: Execução de tarefas em horários específicos.