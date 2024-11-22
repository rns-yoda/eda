# Algoritmos de Ordenação: Selection Sort


## O que é o Selection Sort?

- **Selection Sort** é um algoritmo simples de ordenação.
- Ele funciona percorrendo a lista, encontrando o menor (ou maior) elemento na parte não ordenada da lista e trocando-o com o primeiro elemento não ordenado.

---

## Como funciona?

1. **Iteração**: Começa pelo primeiro elemento e encontra o menor elemento na parte não ordenada da lista.
2. **Troca**: Troca o menor elemento encontrado com o primeiro elemento não ordenado.
3. **Repetição**: Repete esse processo para todos os elementos até que toda a lista esteja ordenada.

---

## Passos do Algoritmo
1. Iniciar do primeiro elemento da lista.
2. Encontrar o menor elemento na parte não ordenada da lista.
3. Trocar esse menor elemento com o primeiro elemento não ordenado.
4. Repetir até o final da lista.

---

## Exemplo

### Lista Original: `{3, 0, 11, 5, 2, 1, 7, 9, 10}`

Aplicando o **Selection Sort** com **detalhamento completo**, evidenciando os elementos que são trocados em cada iteração, incluindo as comparações feitas para encontrar os menores elementos.

---

### Passo a Passo

| Iteração | Lista Atual              | Comparações | Trocas | Elementos Trocados             |
|----------|--------------------------|-------------|--------|--------------------------------|
| Inicial  | {3, 0, 11, 5, 2, 1, 7, 9, 10} | 0           | 0      | -                              |
| **1**    | {0, 3, 11, 5, 2, 1, 7, 9, 10} | 8           | 1      | 3 ↔ 0                         |
| **2**    | {0, 1, 11, 5, 2, 3, 7, 9, 10} | 7           | 1      | 3 ↔ 1                         |
| **3**    | {0, 1, 2, 5, 11, 3, 7, 9, 10} | 6           | 1      | 11 ↔ 2                        |
| **4**    | {0, 1, 2, 3, 11, 5, 7, 9, 10} | 5           | 1      | 5 ↔ 3                         |
| **5**    | {0, 1, 2, 3, 5, 11, 7, 9, 10} | 4           | 1      | 11 ↔ 5                         |
| **6**    | {0, 1, 2, 3, 5, 7, 11, 9, 10} | 3           | 1      | 11 ↔ 7                         |
| **7**    | {0, 1, 2, 3, 5, 7, 9, 11, 10} | 2           | 1      | 11 ↔ 9                         |
| **8**    | {0, 1, 2, 3, 5, 7, 9, 10, 11} | 1           | 1      | 11 ↔ 10                        |

---

### Iteração detalhada

1. **Iteração 1**:  
   **Elemento atual:** 3  
   Comparado com: 0, 11, 5, 2, 1, 7, 9, 10 (8 comparações).  
   **Troca:** `3 ↔ 0` (menor elemento encontrado: 0).  
   Lista: `{0, 3, 11, 5, 2, 1, 7, 9, 10}`  

2. **Iteração 2**:  
   **Elemento atual:** 3  
   Comparado com: 11, 5, 2, 1, 7, 9, 10 (7 comparações).  
   **Troca:** `3 ↔ 1` (menor elemento encontrado: 1).  
   Lista: `{0, 1, 11, 5, 2, 3, 7, 9, 10}`  

3. **Iteração 3**:  
   **Elemento atual:** 11  
   Comparado com: 5, 2, 3, 7, 9, 10 (6 comparações).  
   **Troca:** `11 ↔ 2` (menor elemento encontrado: 2).  
   Lista: `{0, 1, 2, 5, 11, 3, 7, 9, 10}`  

4. **Iteração 4**:  
   **Elemento atual:** 5  
   Comparado com: 11, 3, 7, 9, 10 (5 comparações).  
   **Troca:** `5 ↔ 3` (menor elemento encontrado: 3).  
   Lista: `{0, 1, 2, 3, 11, 5, 7, 9, 10}`  

5. **Iteração 5**:  
   **Elemento atual:** 11  
   Comparado com: 5, 7, 9, 10 (4 comparações).  
   **Troca:** `11 ↔ 5` (menor elemento encontrado: 5).  
   Lista: `{0, 1, 2, 3, 5, 11, 7, 9, 10}`  

6. **Iteração 6**:  
   **Elemento atual:** 11  
   Comparado com: 7, 9, 10 (3 comparações).  
   **Troca:** `11 ↔ 7` (menor elemento encontrado: 7).  
   Lista: `{0, 1, 2, 3, 5, 7, 11, 9, 10}`  

7. **Iteração 7**:  
   **Elemento atual:** 11  
   Comparado com: 9, 10 (2 comparações).  
   **Troca:** `11 ↔ 9` (menor elemento encontrado: 9).  
   Lista: `{0, 1, 2, 3, 5, 7, 9, 11, 10}`  

8. **Iteração 8**:  
   **Elemento atual:** 11  
   Comparado com: 10 (1 comparação).  
   **Troca:** `11 ↔ 10` (menor elemento encontrado: 10).  
   Lista: `{0, 1, 2, 3, 5, 7, 9, 10, 11}`  

---

### Totais:
- **Comparações:** \(8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 = 36\)
- **Trocas:** \(1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 = 8\)