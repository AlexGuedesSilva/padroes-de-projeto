Nome: Alex Wilson Guedes da Silva Data: 10/06/2026
Hora Início: 19h			      Hora Entrega: 22h
Tempo Máximo de Duração: 4 Horas


Interesse em qual(is) Vaga(s)
( ) Estágio em Desenvolvimento
(x) Desenvolvedor de Software Junior
( ) Desenvolvedor de Software Pleno
( ) Desenvolvedor de Software Sênior

Você avalia seus conhecimentos nos seguintes temas, como:

A – Possui experiência em Desenvolvimento Web?

Possuo experiência com HTML, CSS, JavaScript e PHP em atividades relacionadas a portal interno corporativo. Também desenvolvo projetos próprios utilizando Java e Spring Boot para construção de APIs REST, autenticação e autorização com OAuth2, OpenID Connect, JWT e Keycloak.

Tenho experiência com desenvolvimento de aplicações backend, integração entre serviços, versionamento com Git, gerenciamento de dependências com Maven, utilização de Docker e estudo de arquiteturas baseadas em microsserviços.


B – Possui experiência em Desenvolvimento Desktop?

Possuo experiência acadêmica e em projetos pessoais utilizando Java para desenvolvimento de aplicações e implementação de lógica de negócio, estruturas de dados, algoritmos e integração com bancos de dados.

Não possuo experiência profissional significativa com desenvolvimento desktop comercial.

C – Possui experiência em Desenvolvimento Mobile?

Não possuo experiência profissional em desenvolvimento mobile.

Possuo conhecimento introdutório sobre conceitos da plataforma Android, porém meu foco principal de estudo e desenvolvimento está atualmente em aplicações backend, APIs REST, identidade e acesso (IAM) e arquitetura de microsserviços.

D – Possui experiência em Banco de Dados?

Sim.

Possuo experiência com bancos de dados relacionais, principalmente MySQL e PostgreSQL, realizando modelagem básica, criação de tabelas, consultas SQL, relacionamentos, inserção, atualização e consulta de dados.

1) QUESTÃO

```java
public class CalculoSalarioLiquido {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final double PERCENTUAL_DESCONTO = 0.21;
		
		System.out.printf("\nCalculo do salario liquido\n");
		
		System.out.print("Horas trabalhada por dia: "); 
		double horasPorDia = entrada.nextDouble();
		
		System.out.print("Valor da hora trabalhada: "); 
		double precoHora = entrada.nextDouble();
		
		System.out.print("Dias trabalhado: "); 
		int diasTrabalhados = entrada.nextInt();
		
		double salarioBruto = (diasTrabalhados * horasPorDia) * precoHora;
		double valorDesconto = salarioBruto * PERCENTUAL_DESCONTO;
		
		double salarioLiquido = salarioBruto - valorDesconto;
		
		System.out.printf("Salário Bruto: %.2f%n", salarioBruto);
		System.out.printf("Desconto: %.2f%n", valorDesconto);
		System.out.printf("Salário Líquido: %.2f%n", salarioLiquido);
		
		entrada.close();
	}
}
```

```java
2) QUESTÃO

public class DesafioDoisDSIN {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("A: ");
		int A = entrada.nextInt();

		System.out.print("B: ");
		int B = entrada.nextInt();

		System.out.print("C: ");
		int C = entrada.nextInt();

		System.out.print("D: ");
		int D = entrada.nextInt();
		
		boolean valoresAceitos = A % 2 == 0	
				&& D > 0
				&& C > 0
				&& B > C
				&& D > A
				&& (C + D) > (A + B);
		
		if (valoresAceitos) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores não aceitos");
		}
		
		entrada.close();
	}
}
```

3) QUESTÃO

```java
public class DesafioTresDSIN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nInsira a descrição do item: \n");
		String descricaoItem = sc.nextLine();
		
		System.out.print("Quantidade: \n");
		int quantidade = sc.nextInt();
		
		System.out.print("Preço por unidade: ");
		double precoUnitario = sc.nextDouble();

		double total = quantidade * precoUnitario;

		double percentualDesconto;

		if (quantidade <= 5) {
			percentualDesconto = 0.0555;
		} else if (quantidade <= 10) {
			percentualDesconto = 0.08;
		} else {
			percentualDesconto = 0.125;
		}

		double valorDesconto = total * percentualDesconto;
		double totalPagar = total - valorDesconto;

		System.out.println("Descrição do item: " + descricaoItem);
		System.out.println("Quantidade: " + quantidade);
		System.out.printf("Preço unitário: %.2f%n", precoUnitario);
		System.out.printf("Valor total: %.2f%n", total);
		System.out.printf("Valor do desconto: %.2f%n", valorDesconto);
		System.out.printf("Total a pagar: %.2f%n", totalPagar);
		
		sc.close();
	}
}
```

