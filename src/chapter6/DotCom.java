package chapter6;

import java.util.ArrayList;

class DotCom {
    private String name;
    private ArrayList<String> locationCells;

    public void setName(String name) {
        this.name = name;
    }

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
                System.out.println("Ой вы потопили " + name + " :(");
            } else {
                result = "Попал";
            }
        }

        return result;
    }
}
