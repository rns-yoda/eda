# Algoritmos de Ordenação: Insertion Sort

Aqui está a versão do **Shell Sort** com base na explicação detalhada, utilizando uma variação precisa do algoritmo, como sugerido por Donald Ervin Knuth. O **Shell Sort** é uma melhoria do Insertion Sort que permite comparações e trocas de elementos mais distantes entre si, o que acelera a ordenação. A ideia é reduzir gradualmente o valor do intervalo (h) e aplicar o **Insertion Sort** a essas subsequências.

### O que é o Shell Sort?
- **Shell Sort** é uma generalização do Insertion Sort.
- A diferença principal é o uso de um intervalo (h) que permite comparações e trocas entre elementos que estão mais distantes.
- A cada iteração, o intervalo (h) é reduzido até ser igual a 1, e o algoritmo então aplica um **Insertion Sort** tradicional.

---

### Como funciona o Shell Sort?
1. **Inicialização**: Define um intervalo (h) grande e, em seguida, reduz esse intervalo.
2. **Comparações e Trocas**: Enquanto o intervalo não chega a 1, aplica-se uma versão modificada do Insertion Sort, onde os elementos são comparados com aqueles que estão a uma distância `h` de si.
3. **Redução do h**: O valor do intervalo (h) vai sendo reduzido até que se chegue a 1, quando o algoritmo termina com um Insertion Sort normal.

---

### Passos do Algoritmo:
1. Calcular o valor inicial de **h** ([ver exemplo aqui...](https://github.com/rns-yoda/eda/blob/main/aulas/anexos/ordenacao_shell_sort%20-%20precisao_donald_knuth.md)).
2. Para cada **h**, percorre-se o vetor realizando um **Insertion Sort** para as subsequências formadas pelos índices separados por `h`.
3. Repetir o processo até o valor de **h** ser 1.
4. Quando `h = 1`, o algoritmo realiza um **Insertion Sort** completo.

---

### Exemplo

Vamos usar o vetor: `{3, 0, 11, 5, 2, 1, 7, 9, 10}` e aplicar o **Shell Sort** com precisão de Donald Ervin Knuth, que utiliza o padrão de redução do intervalo.

#### Lista Original: `{3, 0, 11, 5, 2, 1, 7, 9, 10}` 

### Passos do Algoritmo:

1. Iniciamos com o valor **h = 4** ([seguindo a fórmula de Knuth](https://github.com/rns-yoda/eda/blob/main/aulas/anexos/ordenacao_shell_sort%20-%20precisao_donald_knuth.md)).
2. Durante a execução, vamos reduzir **h** até **h = 1**.
3. Quando **h = 1**, realizamos o **Insertion Sort** regular.

### Passo a passo detalhado com comparações e trocas:

| Iteração | h   | Lista Atual                      | Comparações | Trocas | Elementos Trocados               |
|----------|-----|-----------------------------------|-------------|--------|----------------------------------|
| Inicial  | -   | {3, 0, 11, 5, 2, 1, 7, 9, 10}     | 0           | 0      | -                                |
| **1**    | 4   | {3, 0, 11, 5, 2, 1, 7, 9, 10}     | 4           | 3      | 3 ↔ 2, 11 ↔ 1, 5 ↔ 1            |
| **2**    | 1   | {0, 2, 1, 3, 5, 7, 9, 10, 11}     | 14          | 7      | 11 ↔ 1, 5 ↔ 2, 7 ↔ 2, 3 ↔ 1     |
| **Totais**| -   | -                                 | **18**      | **10** | -                                |

### Detalhamento do algoritmo:

1. **Passo 1 (h = 4):**
   - Comparações entre os elementos separados por 4 posições:
     - 3 e 2: **1ª comparação** → Troca **3 ↔ 2**.
     - 0 e 1: **2ª comparação** → Nenhuma troca.
     - 11 e 1: **3ª comparação** → Troca **11 ↔ 1**.
     - 5 e 1: **4ª comparação** → Troca **5 ↔ 1**.
   
   **Comparações:** 4  
   **Trocas:** 3  
   
   Lista após o passo 1: `{3, 0, 11, 5, 2, 1, 7, 9, 10}`.

2. **Passo 2 (h = 1):**
   - Comparações entre elementos adjacentes (h = 1):
     - 3 e 0: **1ª comparação** → Troca **3 ↔ 0**.
     - 11 e 5: **2ª comparação** → Troca **11 ↔ 5**.
     - 2 e 1: **3ª comparação** → Troca **2 ↔ 1**.
     - 7 e 9: **4ª comparação** → Nenhuma troca.
     - 9 e 10: **5ª comparação** → Nenhuma troca.
     - 10 e 11: **6ª comparação** → Nenhuma troca.
   
   **Comparações:** 14  
   **Trocas:** 7

   Lista final após o passo 2: `{0, 1, 2, 3, 5, 7, 9, 10, 11}`.

---

### Totais:

- **Comparações totais:** \(4 + 14 = 18\)
- **Trocas totais:** \(3 + 7 = 10\)

---

Este é o cálculo detalhado para o algoritmo **Shell Sort** usando **h** com os totais de comparações e trocas no exemplo.
