![Drag Racing](./Java.png)

[Conteúdo tirado do curso Java COMPLETO 2023 Programação Orientada a Objetos +Projetos - Dr Nélio Alver - Educando Web](https://www.udemy.com/course/java-curso-completo/)

1. O que é Java?

> Java é uma linguagem de programação amplamente usada para codificar aplicações Web. Ela tem sido uma escolha popular entre os desenvolvedores há mais de duas décadas, com milhões de aplicações Java em uso hoje. Java é uma linguagem multiplataforma, orientada a objetos e centrada em rede que pode ser usada como uma plataforma em si. É uma linguagem de programação rápida, segura e confiável para codificar tudo, desde aplicações móveis e software empresarial até aplicações de big data e tecnologias do servidor.


### Revisando assuntos relacionados a linguagem Java:

1.1 Saída de Dados com print, println e printf(%d %f %s %n %c %s);

> Em um único exercício iremos abrangir todos os conceitos de saída de dados.

## Programa

```java
package br.com.i9.aceleracao.printf.saida;

import java.util.Locale;

public class Exercicio01 {

	public static void main(String[] args) {

		/**Em um novo programa inicie as variáveis */
		String product1 = "Computer";
		String product2 = "Office desk";
		int age=30;
		int code=5290;
		char gender='F';
		double price1=2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		double measureUS = 53.234567;
		
		/**Resultado é uma String no seguinte formato*/
		
		System.out.printf("Products:%n"
				+ "%s, which price is $ %.2f %n"
				+ "%s, which price is $ %.2f%n%n"
				+ "Record: %d years old, code %d and gender: %c%n%n"
				+ "Measue with eight decimal places: %.8f%n"
				+ "Rouded (three decimal places):%.3f%n"
				,product1,price1,product2,price2,age,code,gender,measure, measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
		
	}

}

```
## Saída

```java
Computer, which price is $ 2100,00 
Office desk, which price is $ 650,50

Record: 30 years old, code 5290 and gender: F

Measue with eight decimal places: 53,23456700
Rouded (three decimal places):53,235
US decimal point: 53.235


```

1.2 Entrada de Dados com Objeto Scanner:

[Documentação Classe Scanner do Java](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)

#### Conceito:
> A Scannerdivide sua entrada em tokens usando um padrão delimitador, que por padrão corresponde a espaços em branco. Os tokens resultantes podem então ser convertidos em valores de diferentes tipos usando os vários métodos next .

> Para criarmos uma entrada iremos instanciar um objeto do tipo Scanner da seguinte forma:

## Programa Modelo Abrangendo coceito de forma prática

```java
package br.com.i9.aceleracao.entrada.scanner;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo01 {
	/**
	 * No comando next() quando for digitar por exemeplo PRIMEIRO NOME é apenas um
	 * nome sem espaço... Caso dê um espaço o programa irá quebrar, pois, para esse
	 * tipo de procedimento temos nextLine() que irá lê a linha toda
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com PRIMEIRO NOME:");
		String nome = sc.next();
		System.out.println("Entre com sua IDADE:");
		int idade = sc.nextInt();
		System.out.println("Digite seu SALÁRIO EM DOLARES:");
		Locale.setDefault(Locale.US);
		double salario = sc.nextDouble();
		System.out.println("Digite seu sexo: F (Feminino) M (Masculino) O(Outros)");
		char sexo = sc.next().charAt(0);
		System.out.printf("Meu nome é %s tenho a idade de  %d%n" + "tenho uma renda de %.2f%n" + "meu sexo é %c", nome,
				idade, salario, sexo);
		sc.close();

	}

}

```
## Saída

```java
Entre com PRIMEIRO NOME:
TONIS
Entre com sua IDADE:
43
Digite seu SALÁRIO EM DOLARES:
200
Digite seu sexo: F (Feminino) M (Masculino) O(Outros)
M
Meu nome é TONIS tenho a idade de  43
tenho uma renda de 200.00
meu sexo é M
```