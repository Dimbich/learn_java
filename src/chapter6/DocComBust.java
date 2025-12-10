package chapter6;

import java.util.ArrayList;

public class DocComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<>();
    private  int numberOfGuesses = 0;

    private void setUpGame(){
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        System.out.println("Ваша цель потопить три \"сайта\".");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Попытайтесь потопить их за минимальное кол-во шагов");

        for (DotCom dotComToSet:dotComList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCell(newLocation);
        }
    }

    private void startPlaying() {
        while (!dotComList.isEmpty()) {
            String userGuess =helper.getUserInput("Сделайте ход");
            checkUserGuess(userGuess);
        }

        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numberOfGuesses++;
        String result = "Мимо";

        for (DotCom dotComToTest:dotComList) {
            result  = dotComToTest.checkYourself(userGuess);

            if(result.equals("Попал")) {
                break;
            }

            if (result.equals("Потопил")) {
                dotComList.remove(dotComToTest);
                break;
            }
        }

        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("Все сайты ушли ко дну! Ваши акции теперь ничего не стоят.");

        if(numberOfGuesses <= 18) {
            System.out.println("Это заняло у вас всего " + numberOfGuesses + " попыток");
            System.out.println("Вы успели выбраться до того, как вашивложения затонут");
        } else {
            System.out.println("Это заняло у вас довольно много времени. " + numberOfGuesses + " попыток");
            System.out.println("Рыбы водят хороводы вокрыг ваших вложений");
        }
    }

    public static void main(String[] args) {
        DocComBust game = new DocComBust();
        game.setUpGame();
        game.startPlaying();
        game.finishGame();
    }
}
