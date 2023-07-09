package racingcar;

import java.util.Scanner;

public class InputReceiver {
    private UserInput userInput;

    public String enterUserInput() {
        Scanner sc = new Scanner(System.in);
        this.userInput = new UserInput(sc.nextLine());
        return this.userInput.getReceivedUserInput();
    }
}
