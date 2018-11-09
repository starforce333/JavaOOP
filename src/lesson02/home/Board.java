package lesson02.home;

public class Board {
    private String partOne;
    private String partTwo;
    private String partThree;
    private String partFour;

    public Board(String partOne, String partTwo, String partThree, String partFour) {
        this.partOne = partOne;
        this.partTwo = partTwo;
        this.partThree = partThree;
        this.partFour = partFour;
    }

    public Board() {
    }

    public String putFigure(String figure) {
        if (partOne == null) {
            partOne = figure;
            return partOne;
        }
        if (partTwo == null) {
            partTwo = figure;
            return partTwo;
        }
        if (partThree == null) {
            partThree = figure;
            return partThree;
        }
//        if (partFour == null) {
//            partFour = figure;
//            return partFour;
//        }
        partFour = figure;
        return partFour;

    }

    public String removeFigure(String figure, String part) {
        if (part == partOne) {
            partOne = figure;
            return partOne;
        }
        if (part == partTwo) {
            partTwo = figure;
            return partTwo;
        }
        if (part == partThree) {
            partThree = figure;
            return partThree;
        }
        if (part == partFour) {
            partFour = null;
            return partFour;
        }


        return figure;
    }

    public String check() {
        String board = "";
        if (partOne != null) {
            board += partOne + System.lineSeparator() ;
        }
        if (partTwo != null) {
            board += partTwo + System.lineSeparator();
        }
        if (partThree != null) {
            board += partThree + System.lineSeparator();
        }
        if (partFour != null) {
            board += partFour + System.lineSeparator();
        }
        if (board == null) {
            board = "The board is empty";
        } else {

        }
        return board;
    }

}


//        Доска поделена на 4 части в каждую
//        часть доски можно положить одну из фигур. У доски должны
//        быть методы которые помещают и удаляют фигуру с доски.
//        Также должен быть метод который выводит информацию о
//        всех фигурах лежащих на  доске и их суммарную площадь.