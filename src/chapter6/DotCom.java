package chapter6;

import java.util.ArrayList;

class DotCom {
    private ArrayList<String> locationCells;

    public void setLocationCell(ArrayList<String> locations) {
        locationCells = locations;
    }

    public String checkYourself(String userGuess) {
        String result = "Мимо";
        int index = locationCells.indexOf(userGuess);

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "Потопил";
            } else {
                result = "Попал";
            }
        }

        return result;
    }
}
