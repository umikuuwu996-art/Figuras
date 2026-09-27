//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

void main() {
    Scanner NICOL = new Scanner(System.in);

    int tamaño;
    int figura;

    System.out.print("Ingrese el tamaño: ");
    tamaño = NICOL.nextInt();

    System.out.print("Ingrese la figura (1 = cuadrado, 2 = triangulo): ");
    figura = NICOL.nextInt();

    if (figura == 1) {

        // CUADRADO
        for (int i = 1; i <= tamaño; i++) {

            for (int j = 1; j <= tamaño; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    } else if (figura == 2) {

        // TRIANGULO
        for (int i = 1; i <= tamaño; i++) {

            for (int j = 1; j <= tamaño - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


    } else {
        System.out.println("Figura no válida.");
    }
}
