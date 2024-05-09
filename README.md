# <img align="center" width="40px" src="https://hermes.digitalinnovation.one/assets/diome/logo-minimized.png"> Orientação a Objetos na Prática com Java
www.dio.me


#### Desenvolvido na linguagem Java por:
- [Marcos Shirafuchi](https://github.com/marcosfshirafuchi)
# Desafio 01 / 05 - Registro de Transações Bancárias
## Descrição
Você está desenvolvendo um programa simples em Java para manter um registro de transações bancárias. Cada transação é armazenada em uma lista.
## Entrada


* O programa solicitará ao usuário que informe o saldo inicial da conta.
* Em seguida, o programa solicitará a quantidade total de transações que o cliente deseja realizar.

### Entrada de Transações:
* Para cada transação, o programa solicitará ao usuário:
  * O tipo de transação: Digite 'D' para depósito ou 'S' para saque.
  * O valor da transação.
## Saída

* Utilizando listas (ArrayList ou LinkedList), o programa armazenará cada transação, que incluirá um tipo (Depósito ou Saque) e um valor.
* Ao final das transações, o programa exibirá o saldo final da conta e a lista de transações.


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
      <td>2500<br>
           2<br>
           d<br>
         100<br>
          s<br>
         500<br>
      </td>
      <td>Saldo: 2100.0<br>
Transacoes:<br>
1. Deposito de 100.0<br>
2. Saque de 500.0<br>
      </td>
    </tr>
    <tr>
      <td>900<br>
1<br>
s<br>
100<br>
      </td>
      <td>Saldo: 800.0<br>
Transacoes:<br>
1. Saque de 100.0.<br></td>
    </tr>
    <tr>
      <td>0<br>
0<br>
</td>
      <td>Saldo: 0.0<br>
Transacoes:<br>
</td>   
    </tr>
  </tbody>
  <tfoot></tfoot>
</table>





