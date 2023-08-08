package JavaS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Collections1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
        ArrayList<String> cores = new ArrayList<>();


        for(int i =0 ; i<5 ; i++) {
            System.out.print("\nDigite a "+(i+1)+"° cor: ");
            String cor =leia.nextLine();
            cores.add(cor);
        }
        System.out.println("\nAs cores selecionadas foram: "+cores);

        Collections.sort(cores);
        System.out.println("\nCores ordenadas: ");
        System.out.println(cores);
        System.out.println();

    }

	}