4) QUESTÃO

```java
public class DesafioQuatroDSIN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A: ");
		int A = sc.nextInt();
		
		System.out.print("B: ");
		int B = sc.nextInt();
		
		System.out.print("C: ");
		int C = sc.nextInt();
		
		if(A == 0 && B == 0 && C != 1) {
			System.out.println("solução impossivel");
		} else if (A + B == 0) {
			System.out.println("Não é possível calcular X (divisão por zero)");
		} else {
			double X = (double) (1 - C) / (A + B);
			System.out.printf("Valor de X: %.2f%n", X);
		}
		
		sc.close();
	}
}
```

5) QUESTÃO

```java
public class DesafioCincoDSIN {

	private static final String PADRAO_BRASIL = "[A-Z]{3}[0-9]{4}";
	private static final String PADRAO_MERCOSUL = "[A-Z]{3}[0-9][A-Z][0-9]{2}";

	private enum TipoPlaca {
		BRASIL, MERCOSUL, INVALIDA
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira a placa: ");
		String placa = entrada.nextLine().trim().toUpperCase();

		processarPlaca(placa);

		entrada.close();
	}

	public static void processarPlaca(String placa) {

		TipoPlaca tipo = identificarPlaca(placa);

		switch (tipo) {

		case BRASIL:
			System.out.println("Padrão: Brasil");
			System.out.println("Correspondente: " + brasilParaMercosul(placa));
			break;

		case MERCOSUL:
			System.out.println("Padrão: Mercosul");
			System.out.println("Correspondente: " + mercosulParaBrasil(placa));
			break;

		default:
			System.out.println("formato inválido");
		}

	}

	private static TipoPlaca identificarPlaca(String placa) {

		if (placa == null || placa.isBlank()) {
			return TipoPlaca.INVALIDA;
		}

		if (placa.matches(PADRAO_BRASIL)) {
			return TipoPlaca.BRASIL;
		}

		if (placa.matches(PADRAO_MERCOSUL)) {
			return TipoPlaca.MERCOSUL;
		}

		return TipoPlaca.INVALIDA;
	}

	private static String brasilParaMercosul(String placa) {
		char numero = placa.charAt(4);
		
		char letraCorrespondente = 
				(char) ('A' + (numero - '0'));
		
		return placa.substring(0, 4)
				+ letraCorrespondente 
				+ placa.substring(5);
	}

	private static String mercosulParaBrasil(String placa) {
		char letra = placa.charAt(4);
		
		char numeroCorrespondente = 
				(char) ('0' + (letra - 'A'));
		
		return placa.substring(0, 4) 
				+ numeroCorrespondente 
				+ placa.substring(5);
	}
}
```

6) QUESTÃO

```java
public class DesafioSeisDSIN {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe N: ");
        int n = entrada.nextInt();

        if (n <= 0) {
            System.out.println("Número inválido");
            entrada.close();
            return;
        }

        for (int i = 1; i <= n; i++) {

            System.out.println("Número: " + i);

            if (ehPerfeito(i))
                System.out.println("numero perfeito");

            if (i % 2 == 0)
                System.out.println("multiplo de 2");

            if (i % 7 == 0)
                System.out.println("multiplo de 7");

            if (ehPrimo(i))
                System.out.println("numero primo");

            System.out.println();
        }
        entrada.close();
    }

    static boolean ehPrimo(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static boolean ehPerfeito(int n) {
        if (n < 2) return false;

        int soma = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                soma += i;
        }

        return soma == n;
    }
}
```

7) QUESTÃO

