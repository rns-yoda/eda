# ESTRUTURAS DE DADOS COMUNS | JAVA 

## 1. Arrays

### Declaração e Inicialização
```java
// Array unidimensional
int[] numeros = new int[5]; // 5 posições inicializadas com zero
int[] numerosInicializados = {1, 2, 3, 4, 5};

// Array multidimensional
int[][] matriz = new int[3][3];
int[][] matrizInicializada = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Operações básicas
System.out.println(numeros.length); // Tamanho do array
numeros[0] = 10; // Atribuição de valor
```

### Métodos Úteis
```java
// Copiando arrays
int[] copia = Arrays.copyOf(numerosInicializados, 5);

// Preenchendo array
Arrays.fill(numeros, 100); // Preenche todos com 100

// Ordenação
Arrays.sort(numerosInicializados);

// Busca binária (array deve estar ordenado)
int indice = Arrays.binarySearch(numerosInicializados, 3);
```

## 2. ArrayList

### Operações Completas
```java
import java.util.ArrayList;
import java.util.Collections;

public class ExemploArrayList {
    public static void main(String[] args) {
        // Criação
        ArrayList<String> frutas = new ArrayList<>();

        // Adição
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add(1, "Laranja"); // Inserção em posição específica

        // Remoção
        frutas.remove("Banana");
        frutas.remove(0); // Remove por índice

        // Verificações
        System.out.println(frutas.contains("Maçã")); // Verifica existência
        System.out.println(frutas.isEmpty()); // Verifica se está vazio
        System.out.println(frutas.size()); // Tamanho

        // Iteração
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // Ordenação
        Collections.sort(frutas);

        // Conversão para array
        String[] arrayFrutas = frutas.toArray(new String[0]);

        // Sublista
        ArrayList<String> subLista = new ArrayList<>(frutas.subList(0, 2));
    }
}
```

## 3. LinkedList

### Exemplo Avançado
```java
import java.util.LinkedList;

public class ExemploLinkedList {
    public static void main(String[] args) {
        LinkedList<String> tarefas = new LinkedList<>();

        // Inserções
        tarefas.add("Estudar Java");
        tarefas.addFirst("Acordar");
        tarefas.addLast("Dormir");

        // Operações de pilha
        tarefas.push("Nova tarefa no topo");

        // Operações de fila
        tarefas.offer("Tarefa adicional");

        // Remoções
        String primeiro = tarefas.removeFirst();
        String ultimo = tarefas.removeLast();
        String removidoPorValor = tarefas.remove("Estudar Java");

        // Recuperação sem remoção
        String primeiroDaLista = tarefas.peek();
        String primeiroElemento = tarefas.element();

        // Iteração
        for (String tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }
}
```

## 4. Stack (Pilha)

### Exemplo Completo
```java
import java.util.Stack;

public class ExemploPilha {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        // Empilhando
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        // Verificando o topo sem remover
        System.out.println("Topo: " + pilha.peek());

        // Desempilhando
        int topo = pilha.pop();
        System.out.println("Elemento removido: " + topo);

        // Verificações
        System.out.println("Pilha vazia? " + pilha.isEmpty());
        System.out.println("Posição do elemento: " + pilha.search(20));
    }
}
```

## 5. Queue (Fila)

### Implementações Diferentes
```java
import java.util.*;

public class ExemploFilas {
    public static void main(String[] args) {
        // Fila padrão
        Queue<String> filaSimples = new LinkedList<>();
        filaSimples.add("Primeiro");
        filaSimples.offer("Segundo");     

        // Deque (fila de duas pontas)
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Início");
        deque.addLast("Fim");
    }
}
```

## 6. HashMap

### Operações Avançadas
```java
import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        // Criação
        HashMap<String, Integer> idades = new HashMap<>();

        // Inserção
        idades.put("João", 25);
        idades.put("Maria", 30);

        // Recuperação
        int idadeJoao = idades.get("João");
        int idadePadrao = idades.getOrDefault("Pedro", 0);

        // Verificações
        System.out.println(idades.containsKey("João"));
        System.out.println(idades.containsValue(25));

        // Iteração
        for (Map.Entry<String, Integer> entrada : idades.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }

        // Remoção
        idades.remove("Maria");

        // Substituição
        idades.replace("João", 26);
    }
}
```

## 7. TreeSet e TreeMap

### Exemplo Comparativo
```java
import java.util.TreeSet;
import java.util.TreeMap;

public class ExemploTreeStructures {
    public static void main(String[] args) {
        // TreeSet - Conjunto ordenado
        TreeSet<Integer> conjuntoOrdenado = new TreeSet<>();
        conjuntoOrdenado.add(5);
        conjuntoOrdenado.add(2);
        conjuntoOrdenado.add(8);
        
        // Métodos especiais
        System.out.println("Primeiro: " + conjuntoOrdenado.first());
        System.out.println("Último: " + conjuntoOrdenado.last());
        
        // TreeMap - Mapa ordenado
        TreeMap<String, Integer> mapaOrdenado = new TreeMap<>();
        mapaOrdenado.put("Banana", 3);
        mapaOrdenado.put("Abacaxi", 5);
        
        // Navegação
        System.out.println("Primeira chave: " + mapaOrdenado.firstKey());
    }
}
```

