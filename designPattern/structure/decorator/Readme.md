# Decorator Pattern Example (Java)

## 🔍 O que é o padrão Decorator?

O padrão Decorator (**também chamado Wrapper**) é um padrão estrutural que permite adicionar funcionalidades a objetos de forma **dinâmica**, encapsulando-os em classes “decoradoras” que implementam a mesma interface do objeto original.

### Características principais

- Utiliza **composição**, não herança múltipla.
- Cada decorator implementa a mesma interface do objeto base e delega chamadas.
- Segue os princípios **SRP** (responsabilidade única) e **OCP** (aberto para extensão, fechado para modificação).

## 🧩 Componentes deste exemplo

- **component.DataSource**: interface com `writeData()` e `readData()`.
- **component.FileDataSource**: implementação concreta que grava/le arquivos.
- **decorator.DataSourceDecorator**: base abstrata que delega operações.
- Decorators:
  - **EncryptionDecorator**: adiciona criptografia na escrita/leitura.
  - **CompressionDecorator**: adiciona compressão na escrita/le leitura.
- **client.App**: demonstra uso encadeado.

## 📦 Estrutura de diretórios

	designpattern/structure/decorator/
	├── designpattern/
	│   └── structure/
	│       └── decorator/
	│           ├── component/
	│           │   ├── DataSource.java
	│           │   └── FileDataSource.java
	│           ├── decorator/
	│           │   ├── DataSourceDecorator.java
	│           │   ├── EncryptionDecorator.java
	│           │   └── CompressionDecorator.java
	│	       ├──── README.md		
	│           └── App.java/
	│               
	

## 🧠 Funcionamento

1. O `App` cria um `FileDataSource`.
2. Empacota-o em `EncryptionDecorator`.
3. Empacota novamente em `CompressionDecorator`.
4. As chamadas ao `compressedEncrypted` aplicam ambos os comportamentos sequencialmente.
  
Esse empilhamento permite adicionar/remover funcionalidades **em tempo de execução**, sem criar múltiplas subclasses — evitando a "explosão de classes".

## ✅ Vantagens

- **Flexibilidade**: configurações dinâmicas de comportamento.
- **Reuso e modularidade**: cada decorator adiciona responsabilidade de forma independente.
- **Código limpo**: evita classes combinadas como `EncryptedCompressedFileDataSource`.

## ⚠️ Desvantagens

- Pode gerar uma cadeia longa de wrappers, dificultando depuração.
- A complexidade da configuração aumenta.

## 📘 Referências

- *Applied at Refactoring.Guru* — modelo de DataSource com compressão e criptografia.
- *Wiki Decorator Pattern* — fundamentação teórica.
