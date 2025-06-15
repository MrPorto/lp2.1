import java.util.Scanner;

public class AcimaDaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] elementos = input.split(" ");
        int[] array = new int[elementos.length];

        for (int i = 0; i < elementos.length; i++) {
            array[i] = Integer.parseInt(elementos[i]);
        }

        int soma = 0;
        for (int num : array) {
            soma += num;
        }
        double media = soma/elementos.length;

        for (int num : array) {
            if (num > media){
                System.out.print(num + " ");
            }
        }
    }
}
