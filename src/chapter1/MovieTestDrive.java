package chapter1;
class Movie {
    String title;
    String genre;
    int rating;
    void play() {
        System.out.println("Проигрывание фильма");
    }
}

class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Как прогореть на акциях";
        one.genre = "Трагедия";
        one.rating = -2;
        one.play();
        Movie two = new Movie();
        two.title = "Потеренные в офисе";
        two.genre = "Комедия";
        two.rating = 5;
        two.play();
        Movie three = new Movie();
        three.title = "Байт-клуб";
        three.genre = "Трагедия, но в целом веселая";
        three.rating = 127;
        three.play();
    }
}
