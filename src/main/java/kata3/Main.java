package kata3;

import kata2.FileLoader;
import kata2.OscarWinner;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MainFrame main = new MainFrame();

        File file = new File("oscar_age_male.csv");
        List<OscarWinner> winners = new FileLoader(file).load();
        double [] data = winners.stream().mapToDouble(Main::toDouble).toArray();

        main.getHistogramDisplay().show(
                "Oscar winners by age",
                "Age",
                "Oscars won",
                data,
                50
        );
        main.setVisible(true);
    }

    private static double toDouble(OscarWinner oscarWinner) {
        return oscarWinner.getAge();
    }
}