```java
public class DesafioSeteDSIN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Título superior: ");
        String linha1 = sc.nextLine();

        System.out.print("Título inferior: ");
        String linha2 = sc.nextLine();
		
        if (linha1.isBlank() || linha2.isBlank()) {
            System.out.println("Título inválido");
            sc.close();
            return;
        }
		
		int maiorTexto = Math.max(linha1.length(), linha2.length());

		// margem para deixar o texto "respirar"
		int larguraInterna = maiorTexto + 20;

		imprimirBorda(larguraInterna);
		imprimirLinhaVazia(larguraInterna);
		imprimirLinhaCentralizada(linha1, larguraInterna);
		imprimirLinhaCentralizada(linha2, larguraInterna);
		imprimirLinhaVazia(larguraInterna);
		imprimirBorda(larguraInterna);
		
		sc.close();
	}

	private static void imprimirBorda(int larguraInterna) {
		System.out.println("|".repeat(larguraInterna + 4));
	}

	private static void imprimirLinhaVazia(int larguraInterna) {
		System.out.println("||" + " ".repeat(larguraInterna) + "||");
	}

	private static void imprimirLinhaCentralizada(String texto, int larguraInterna) {

		int espacosTotais = larguraInterna - texto.length();

		int esquerda = espacosTotais / 2;
		int direita = espacosTotais - esquerda;

		System.out.println("||" + " ".repeat(esquerda) + texto + " ".repeat(direita) + "||");
	}
}
```

8) QUESTÃO

```java
public class DesafioOitoDSIN {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		
		System.out.print("Insira o valor de N: ");
        int n = entrada.nextInt();
        
        int[][] matriz = new int[n][n];

        int topo = 0;
        int baixo = n - 1;
        int esquerda = 0;
        int direita = n - 1;

        int valor = 1;

        while (topo <= baixo && esquerda <= direita) {

            // esquerda -> direita (topo)
            for (int i = esquerda; i <= direita; i++) {
                matriz[topo][i] = valor;
                valor += 2;
            }
            topo++;

            // topo -> baixo (direita)
            for (int i = topo; i <= baixo; i++) {
                matriz[i][direita] = valor;
                valor += 2;
            }
            direita--;

            // direita -> esquerda (baixo)
            if (topo <= baixo) {
                for (int i = direita; i >= esquerda; i--) {
                    matriz[baixo][i] = valor;
                    valor += 2;
                }
                baixo--;
            }

            // baixo -> topo (esquerda)
            if (esquerda <= direita) {
                for (int i = baixo; i >= topo; i--) {
                    matriz[i][esquerda] = valor;
                    valor += 2;
                }
                esquerda++;
            }
        }

        // impressão da matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
        entrada.close();
    }
}
```

9) QUESTÃO

Com base nesses dados, elabore uma consulta SQL que retorne o código, nome e
cidade, dos clientes ativos, que moram no estado de Goiás.

```sql
SELECT
    CDCLICODIGO,
    CDCLINOME,
    CDCLICIDADE
FROM CDCLIENTE
WHERE CDCLIUF = 'GO'
  AND CDCLIATIVO = 'T';
```

10) QUESTÃO

A) É certo dizer que o relacionamento entre da tabela LCATENDIMENTO para
CDFUNCIONARIO, é :

[ ] 1:0 (Um para nenhum)
[ ] 1:N (Um para muitos)
[X] N:1 (Muitos para um)
[ ] M:N (Muitos para Muitos)
[ ] 0:N (Zero a muitos)

B) Assinale com X as afirmações corretas:
[ ] Nenhum atendimento pode possuir a mesma data e hora;
[X] Um funcionário pode atender vários clientes, sendo um cliente por vez;
[ ] Um funcionário pode atender um cliente que não possua um nome
cadastrado;
[X] Um cliente pode estar cadastrado e não ter nenhum atendimento;
[ ] Um cliente pode ser atendido por vários funcionários, sendo um
funcionário por vez.

11) QUESTÃO

A) Escreva uma instrução SQL que traga o nome de todos os funcionários que não
realizaram atendimentos.

```sql
SELECT CDFNOME
FROM CDFUNCIONARIO f
WHERE f.CDFCODIGO NOT IN (
    SELECT LCAFUNCIONARIO
    FROM LCATENDIMENTO
);
```

B) Escreva uma consulta SQL que mostre o nome do cliente e a quantidade de
atendimentos que cada cliente teve. Caso o cliente não possua atendimento, a
quantidade de atendimento, para este cliente, deverá ser 0.

```sql
SELECT c.CDCLNOME,
       COUNT(a.LCACLIENTE) AS QtdAtendimentos
FROM CDCLIENTE c
LEFT JOIN LCATENDIMENTO a
       ON c.CDCLCODIGO = a.LCACLIENTE
GROUP BY c.CDCLNOME;
```

C) Escreva uma instrução SQL que traga o nome dos clientes e a data e hora do
atendimento, que foram atendidos no primeiro bimestre de 2011 ou no segundo
semestre de 2011.

