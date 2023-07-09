package racingcar;

import java.util.Scanner;

public class InputReceiver {
    private UserInput userInput;
    private final Scanner scanner;

    public InputReceiver() {
        this.scanner = new Scanner(System.in);
    }

    public String enterUserInput() {
        this.userInput = new UserInput(this.scanner.nextLine());
        return this.userInput.getReceivedUserInput();
    }

    public UserInput getUserInput() {
        return userInput;
    }
}
