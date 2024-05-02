import java.util.Scanner;

public class ControleSimplesDeSaques {
    /**
     * <h1>Condições, Loops e Exceções na Prática com Java</h1>
     * Desafio 5 - Controle de Saques.
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   01/05/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double saque  = 0;
        // TODO: Crie um loop 'for' para iterar sobre os saques:
        for (double valorSaque  = saque; limiteDiario >valorSaque ;limiteDiario-=valorSaque){
            // TODO: Solicite ao usuário o valor do saque:
            saque = scanner.nextDouble();

            // TODO: Verifique se o valor do saque é zero, encerrando as transações:
            // Dica: Utilize um 'if/else' para verificar as condições do valorSaque e o limiteDiario;
            if (saque == 0) {
                System.out.println("Transacoes encerradas.");
                return;
            }else {

                // TODO: Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:
                if (saque <= limiteDiario) {
                    limiteDiario -= saque;
                    System.out.println("Saque realizado. Limite restante: " + String.format("%.1f", limiteDiario));
                } else {

                    // TODO: Informe que o saque foi realizado e mostre o limite restante:
                    System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                    return;
                }
            }
        }

        // Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close();
    }
}
