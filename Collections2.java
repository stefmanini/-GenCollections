package JavaS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collections2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(9);
        numeros.add(7);
        numeros.add(8);
        numeros.add(10);
        numeros.add(8);

        System.out.println("\nDigite o número que você deseja encontrar: ");
        int buscador = leia.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == buscador) {
                System.out.println("\nO número " + buscador + " está localizado na posição: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("\nO número " + buscador + " não foi encontrado!");
        }
    }
}

