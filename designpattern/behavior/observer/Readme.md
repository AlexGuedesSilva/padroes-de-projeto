# Observer Pattern - Java Implementation

## 🔍 Descrição

O padrão de projeto **Observer** é um padrão de comportamento que define uma dependência um-para-muitos entre objetos. Quando o estado de um objeto muda, todos os seus dependentes são notificados automaticamente.

## 🧠 Participantes do Padrão

- **Subject**: Interface que define os métodos de registro, remoção e notificação dos observers.
- **ConcreteSubject**: Implementa o `Subject` e armazena o estado. Notifica os observers quando o estado muda.
- **Observer**: Interface para ser implementada pelos observadores que desejam ser notificados.
- **ConcreteObserver**: Implementa o `Observer` e realiza ações quando recebe atualizações.

## 💡 Funcionamento

1. `ConcreteSubject` mantém uma lista de `Observer`s registrados.
2. Quando o estado muda (via `changeState()`), o `ConcreteSubject` chama `notifyObservers()`.
3. Todos os objetos `ConcreteObserver` são notificados e recebem o novo estado via `update()`.

## 📁 Pacotes

- `observer.observer`: contém as interfaces e classes que representam os observadores.
- `observer.subject`: contém as interfaces e classes que representam o sujeito (objeto observado).
- `observer`: contém a classe `Main`, responsável por simular o uso do padrão.

