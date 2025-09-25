# Desafio de Programação: Combate (DevSuperior)

Projeto em Java desenvolvido como parte do desafio do capítulo "Construtores, this, sobrecarga, encapsulamento" do curso **Formação Desenvolvedor Moderno** da DevSuperior.

## 🚀 Sobre o Desafio

Este programa em Java simula um combate em turnos entre dois campeões. O sistema lê os atributos (nome, vida, ataque e armadura) de cada campeão e o número de turnos desejados. Em seguida, executa a simulação, mostrando o status de cada lutador ao final de cada turno até que um seja derrotado ou os turnos se encerrem.

### ✔️ Funcionalidades Implementadas

* Leitura de dados de dois campeões via console.
* Simulação de combate em turnos, onde os dois campeões se atacam mutuamente a cada turno.
* Cálculo de dano baseado em `ataque` do atacante vs. `armadura` do defensor.
* Implementação de regras de negócio, como:
    * Dano mínimo de 1 ponto, mesmo que a armadura seja superior ao ataque.
    * A vida de um campeão não pode ficar negativa (o mínimo é 0).
* O combate termina se um dos campeões for derrotado (`vida == 0`) ou ao final dos turnos estipulados.
* Relatório de status é exibido a cada turno e uma mensagem final encerra o combate.

## ⚙️ Como Executar

1.  **Pré-requisitos:**
    * É necessário ter o Java JDK (versão 17 ou superior) instalado.

2.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/seu-usuario/seu-repositorio.git](https://github.com/seu-usuario/seu-repositorio.git)
    ```

3.  **Navegue e compile o projeto:**
    ```bash
    cd seu-repositorio/src
    javac application/Main.java entities/Champion.java
    ```

4.  **Execute o programa:**
    ```bash
    java application.Main
    ```

### Exemplo de Uso

Digite os dados do primeiro campeão:
Nome: Darius
Vida inicial: 50
Ataque: 8
Armadura: 1
Digite os dados do segundo campeão:
Nome: Fiora
Vida inicial: 40
Ataque: 30
Armadura: 10
Quantos turnos você deseja executar? 4

Resultado do turno 1:
Darius: 21 de vida
Fiora: 39 de vida

Resultado do turno 2:
Darius: 0 de vida (morreu)
Fiora: 38 de vida

FIM DO COMBATE


## 🧠 Conceitos Praticados

Este projeto foi uma oportunidade para praticar e aprofundar os seguintes conceitos de Java e Programação Orientada a Objetos:

* **Programação Orientada a Objetos (POO)**
* Criação de classes e objetos (`Champion`)
* **Encapsulamento** (uso de atributos `private` e métodos `getters`)
* **Construtores** para inicialização de objetos
* Uso da palavra-chave **`this`** para referenciar atributos do próprio objeto
* Interação entre objetos (um campeão afetando o estado de outro)
* Estruturas de repetição (`for`) e condicionais (`if-else`)
* Entrada de dados com a classe `Scanner`

---

Feito por **Victor Xavier**.