## 8. Set (Conjunto)

### Exemplos Comparativos
```java
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ExemploSets {
    public static void main(String[] args) {
        // HashSet - Não ordenado, mais rápido
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Python");

        // LinkedHashSet - Mantém ordem de inserção
        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("Java");
        linkedSet.add("Python");

        // TreeSet - Ordenado naturalmente
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Java");
        treeSet.add("Python");

        // Operações comuns
        hashSet.contains("Java");
        hashSet.remove("Python");
    }
}
```

## Considerações Finais

### Dicas de Desempenho
- Use `ArrayList` para acesso aleatório frequente
- Prefira `LinkedList` para muitas inserções/remoções
- `HashMap` para mapeamentos rápidos
- `TreeSet/TreeMap` quando precisar de ordenação

### Boas Práticas
- Sempre use generics
- Escolha a estrutura adequada ao problema
- Considere o Big O das operações
- Utilize métodos da biblioteca padrão

### Recursos Adicionais
- Java Collections Framework Documentation
- Livros: "Effective Java" de Joshua Bloch
- Plataformas como LeetCode para praticar estruturas de dados

Vou apresentar um guia resumido para escolha de estruturas de dados em Java:

## 1. Array
- **Quando usar:**
  - Tamanho fixo conhecido
  - Elementos do mesmo tipo
  - Acesso rápido por índice
  - Performance crítica
  - Memória contígua
  - Matrizes matemáticas
  - Buffers de tamanho fixo

## 2. ArrayList
- **Quando usar:**
  - Coleções que mudam de tamanho
  - Acesso aleatório frequente
  - Poucas inserções/remoções no meio
  - Iterações constantes
  - Armazenamento de listas de objetos
  - Quando precisa de métodos prontos

## 3. LinkedList
- **Quando usar:**
  - Muitas inserções/remoções
  - Manipulação de início/fim da lista
  - Implementação de filas
  - Pilhas
  - Quando o custo de navegação não é crítico
  - Listas que mudam frequentemente

## 4. Stack
- **Quando usar:**
  - Algoritmos com ordem LIFO
  - Parsing de expressões
  - Histórico de ações
  - Desfazer (undo)
  - Processamento de chamadas de funções
  - Verificação de parênteses/colchetes

## 5. Queue
- **Quando usar:**
  - Processamento de tarefas
  - Buffers
  - Algoritmos de breadth-first
  - Escalonamento de processos
  - Requisições de sistema
  - Impressão de documentos

## 6. PriorityQueue
- **Quando usar:**
  - Algoritmos que precisam de ordenação
  - Escalonamento com prioridades
  - Grafos (algoritmo de Dijkstra)
  - Sistemas de gerenciamento
  - Processamento de eventos com prioridade

## 7. HashSet
- **Quando usar:**
  - Eliminar duplicatas
  - Verificação rápida de existência
  - Operações de conjunto
  - Caches
  - Quando a ordem não importa
  - Performance de busca é crucial

## 8. TreeSet
- **Quando usar:**
  - Conjunto ordenado
  - Navegação em conjunto
  - Encontrar elemento próximo
  - Intervalos de elementos
  - Quando precisa manter ordem natural

## 9. HashMap
- **Quando usar:**
  - Mapeamentos chave-valor
  - Caches
  - Contadores
  - Agrupamentos
  - Indexação rápida
  - Quando precisa associar chaves a valores

## 10. TreeMap
- **Quando usar:**
  - Mapa ordenado por chave
  - Navegação em mapas
  - Intervalos de chaves
  - Quando precisa de ordenação
  - Estruturas que dependem de ordem

## Exemplos Práticos

### Cenário: Sistema de Gestão de Alunos

1. **Lista de Alunos**: ArrayList
```java
ArrayList<Aluno> alunos = new ArrayList<>();
```

2. **Histórico de Matrículas**: LinkedList
```java
LinkedList<Matricula> historico = new LinkedList<>();
```

3. **Controle de Presenças**: HashSet
```java
HashSet<String> alunosPresentes = new HashSet<>();
```

4. **Ranking de Notas**: TreeSet
```java
TreeSet<Aluno> ranking = new TreeSet<>(
    Comparator.comparing(Aluno::getNota).reversed()
);
```

### Cenário: Sistema Bancário

1. **Transações Recentes**: Stack
```java
Stack<Transacao> transacoesRecentes = new Stack<>();
```

2. **Fila de Atendimento**: Queue
```java
Queue<Cliente> filaAtendimento = new LinkedList<>();
```

3. **Clientes por Agência**: HashMap
```java
HashMap<String, List<Cliente>> clientesPorAgencia = new HashMap<>();
```

## Dicas Finais

- Escolha baseada em:
  1. Frequência de operações
  2. Tipo de acesso necessário
  3. Performance esperada
  4. Complexidade do algoritmo

- Pratique e experimente
- Conheça a complexidade de cada operação
- Use a estrutura mais simples que resolve seu problema

Lembre-se: não existe estrutura perfeita, apenas a mais adequada para cada contexto específico.

### OBS:
- Usar o projecto ["Produto"](https://github.com/rns-yoda/eda/tree/main/projectos/ed_produtos) como referência para praticar as diferentes estruturas.
- Não precisam decorar, basta consultar a documentação sobre cada estrutura.
