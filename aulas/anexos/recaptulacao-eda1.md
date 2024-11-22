
# Recap. Estrutura de Dados e Algoritmos I

## **Objetivos da Aula**
- Revisar conceitos básicos de algoritmos e programação.
- Reforçar o entendimento sobre estruturas de controle de fluxo.
- Recapitular estruturas de dados básicas e suas aplicações.
- Compreender o conceito e a importância da recursão.

---

## **1. Algoritmos**

### **1.1 Definição**
Um **algoritmo** é uma sequência finita de instruções bem definidas para resolver um problema ou realizar uma tarefa.

### **1.2 Características**
- **Precisão:** Passos claramente definidos.
- **Finitude:** Termina após um número finito de etapas.
- **Input:** Pode receber dados de entrada.
- **Output:** Produz um resultado.
- **Eficácia:** Resolve o problema proposto.

### **1.3 Exemplo**
Algoritmo para calcular a média aritmética de um estudante:

```java
import java.util.Scanner;

public class MediaEstudante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do estudante:");
        String nome = scanner.nextLine();

        System.out.println("Digite o número de avaliações:");
        int n = scanner.nextInt();

        double soma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Digite a nota " + i + ":");
            soma += scanner.nextDouble();
        }

        double media = soma / n;
        System.out.println("A média de " + nome + " é: " + media);
    }
}
```

---

## 2. Controle de Fluxo

### **2.1 Estruturas Condicionais**
- **if-else:** Executa código baseado em condições.
- **switch-case:** Seleciona entre múltiplas opções.

#### **Exemplo: Estruturas Condicionais**

```java
int idade = 18;

if (idade >= 18) {
    System.out.println("Você é maior de idade.");
} else {
    System.out.println("Você é menor de idade.");
}

// Usando switch-case
int opcao = 2;
switch (opcao) {
    case 1:
        System.out.println("Opção 1 escolhida.");
        break;
    case 2:
        System.out.println("Opção 2 escolhida.");
        break;
    default:
        System.out.println("Opção inválida.");
}
```

### **2.2 Loops**
- **for:** Iteração com contagem definida.
- **while:** Iteração baseada em uma condição.

#### **Exemplo: Estruturas de Loop**

```java
// Loop "for"
for (int i = 1; i <= 5; i++) {
    System.out.println("Iteração: " + i);
}

// Loop "while"
int contador = 1;
while (contador <= 5) {
    System.out.println("Iteração: " + contador);
    contador++;
}
```

---

## **3. Estruturas de Dados Básicas**

### **3.1 Vetores (Arrays)**
- Coleção ordenada de elementos do mesmo tipo.
- Acesso por índice.
- Tamanho fixo em algumas linguagens.

#### **Exemplo: Vetores**

```java
int[] numeros = {10, 20, 30, 40};
for (int i = 0; i < numeros.length; i++) {
    System.out.println("Número na posição " + i + ": " + numeros[i]);
}
```

---

### **3.2 Pilhas**
- Princípio **LIFO (Last In, First Out)**.
- Operações principais: **push** (inserir) e **pop** (remover).

#### **Exemplo: Pilha**

```java
import java.util.Stack;

public class ExemploPilha {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();

        // Adicionar elementos na pilha
        pilha.push("Livro A");
        pilha.push("Livro B");
        pilha.push("Livro C");

        System.out.println("Topo da pilha: " + pilha.peek()); // Último elemento adicionado
        System.out.println("Removendo: " + pilha.pop()); // Remove o topo
        System.out.println("Pilha atual: " + pilha);
    }
}
```

---

### **3.3 Filas**
- Princípio **FIFO (First In, First Out)**.
- Operações principais: **enqueue** (inserir) e **dequeue** (remover).

#### **Exemplo: Fila**

```java
import java.util.LinkedList;
import java.util.Queue;

public class ExemploFila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Adicionar elementos na fila
        fila.add("Cliente 1");
        fila.add("Cliente 2");
        fila.add("Cliente 3");

        System.out.println("Atendendo: " + fila.poll()); // Remove o primeiro da fila
        System.out.println("Próximo na fila: " + fila.peek());
        System.out.println("Fila atual: " + fila);
    }
}
```

---

## **4. Recursão**

### **4.1 Definição**
- Técnica onde uma função chama a si mesma para resolver um problema.
- **Caso base:** Condição que para a recursão.
- **Caso recursivo:** Chamada da função para um problema menor.

### **4.2 Exemplo: Cálculo do Fatorial**

```java
public class FatorialRecursivo {
    public static int fatorial(int n) {
        if (n == 0) { // Caso base
            return 1;
        }
        return n * fatorial(n - 1); // Caso recursivo
    }

    public static void main(String[] args) {
        int numero = 5;
        System.out.println("Fatorial de " + numero + " é: " + fatorial(numero));
    }
}
```

### **4.3 Aplicações**
- Algoritmos de busca (ex.: busca binária).
- Percurso em árvores e grafos.
- Problemas de divisão e conquista.

---

## **Consolidação**

- **Algoritmos:** Conjunto de passos para resolver problemas.
- **Controle de Fluxo:** Estruturas como condicionais (if-else, switch) e loops (for, while).
- **Estruturas de Dados Básicas:**
  - **Vetores (Arrays):** Armazenamento indexado.
  - **Pilhas:** Ordem LIFO, usada em históricos e desfazer ações.
  - **Filas:** Ordem FIFO, usada em filas de espera e mensagens.
- **Recursão:** Essencial para resolver problemas divididos em subproblemas menores, como manipulação de árvores.