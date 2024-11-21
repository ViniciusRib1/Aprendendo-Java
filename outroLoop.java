import java.util.Scanner;

public class outroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totaldeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme e coloque -1 para sair ");
            nota = leitura.nextInt();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totaldeNotas++;
            }

        }

        System.out.println("Média de avaliação: " + mediaAvaliacao / totaldeNotas);
    }
}
