package guessinggame;

public class Player {
    int number = 0; //this is where the player's number that they guess will go

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing the number is " + number);
    }
}
