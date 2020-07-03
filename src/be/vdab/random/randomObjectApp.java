package be.vdab.random;

import java.util.Random;

public class randomObjectApp {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 25; i++){
            int integer = random.nextInt(1000);
            System.out.println(integer);
            if(integer <250){
                System.out.println("PIEF ");
            }
            else if(integer<500){
                System.out.println("POEF");
            }
            else{
                System.out.println("PAF ");
            }
        }



    }
}