```sql
SELECT c.CDCLNOME,
       a.LCADATAHORAATEND
FROM CDCLIENTE c
JOIN LCATENDIMENTO a
     ON c.CDCLCODIGO = a.LCACLIENTE
WHERE (a.LCADATAHORAATEND BETWEEN '2011-01-01' AND '2011-02-28')
   OR (a.LCADATAHORAATEND BETWEEN '2011-07-01' AND '2011-12-31');
```

12) QUESTÃO

```java
public class ProgramaUmPato {
	public static void main(String[] args) {

		Pato pato1 = new PatoReal("Donald");
		Pato pato2 = new PatoBorracha("Patinho de Banho");
		
		pato1.exibir();
		pato1.emitirSom();
		pato1.andar();
		pato1.nadar();
		
		System.out.println();
		
		pato2.exibir();
		pato2.emitirSom();
		pato2.andar();
		pato2.nadar();
	}
}

class PatoBorracha extends Pato {

    public PatoBorracha(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Squeak Squeak");
    }
}

class PatoReal extends Pato {

	public PatoReal(String nome) {
		super(nome);
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " diz: Quack Quack");
	}
	
}


abstract class Pato {
	
	private String nome;
	
	public Pato(String nome) { 
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public abstract void emitirSom();
	
	public void nadar() {
		System.out.println(getNome() + " está nadando");
	}
	
	public void andar() {
		System.out.println(getNome() + " está andando");
	}
	
	public void exibir() {
		System.out.println("Sou um pato chamado " + getNome());
	}
}
```

13) QUESTÃO

Ao concluir o primeiro relatório em 6 dias, eu reavaliaria imediatamente o planejamento da demanda, pois os dois relatórios restantes possuem complexidade semelhante e o prazo inicialmente definido torna-se inviável.

Minha primeira ação seria comunicar o líder técnico, gestor do projeto ou responsável pelo produto sobre a nova estimativa, apresentando os dados obtidos durante o desenvolvimento do primeiro relatório.

Em seguida, buscaria alternativas para viabilizar a entrega, tais como:

* Repriorização dos relatórios, identificando quais possuem maior importância para a reunião do cliente;
* Redistribuição das atividades entre outros desenvolvedores da equipe;
* Negociação de prazo junto ao cliente, apresentando uma estimativa mais realista;
* Avaliação da possibilidade de entregas parciais.

Também garantiria que o prazo necessário para testes fosse preservado, evitando disponibilizar funcionalidades sem a validação adequada da equipe de testes.

Dessa forma, a situação seria tratada com transparência, reduzindo riscos para o cliente e para a empresa.


14) QUESTÃO

A) Que análise você faria para auxiliar o setor de suporte no atendimento do
cliente?

Inicialmente eu realizaria um levantamento das informações reportadas pelo suporte, identificando:

* Quais clientes estão sendo afetados;
* Quais relatórios apresentam divergências;
* Desde quando as divergências começaram a ocorrer;
* Se o problema ocorre apenas para produtos cadastrados após a alteração;
* Quais produtos possuem informações incompletas no cadastro.

Também analisaria os registros do banco de dados e o histórico da alteração implementada, buscando identificar relação entre os campos que passaram a ser opcionais e os relatórios afetados.

Além disso, tentaria reproduzir o cenário em ambiente de testes para confirmar o comportamento relatado pelos clientes.


B) Qual o diagnóstico sobre o possível problema? E quais ações devem ser
tomadas para resolver o problema?

O possível diagnóstico é que os campos que passaram a ser opcionais estejam sendo utilizados por consultas, filtros ou agrupamentos dos relatórios. Com a existência de registros sem categoria, grupo ou descrição detalhada, os relatórios podem apresentar totalizações incorretas ou resultados divergentes.

Para resolver o problema, eu realizaria uma análise técnica das consultas utilizadas nos relatórios para identificar dependências desses campos.

Após confirmar a causa, as ações possíveis seriam:

* Corrigir as consultas para tratar adequadamente valores nulos ou vazios;
* Avaliar a necessidade de voltar a tornar alguns campos obrigatórios;
* Criar validações adicionais de negócio;
* Corrigir os registros inconsistentes já cadastrados;
* Executar testes de regressão para garantir que outros relatórios não sejam impactados.

Somente após validação completa das correções uma nova versão seria disponibilizada aos clientes.
