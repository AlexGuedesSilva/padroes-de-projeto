# 📚 Comparativo de Implementações Singleton em Java
Este documento apresenta informações técnicas sobre cinco abordagens populares de Singleton em Java:

* EagerSingleton

* ThreadSafeSingleton

* DoubleCheckedLockingSingleton

* HolderSingleton (Bill Pugh Idiom)

* EnumSingleton

## 🎯 Objetivo do Singleton
O padrão Singleton garante que uma classe tenha apenas uma instância disponível em todo o sistema, fornecendo um ponto de acesso global. É útil para gerenciar recursos compartilhados (ex: pool de conexões, logger, configuração).

### 1. EagerSingleton

* **Inicialização imediata (eager)**: a instância é criada durante o carregamento da classe.

* **Thread-safe** por natureza (static).

* **Simplicidade** absoluta — não requer sincronização.

* **Limitações:** mesmo que nunca utilizada, a instância é criada; pode desperdiçar recursos. Além disso, precisa de cuidado adicional para lidar com reflexão e serialização.

### 2. ThreadSafeSingleton (Lazy + synchronized)

* **Lazy load:** instância criada apenas quando solicitada.

* **Usa** synchronized no método getInstance() para garantir segurança em ambientes com múltiplas threads.

* **Vantagem:** simples de implementar.

* **Desvantagem:** todo acesso é sincronizado — pode impactar performance.

### 3. DoubleCheckedLockingSingleton
Combina **lazy load** e **thread-safety** com desempenho aprimorado.

Usa **volatile** para evitar problemas de visibilidade e reorderings desde Java 5.

Primeiro verifica **instance == null;** sincroniza apenas quando necessário, dentro do bloco crítico.

**Complexidade média-alta**, mas excelente performance em cenários concorrentes.

### 4. HolderSingleton (Bill Pugh Idiom)
Usa **lazy initialization** sem *synchronized*, por meio de uma classe estática interna (Holder).

A instância só é criada quando **getInstance()** é chamada; carregamento é garantido thread-safe pela JVM.

Alta performance e código simples — amplamente recomendado .

**Vantagem** principal: performance igual ao eager, com carga tardia sem sincronização.

### 5. EnumSingleton
Implementação mais robusta e concisa, usando **enum**.

A instância é criada na carga da classe, o que já garante **thread-safety**.

Oferece proteção *nativa* contra *serialização* (já garantida) e reflexão .

**Limitação**: não suporta lazy load; enums não podem ser extendidos.

## 🧩 Comparativo técnico
| Implementação | Thread‑Safe |	Lazy Load |	Performance | Serialização / Reflexão |	Complexidade |
|---------------|-------------|------------|-------------|-------------------------|---------------|
| EagerSingleton					| ✅ Sim		| ❌ Não	    | Alta	| Média					| Muito baixa
| ThreadSafeSingleton			| ✅ Sim		| ✅ Sim	    | Média (sincronizada cada vez)	| Média	| Baixa
| DoubleCheckedLockingSingleton	| ✅ Sim		| ✅ Sim	    | Alta (quase sem sincronização)	| Média	| Médio/alta
| HolderSingleton				| ✅ Sim		| ✅ Sim	    | Alta (sem sincronização)	 | Média		| Baixa
| EnumSingleton					| ✅ Sim		| ❌ Não 	| Alta	| Excel. (serialização/reflexão seguras)	| Muito baixa

## 💡 Recomendações
**EnumSingleton**: usada preferencialmente por sua simplicidade, segurança e proteção contra serialização/reflexão.

**HolderSingleton**: escolha ideal se precisa de lazy load com alta performance.

**DoubleCheckedLockingSingleton**: útil quando se deseja lazy load e se tem controle total, mas atenção à complexidade.

**ThreadSafeSingleton**: bom para cenários de baixa concorrência onde performance não é crítica.

**EagerSingleton**: adequado quando a instância será usada sempre e seu custo de criação é baixo.

## ⚠️ Observações gerais
Qualquer implementação deve proteger contra reflexão, clonagem e serialização se esses riscos existirem.

Em alguns casos, uso de frameworks (ex. Spring, Guice) ou injeção de dependência é preferível a Singletons tradicionais.

Embora Singleton seja útil, é considerado por alguns como "anti-padrão" — seu uso indiscriminado pode causar acoplamento forte e dificultar testabilidade .

### 📚 Referências
Explicação técnica do Bill Pugh / Initialization‑on‑Demand Holder (StackOverflow)

Comparativo Enum vs Double‑Checked Locking (StackOverflow / CodingTechRoom)

Vantagens e desvantagens do EnumSingleton (GeeksforGeeks) 

Análise da performance e thread‑safety de cada abordagem (Initgrep / DZone) 

Comparativo geral moderno das implementações (Pedro Lopes, GeeksforGeeks)