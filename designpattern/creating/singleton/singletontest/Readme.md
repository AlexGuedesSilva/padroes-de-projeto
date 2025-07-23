# Singleton seguro – Java

## Estrutura do projeto
- `Singleton.java`: implementação robusta com prevenção contra reflection, clonagem e serialização.
- `SingletonTest.java`: testes práticos para verificar a segurança do padrão.

## Características técnicas
- **Thread-safe + Lazy**: double-checked locking com `volatile` (safe após Java 5) :contentReference[oaicite:9]{index=9}.
- **Proteção contra Reflection**: o construtor privado lança erro se `instance != null` :contentReference[oaicite:10]{index=10}.
- **Serializable-safe**: uso de `readResolve()` para evitar novas instâncias na desserialização :contentReference[oaicite:11]{index=11}.
- **Clone-safe**: `clone()` lança `CloneNotSupportedException` :contentReference[oaicite:12]{index=12}.

## Como executar
```bash
javac -d out src/com/example/singleton/*.java
java -cp out com.example.singleton.SingletonTest
