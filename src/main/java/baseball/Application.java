package baseball;

public class Application {
    static Game game;
    public static void main(String[] args) {
        game = new Game();
        game.printStart();
        game.run();
        game.printFinish();
    }
}
