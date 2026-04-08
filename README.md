[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/FwPOT7pJ)
# 🧩 Exercício: Inversão de Texto Usando Pilha

![Patinho de borracha suando com faixa de ginástica, segurando halteres](rubber-duck.png)

## 📌 Contexto

Uma **pilha (Stack)** é uma estrutura de dados que segue o princípio **LIFO (Last In, First Out)**, ou seja: o **último elemento a entrar é o primeiro a sair**.

Um exemplo do mundo real é uma pilha de pratos: você sempre pega o **de cima primeiro**, e se quiser chegar até o prato de baixo precisa remover os que estão acima.

---

## 🎯 Objetivo

Você deve implementar um método que **inverte uma string** utilizando **apenas uma pilha** como estrutura auxiliar.

Isso vai mostrar como a pilha pode ser aplicada para resolver problemas de manipulação de dados, já que empilhar e desempilhar naturalmente invertem a ordem dos elementos.

---

## 📝 O que você já recebeu

1. A **classe Pilha**, já implementada e pronta para uso.

    * Ela contém os métodos básicos como `push`, `pop`, `peek`, `isEmpty`, etc.

2. A **classe InverterTextoStack**, com o método `inverter` já declarado mas **não implementado**:

```java
public class InverterTextoStack {
    public static String inverter(String input) {
        // TODO: implementar usando Pilha
    }
}
```

3. Um conjunto de **testes JUnit** (`InverterTextoStackTest`) que verificam automaticamente se sua solução está correta.

---

⚠️ **Atenção:**

* Você **não pode** usar métodos prontos de inversão (`StringBuilder.reverse()`, etc).
* O uso de pilha é **obrigatório**.

---

## ✅ Exemplos de execução

Entrada → Saída esperada

* `"Java"` → `"avaJ"`
* `"12345"` → `"54321"`
* `"olá mundo"` → `"odnum aló"`
* `""` (string vazia) → `""` (string vazia)
* `"X"` → `"X"`

---

## 🧪 Testes

Se o seu método for implementado corretamente, **todos os testes JUnit fornecidos passarão**.

Eles cobrem:

* Palavras simples
* Números
* Frases com espaços
* Strings com caracteres especiais
* Casos de borda (string vazia, um único caractere, apenas espaços)

---

👉 A sua missão é **completar o método** de forma que todos os testes passem, provando que você entendeu como aplicar pilhas em um problema prático.

---