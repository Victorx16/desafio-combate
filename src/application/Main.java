package application;

import entities.Champion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // LUTADOR 1
        System.out.println("Digite os dados do primeiro campeão:");
        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Vida inicial: ");
        int life = sc.nextInt();

        System.out.print("Ataque: ");
        int attack = sc.nextInt();

        System.out.print("Armadura: ");
        int armor = sc.nextInt();
        sc.nextLine();

        Champion championA = new Champion(name, life, attack, armor);


        // LUTADOR 2
        System.out.println("Digite os dados do segundo campeão:");
        System.out.print("Nome: ");
        String name2 = sc.nextLine();

        System.out.print("Vida inicial: ");
        int life2 = sc.nextInt();

        System.out.print("Ataque: ");
        int attack2 = sc.nextInt();

        System.out.print("Armadura: ");
        int armor2 = sc.nextInt();

        Champion championB = new Champion(name2, life2, attack2, armor2);

        System.out.println();

        System.out.print("Quantos turnos você deseja executar?: ");
        int turnos = sc.nextInt();


        for(int i = 1; i <= turnos; i++){
            championA.takeDamage(championB);
            championB.takeDamage(championA);


            System.out.printf("Resultado do turno %d:%n", i);
            System.out.println(championA.status());
            System.out.println(championB.status());

            if(championA.getLife() == 0 || championB.getLife() == 0){
                break;
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("FIM DO COMBATE");


    }

}