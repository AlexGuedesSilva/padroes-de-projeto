# Padrão de Projeto - Template Method (Behavioral)

## Definição
O **Template Method** é um padrão de projeto comportamental que define o **esqueleto de um algoritmo em um método**, deixando que as subclasses implementem etapas específicas.  
Assim, parte do algoritmo é fixa (na superclasse), enquanto outras partes podem variar (nas subclasses).

## Estrutura do Exemplo
	templatemethod/
	├── templatemethod/
	│ ├── Demo.java # Classe principal para executar o exemplo
	│ ├── template/
	│ │ ├── DataProcessor.java # Classe abstrata (Template Method)
	│ │ ├── CsvDataProcessor.java # Implementação para CSV
	│ │ └── JsonDataProcessor.java # Implementação para JSON
	└── README.m
	

## Funcionamento do Exemplo
- `DataProcessor` é a classe abstrata que define o método **`process()`**, responsável por:
  1. `readData()` → leitura dos dados (definido pela subclasse).
  2. `processData()` → processamento dos dados (definido pela subclasse).
  3. `saveData()` → salvamento no banco (implementação padrão).

- `CsvDataProcessor` e `JsonDataProcessor` são subclasses que **personalizam** a leitura e processamento dos dados, mas reutilizam o método comum `saveData()`.

## Saída Esperada
Ao executar `Main.java`, a saída será:

	=== Executando CSV Processor ===
	Lendo dados de um arquivo CSV...
	Processando dados CSV...
	Salvando dados no banco de dados...
	
	=== Executando JSON Processor ===
	Lendo dados de um arquivo JSON...
	Processando dados JSON...
	Salvando dados no banco de dados...
	

## Vantagens
- Reuso de código para partes fixas do algoritmo.
- Flexibilidade para especializar apenas etapas específicas.
- Facilita a padronização de processos semelhantes.

## Quando Usar
- Quando você tem algoritmos que seguem a **mesma sequência de passos**, mas com variações em alguns deles.
- Para evitar duplicação de código entre implementações semelhantes.
	