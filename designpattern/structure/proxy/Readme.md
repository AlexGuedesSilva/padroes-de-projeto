# Exemplo de Padrão Proxy em Java

## Visão geral

Este projeto demonstra o uso do **Padrão Proxy**, onde um objeto proxy controla o acesso a outro objeto (`RealSubject`) que faz o trabalho real.

### Objetivos do Proxy:
- **Controle de acesso** (autenticação/autorização)
- **Lazy initialization** (criando o `RealSubject` somente quando necessário)
- **Logging**, **caching**, **auditoria**, **pre/post-processamento**

## Organização do código

Tudo está dentro do pacote `com.exemplo.proxy`:

| Classe           | Função |
|------------------|--------|
| `Subject`        | Interface comum |
| `RealSubject`    | Implementação real |
| `ProxySubject`   | Interceptor que controla acesso |
| `Cliente`        | Demonstra o uso do proxy |

## Fluxo de execução

1. `Cliente.main()` cria uma instância de `ProxySubject`.
2. `proxy.executar()` chama o proxy.
3. O proxy executa `permiteAcesso()`.
   - Se permitido, instancia o `RealSubject` (lazy).
   - Executa lógica pré (ex: logging).
   - Chama `realSubject.executar()`.
   - Executa lógica pós (ex: auditoria).
   - Caso o acesso seja negado, pode lançar exceção ou abortar.

## Possíveis extensões

- Implementar controle mais robusto de acesso (ex: verificação de token).
- Substituir console por logger para registrar chamadas e erros.
- Adicionar **caching** de retorno de métodos mais pesados.
- Criar proxies específicos (ex: remoto via RMI, virtual proxy para objetos pesados, etc.)

## Vantagens

- Interface transparente para o cliente.
- Isola preocupações transversais como segurança e logging.
- Facilita manutenção e testes.
