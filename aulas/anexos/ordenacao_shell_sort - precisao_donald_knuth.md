# Shell Sort: Precisão de Donald Ervin Knuth 

### 1. A Fórmula da Sequência de Knuth

A sequência de gaps (ou $\ h $) é gerada usando a fórmula:

$$ 
h_k = \frac{3^k - 1}{2} 
$$

**Onde**:
- $\ h_k $: é o valor do gap para a posição $\ k $ na sequência.
- $\ h $: é o índice da sequência (inteiro positivo, começando de 1).

---

### 2. Parâmetros Importantes

- **$\ N $**: Tamanho da lista que será ordenada. Ele determina até onde os valores de $\ h_k$ podem ser usados (devem ser $\ h_k \leq N $).
- **$\ k $**: O índice usado para calcular cada gap.
- **$\ h $**: Cada valor de gap resultante da fórmula para um determinado $\ k $.

---

### 3. Como Determinar os Gaps

1. **Determine o tamanho da lista** ($\ N $).
   - Exemplo: $\ N = 100 $.

2. **Calcule os valores de gap** ($\ h $) usando a fórmula $\ h_k = \frac{3^k - 1}{2} $.
   - Comece com $\ k = 1 $.
   - Aumente $\ k $ progressivamente ($\ k = 2, 3, 4, \dots $) até que $\ h_k > N $.

3. **Selecione os gaps válidos**:
   - Apenas os valores $\ h_k \leq N $ serão usados.
   - Os gaps devem ser aplicados em ordem decrescente.

---

### 4. Exemplo Detalhado

Vamos calcular os valores de $\ h $ para uma lista com $\ N = 100 $:

#### Para $\ k = 1 $:
$$ 
h_1 = \frac{3^1 - 1}{2} = \frac{3 - 1}{2} = 1 
$$
- $\ h_1 = 1 $ (válido porque $\ 1 \leq 100 $).

#### Para $\ k = 2 $:
$$ 
h_2 = \frac{3^2 - 1}{2} = \frac{9 - 1}{2} = 4 
$$
- $\ h_2 = 4 $ (válido porque $\ 4 \leq 100 $).

#### Para $\ k = 3 $:
$$ 
h_3 = \frac{3^3 - 1}{2} = \frac{27 - 1}{2} = 13 
$$
- $\ h_3 = 13 $ (válido porque $\ 13 \leq 100 $).

#### Para $\ k = 4 $:
$$ 
h_4 = \frac{3^4 - 1}{2} = \frac{81 - 1}{2} = 40 
$$
- $\ h_4 = 40 $ (válido porque $\ 40 \leq 100 $).

#### Para $\ k = 5 $:
$$ 
h_5 = \frac{3^5 - 1}{2} = \frac{243 - 1}{2} = 121 
$$
- $\ h_5 = 121 $ (**inválido porque $\ 121 > 100 $**).

---

### Gaps Válidos para $\ N = 100 $

Os valores de gap (h) que serão usados são: **40, 13, 4, 1**.

---

### 5. Resumo Final

- **Fórmula**: $\ h_k = \frac{3^k - 1}{2} $ .
- **Determine (k)**: Use valores de (k) incrementais enquanto $\ h_k \leq N $.
- **Gaps válidos**: São os valores de $\ h $ menores ou iguais a $\ N $, aplicados em ordem decrescente no algoritmo. 

---

# Calculando de forma precisa o numero de varreduras 

Para calcular o valor de $\ k $ (o número de varreduras) a partir da fórmula:

$$
\frac{N}{2} = \frac{3^k - 1}{2}
$$

Vamos resolver para $\ k $.

### Passos para resolver a equação:

1. Multiplicar ambos os lados da equação por 2 para eliminar o denominador:

$$
N = 3^k - 1
$$

2. Adicionar 1 a ambos os lados:

$$
N + 1 = 3^k
$$

3. Agora, aplicar o logaritmo de base 3 em ambos os lados para isolar $\ k $:

$$
k = \log_3(N + 1)
$$

Ou, usando a mudança de base, podemos reescrever como:

$$
k = \frac{\log(N + 1)}{\log 3}
$$

### Exemplo

Suponha que $\ N = 100 $:

1. Substitua $\ N $ na fórmula:

$$
k = \frac{\log(100 + 1)}{\log 3}
$$

2. Calculando:

$$
k = \frac{\log(101)}{\log 3}
$$

Sabemos que:

- $\ \log(101) \approx 2.0043 $
- $\ \log 3 \approx 0.4771 $

Logo:

$$
k \approx \frac{2.0043}{0.4771} \approx 4.2
$$

Portanto, $\ k $ é aproximadamente 4. Isso significa que a sequência de gaps será calculada para $\ k = 1, 2, 3, 4 $, e o gap para $\ k = 5 $ será maior que 100 e, portanto, não será utilizado.
 
---


<!--
### **Nota**: Renderizar as fórmulas com LaTeX, tanto em formato inline quanto em bloco.

$$ 
\frac{3^3 - 1}{2} 
$$


$ \frac{3^3 - 1}{2} $
-->