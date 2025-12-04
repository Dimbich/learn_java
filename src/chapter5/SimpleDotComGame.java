package chapter5;

class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuess = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom simpleDotCom = new SimpleDotCom();
        int randomNum = (int)(Math.random() * 5);
        int locations[] = {randomNum, randomNum + 1, randomNum + 2};
        simpleDotCom.setLocationCell(locations);
        boolean isActive = true;

        while (isActive) {
            String guess = helper.getUserInput("Введите число");
            String result = simpleDotCom.checkYourself(guess);
            numOfGuess++;
            if (result.equals("Потопил")) {
                isActive = false;
                System.out.println("Вам потребовалось " + numOfGuess + " попыток(и)");
            }
        }
    }
}
