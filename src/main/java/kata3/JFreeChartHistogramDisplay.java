package kata3;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.xy.IntervalXYDataset;

import javax.swing.*;

public class JFreeChartHistogramDisplay extends JPanel implements HistogramDisplay {


    @Override
    public void show(String title, String xAxis, String yAxis, double[] data, int bins) {
        JFreeChart histogram = ChartFactory.createHistogram(
                title,
                xAxis,
                yAxis,
                createDataSet(data, bins),
                PlotOrientation.VERTICAL,
                false,
                false,
                false
        );
        add(new ChartPanel(histogram));
    }

    private HistogramDataset createDataSet(double[] data, int bins) {
        HistogramDataset dataset = new HistogramDataset();

        if (data != null && data.length > 0){
            dataset.addSeries("s", data, bins);
        } else{
            System.out.println("Error: longitud de los datos 0/nulo");
        }
        return dataset;
    }
}
