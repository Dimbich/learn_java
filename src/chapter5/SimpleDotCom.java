package chapter5;

class SimpleDotCom {
    private int[] locationCells;
    private int numOfHits = 0;

    public void setLocationCell(int[] locations) {
        locationCells = locations;
    }

    public String checkYourself(String userGuess) {
        int guess = Integer.parseInt(userGuess);
        String result = "Мимо";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == locationCells.length) {
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
}
