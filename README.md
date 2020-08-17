# Teste DEV Senior II #

O objetivo deste teste é avaliar a capacidade lógica em resolver especificado nas seções abaixo.

##  Requisitos ##

* Deve ser desenvolvido utilizando a linguagem Java.
* O tempo de execução das queries não pode ser superior a 5 segundos.

## Desafio ##

  Você está desenvolvendo uma nova linguagem de programação. Você acredita que a forma e os dicionários de dados das linguagens atuais são entediantes e
você quer criar uma estrutura que torne seu código único. A proposta da sua nova linguagem é que esta seja capaz de executar dois tipos de queries. A partir
de dois arrays A e B, os dois tipos de queries que podem ser executadas são as seguintes:
  
  1) Se a query está no formato [0, i, x] (começando com 0), então o valor de x deve ser atribuído à b[i].
  2) Se a query está no formato [1, x] (começando com 1), então você deve encontrar o número total de pares de i e j dos quais a[i] +b[j] = x.

  Será fornecido a você um conjunto de arrays de números inteiros A e B, assim como um array de queries em algum dos formatos descrito acima. 
Você deverá criar um algoritmo capaz de executar as queries que serão dadas e retornar um array de resultados. Você deverá implementar uma função que, ao ser 
chamada passando os arrays A e B e a query, retorne um array de resultados como exemplificado abaixo:

  **Exemplo 1:**

  a[1, 2, 3]
  
  b[3, 4]
  
  query [ [1,5], [0,0,1], [1,5] ]
  
  **resultado final: processaQuery(a, b, query) = [2,1]**

##  Testes ##

  **Test 1**
  
  A: [1,2,3]
  
  B: [3,4]
  
  Query: [ [1,5] ,[0,0,1], [1,5] ]
  
  Resultado esperado: [2,1]
  
  **Test 2**
  
  A: [1,2,2]
  
  B: [2,3]
  
  Query: [ [1,4], [0,0,3], [1,5]
  
  Resultado esperado: [3,4]
  
  **Test 3**
  
  A: [1]
  
  B: [2]
  
  Query: [ [1,2] ]
  
  Resultado esperado: [0]
  
  **Test 4**
  
  A: [1,1]
  
  B: [3,3,3]
  
  Query: [ [0, 1, 1], [1,0], [1,2], [1,1] ]
  
  Resultado esperado: [0, 2, 0]
  
  **Test 5**
  
  A: [5,6,4,4,10,6]
  
  B: [8,3,0]
  
  Query: [ [1, 12], [1,2], [1,4], [1,1], [1,12] ]
  
  Resultado esperado: [2, 0, 2, 0, 2]


## Resultado ##

  Para alcançar os objetivos do teste proposto, foi desenvolvida uma função na linguagem Java, utilizando estruturas de lógica de progamação, como loops e clausulas condicionais.
Essa função recebe três parâmetros, sendo dois arrays/listas de números inteiros, e um array/lista de arrays onde é esperado as queries.

  Foram realizados os cinco testes propostos na seção anterior, nos quais a função obteve sucesso, inclusive atendendo ao requisito de tempo proposto para execução, sendo assim em menos de 5 segundos.
