# <img align="center" width="40px" src="https://hermes.digitalinnovation.one/assets/diome/logo-minimized.png"> Condições, Loops e Exceções na Prática com Java
www.dio.me


#### Desenvolvido na linguagem Java por:
- [Marcos Shirafuchi](https://github.com/marcosfshirafuchi)
# Desafio 05 / 05 - Controle de saques
## Descrição
Você está desenvolvendo um programa simples em Java para auxiliar um cliente a realizar saques de uma conta bancária. O cliente pode fazer saques até atingir um limite diário predefinido.
## Entrada


* O programa solicitará ao usuário que informe o limite diário de saque.
* Em seguida, o programa solicitará ao usuário que informe o valor do primeiro saque.

## Saída

* Utilizando um laço for, o programa iterará sobre os saques.
* Para cada saque, o programa verificará se o valor ultrapassa o limite diário.
  * Se ultrapassar, o programa informará que o limite foi atingido e encerrará o loop.
  * Se não ultrapassar, o programa informará que o saque foi realizado com sucesso.

## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.
<table>
  <thead>
    <tr align="left">
      <th>Entrada</th>
      <th>Saída</th>
    </tr>
  </thead>
  <tbody align="left">
    <tr>
      <td>1500<br>
        430<br>
         0<br>
      </td>
      <td>Saque realizado. Limite restante: 1070.0<br>
        Transacoes encerradas.<br>
      </td>
    </tr>
    <tr>
      <td>500<br>
          1500<br>
      </td>
      <td>Limite diario de saque atingido. Transacoes encerradas.</td>
    </tr>
    <tr>
      <td>80<br>
          40<br>
          0<br>
</td>
      <td>Saque realizado. Limite restante: 40.0<br>
          Transacoes encerradas.<br>
</td>   
    </tr>
  </tbody>
  <tfoot></tfoot>
</table>





