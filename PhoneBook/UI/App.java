package PhoneBook.UI;

import java.util.Scanner;
import PhoneBook.Core.MVP.View;
import PhoneBook.Config;
import PhoneBook.Core.MVP.Presenter;

public class App {
    public static void ButtonClick() {
        System.out.print("\033[H\033[J");
        View view = new NewConsoleView();
        Presenter presenter = new Presenter(view, Config.pathDb);
        presenter.LoadFromFile();

        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                System.out.println(" 1 - prev  2 - next");
                String key = in.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "1":
                        presenter.prev();
                        break;
                    case "2":
                        presenter.next();
                        break;
                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }
    }
}

