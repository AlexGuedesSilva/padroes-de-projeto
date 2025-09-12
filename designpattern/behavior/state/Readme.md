# 🎵 Exemplo do Padrão State em Java

## 📌 O que é?
O **State** é um padrão de projeto comportamental que permite que um objeto altere seu **comportamento** quando seu estado interno muda.  
É como se a **classe mudasse de tipo em tempo de execução**.

---

## 📂 Estrutura
- `State` → Interface que define os comportamentos possíveis.
- `PlayingState`, `PausedState`, `StoppedState` → Implementações concretas dos estados.
- `Player` → O **Contexto** que mantém uma referência para o estado atual.
- `Main` → Classe de teste.

---

## 🚀 Fluxo do Exemplo
O `Player` começa **parado**.  
- Se chamar `play()`, muda para **PlayingState**.  
- Se chamar `pause()` estando tocando, muda para **PausedState**.  
- Se chamar `stop()`, volta para **StoppedState**.  

Cada estado sabe **como reagir** às ações.

---

## ✅ Benefícios
- Remove `ifs` e `switch` gigantes de controle de estado.
- Facilita a manutenção e adição de novos estados.
- Segue o **Princípio do Aberto/Fechado (OCP)**.

---

## ▶️ Execução esperada
```bash
Iniciando a música...
Pausando a música...
Retomando a música...
Parando a música...
Já está parado!
