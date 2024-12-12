### Exercícios de Tabelas Bidimensionais em Java

#### Exercício 1: Criação e Impressão de Matriz
```java
public class MatrizBasica {
    public static void main(String[] args) {
        // Crie uma matriz 3x3 de inteiros
        // Preencha com números de 1 a 9
        // Imprima a matriz completa
    }
}
```

#### Exercício 2: Soma dos Elementos
```java
public class SomaMatriz {
    public static void main(String[] args) {
        // Crie uma matriz 4x4
        // Calcule e imprima a soma de todos os elementos
    }
}
```

#### Exercício 3: Encontrar o Maior Elemento
```java
public class MaiorElemento {
    public static void main(String[] args) {
        // Crie uma matriz 3x4 com números aleatórios
        // Encontre e imprima o maior elemento da matriz
    }
}
```

#### Exercício 4: Matriz de Notas
```java
public class NotasAlunos {
    public static void main(String[] args) {
        // Crie uma matriz para armazenar notas de 3 alunos em 4 bimestres
        // Calcule a média de cada aluno
        // Imprima as médias
    }
}
```

#### Exercício 5: Matriz Identidade
```java
public class MatrizIdentidade {
    public static void main(String[] args) {
        // Crie uma matriz identidade 5x5
        // Uma matriz identidade tem 1 na diagonal principal e 0 nos outros lugares
        // Imprima a matriz
    }
}
```

#### Exercício 6: Transpor Matriz
```java
public class TransporMatriz {
    public static void main(String[] args) {
        // Crie uma matriz original 3x4
        // Crie uma matriz transposta 4x3
        // Troque linhas por colunas
        // Imprima ambas as matrizes
    }
}
```

### Dicas de Resolução:

1. Para criar uma matriz: `int[][] nomeDaMatriz = new int[linhas][colunas];`
2. Acessar elemento: `nomeDaMatriz[linha][coluna]`
3. Percorrer matriz:
```java
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        // Faça algo com matriz[i][j]
    }
}
```

### Algumas estratégias:
- Comece com os exercícios mais simples
- Use loops aninhados para percorrer matrizes
- Preste atenção nos índices
- Faça testes incrementais
 