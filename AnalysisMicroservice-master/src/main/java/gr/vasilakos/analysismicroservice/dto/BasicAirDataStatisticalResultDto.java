package gr.vasilakos.analysismicroservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BasicAirDataStatisticalResultDto {

    private Double airTemperatureMean;
    private Double airTemperatureMedian;
    private Double airTemperatureRange;
    private Double airTemperatureStandardDeviation;

    private Double airHumidityMean;
    private Double airHumidityMedian;
    private Double airHumidityRange;
    private Double airHumidityStandardDeviation;

    private Double airC02Mean;
    private Double airC02Median;
    private Double airC02Range;
    private Double airC02StandardDeviation;

    private Double airVOCsMean;
    private Double airVOCsMedian;
    private Double airVOCsRange;
    private Double airVOCsStandardDeviation;

    private Double airPM25Mean;
    private Double airPM25Median;
    private Double airPM25Range;
    private Double airPM25StandardDeviation;

    private Double airC0Mean;
    private Double airC0Median;
    private Double airC0Range;
    private Double airC0StandardDeviation;

}
