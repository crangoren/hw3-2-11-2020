package homework3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        askAnswer();

    }

    public static void askAnswer() {
        int counter = 3;
        int num = ((int)(Math.random() * 9));

        for(int i = 0; i < 3; ++i) {
            System.out.println("Введите число от 0 до 9");
            Scanner number = new Scanner(System.in);
            //  System.out.println(number);
            int answ = number.nextInt();
            counter--;
            if (counter == 0 && answ != num) {
                System.out.println("Вы проиграли =( загаданное число - " + num);
                newGame();
            } else if (answ == num) {
                System.out.println("Вы угадали =) загаданное число - " + num);
                newGame();
            } else if (answ < num) {
                System.out.println("Вы не угадали, загаданное число больше. Осталось " + counter + " попытки");
            } else {
                System.out.println("Вы не угадали, загаданное число меньше. Осталось " + counter + " попытки");
            }
        }
        return;


    }
    public static void newGame() {
        System.out.println("Хотите сыграть снова? \n 1 - ДА. 0 - НЕТ.");
        Scanner playAgain = new Scanner(System.in);
        int play = playAgain.nextInt();
        if (play == 1) {
            askAnswer();
        } else if (play == 0) {
            System.out.println("Спасибо за игру!");
            playAgain.close();
        } else {
            do {System.out.println ("Введите 1 или 0! \n ");}
            while (play == 0 || play == 1);
            newGame();
        }
    }
//    public static void guessWord() {
//        String[] words = {
//                "apple", "orange",
//                "lemon", "banana",
//                "apricot", "avocado",
//                "broccoli", "carrot",
//                "cherry", "garlic",
//                "grape", "melon",
//                "leak", "kiwi",
//                "mango", "mushroom",
//                "nut", "olive",
//                "pea", "peanut",
//                "pear", "pepper",
//                "pineapple", "pumpkin",
//                "potato"};
//        Scanner answerWord = new Scanner(System.in);
//        String answer = answerWord.nextLine();
//
//  }
}




