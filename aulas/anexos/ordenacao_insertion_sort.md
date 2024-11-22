# Algoritmos de Ordenação: Insertion Sort

## O que é o Insertion Sort?
- **Insertion Sort** é um algoritmo de ordenação simples.
- Funciona construindo uma sequência ordenada, um item de cada vez, e insere cada novo item no local correto.

---

## Como funciona?

1. **Iteração**: Inicia do segundo elemento do vetor, comparando-o com o anterior.
2. **Inserção**: O elemento é comparado com os anteriores e colocado na posição correta.
3. **Repetição**: Este processo se repete para todos os elementos da lista até que a lista esteja ordenada.

---

## Passos do Algoritmo
1. Iniciar a partir do segundo elemento da lista.
2. Comparar o elemento atual com os anteriores.
3. Mover os elementos maiores para a direita.
4. Inserir o elemento atual na posição correta.
5. Repetir até o final da lista.

---

## Exemplo

### Lista Original: `{3, 0, 11, 5, 2, 1, 7, 9, 10}`

Aplicando o **Insertion Sort** com **detalhamento completo**, evidenciando os elementos que são trocados em cada iteração, incluindo as comparações feitas para encontrar as posições corretas.

---
 

Cada passo será detalhado mostrando:
1. Comparações realizadas.
2. Trocas efetuadas.

#### Passo a passo:

| Iteração | Lista Atual              | Comparações | Trocas | Elementos Trocados             |
|----------|--------------------------|-------------|--------|--------------------------------|
| Inicial  | {3, 0, 11, 5, 2, 1, 7, 9, 10} | 0           | 0      | -                              |
| **1**    | {0, 3, 11, 5, 2, 1, 7, 9, 10} | 1           | 1      | 3 ↔ 0                         |
| **2**    | {0, 3, 11, 5, 2, 1, 7, 9, 10} | 1           | 0      | Nenhuma                       |
| **3**    | {0, 3, 5, 11, 2, 1, 7, 9, 10} | 2           | 2      | 11 ↔ 5                        |
| **4**    | {0, 2, 3, 5, 11, 1, 7, 9, 10} | 4           | 3      | 11 ↔ 2, 5 ↔ 2, 3 ↔ 2          |
| **5**    | {0, 1, 2, 3, 5, 11, 7, 9, 10} | 5           | 4      | 11 ↔ 1, 5 ↔ 1, 3 ↔ 1, 2 ↔ 1   |
| **6**    | {0, 1, 2, 3, 5, 7, 11, 9, 10} | 5           | 1      | 11 ↔ 7                        |
| **7**    | {0, 1, 2, 3, 5, 7, 9, 11, 10} | 6           | 1      | 11 ↔ 9                        |
| **8**    | {0, 1, 2, 3, 5, 7, 9, 10, 11} | 6           | 1      | 11 ↔ 10                       |

---

#### Iteração detalhada

1. **Iteração 1**:  
   **Elemento atual:** 0  
   Comparado com: 3 (1 comparação).  
   **Troca:** `3 ↔ 0`  
   Lista: `{0, 3, 11, 5, 2, 1, 7, 9, 10}`  

2. **Iteração 2**:  
   **Elemento atual:** 11  
   Comparado com: 3 (1 comparação).  
   Nenhuma troca necessária.  
   Lista: `{0, 3, 11, 5, 2, 1, 7, 9, 10}`  

3. **Iteração 3**:  
   **Elemento atual:** 5  
   Comparado com: 11 (1ª comparação), depois com 3 (2ª comparação).  
   **Trocas:** `11 ↔ 5`  
   Lista: `{0, 3, 5, 11, 2, 1, 7, 9, 10}`  

4. **Iteração 4**:  
   **Elemento atual:** 2  
   Comparado com: 11, 5, 3, 0 (4 comparações).  
   **Trocas:** `11 ↔ 2, 5 ↔ 2, 3 ↔ 2`  
   Lista: `{0, 2, 3, 5, 11, 1, 7, 9, 10}`  

5. **Iteração 5**:  
   **Elemento atual:** 1  
   Comparado com: 11, 5, 3, 2, 0 (5 comparações).  
   **Trocas:** `11 ↔ 1, 5 ↔ 1, 3 ↔ 1, 2 ↔ 1`  
   Lista: `{0, 1, 2, 3, 5, 11, 7, 9, 10}`  

6. **Iteração 6**:  
   **Elemento atual:** 7  
   Comparado com: 11 (1ª comparação), 5 (2ª comparação).  
   **Troca:** `11 ↔ 7`  
   Lista: `{0, 1, 2, 3, 5, 7, 11, 9, 10}`  

7. **Iteração 7**:  
   **Elemento atual:** 9  
   Comparado com: 11 (1ª comparação), 7 (2ª comparação).  
   **Troca:** `11 ↔ 9`  
   Lista: `{0, 1, 2, 3, 5, 7, 9, 11, 10}`  

8. **Iteração 8**:  
   **Elemento atual:** 10  
   Comparado com: 11 (1ª comparação), 9 (2ª comparação).  
   **Troca:** `11 ↔ 10`  
   Lista: `{0, 1, 2, 3, 5, 7, 9, 10, 11}`  

---

#### Totais:
- **Comparações:** \(1 + 1 + 2 + 4 + 5 + 5 + 6 + 6 = 30\)
- **Trocas:** \(1 + 0 + 2 + 3 + 4 + 1 + 1 + 1 = 13\)
