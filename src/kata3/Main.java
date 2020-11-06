package kata3;

public class Main {

    public static void main(String[] args) {
        Histogram <String> histogram = new Histogram <String>();
        histogram.increment("hotmail.com");
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("gmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("gmail.com");
        
        new HistogramDisplay(histogram).execute();
    }

}
