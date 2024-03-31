package gr.vasilakos.analysismicroservice.service;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StatsCalculator {


    public Double calculateMean(List<Double> numbers){
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

        DescriptiveStatistics statistics = new DescriptiveStatistics();
        numbers.forEach(statistics::addValue);

        return statistics.getMean();
    }

    public Double calculateMedian(List<Double> numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

        DescriptiveStatistics stats = new DescriptiveStatistics();
        numbers.forEach(stats::addValue);

        return stats.getPercentile(50);
    }

    public Double calculateRange(List<Double> numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

        DescriptiveStatistics stats = new DescriptiveStatistics();
        numbers.forEach(stats::addValue);

        return stats.getMax() - stats.getMin();
    }

    public Double calculateStandardDeviation(List<Double> numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

        DescriptiveStatistics stats = new DescriptiveStatistics();
        numbers.forEach(stats::addValue);

        return stats.getStandardDeviation();
    }


}

