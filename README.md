# Projeto hellTriangle

Programa desenvolvido visando reolver o problema "Hell Triangle".

O problema consiste na seguinte descrição:

Given a triangle of numbers, find the maximum total from top to bottom
Example:

   6
  3 5
 9 7 1
4 6 8 4
In this triangle the maximum total is: 6 + 5 + 7 + 8 = 26
An element can only be summed with one of the two nearest elements in the next row.
For example: The element 3 in the 2nd row can only be summed with 9 and 7, but not with
1
Your code will receive an (multidimensional) array as input.
The triangle from above would be:

example = [[6],[3,5],[9,7,1],[4,6,8,4]]


###### Descrição Algoritmo #####

Para a solução, foi adotado um algoritmo recursivo visando escalabilidade (tantos níveis quantos forem desejados na pirâmide), além disso a simplicidade do método
responsável pelo cálculo provê facilidade na manutenção do mesmo.

Foram criados os seguintes casos de teste:

1 - Entrada vazia ou nula
2 - Entrada com um único elemento.
3 - Entrada mal formada.
4 - Sucesso.

Os testes foram implementados utilizado Junit 4.



##### Manual de Execução ####

Para execução do algoritmo, basta rodar como Aplicação Java a classe Application, esta contém um caso de teste simples de sucesso.

Para execução da suite de testes, basta rodar como Aplicação Java a classe HellTriangleSuitRunner.
Caso deseje executar cada teste unitariamente, basta rodar a classe específica de cada um contida no pacote \\src\test\java\com\b2w\hellTriangle


OBS: Haja visto que o problema foi descrito em inglês, o código assim também foi desenvolvido para que seja mantida a coerência.
