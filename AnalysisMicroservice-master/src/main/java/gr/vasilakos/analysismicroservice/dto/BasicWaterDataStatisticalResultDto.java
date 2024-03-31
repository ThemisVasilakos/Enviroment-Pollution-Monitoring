package gr.vasilakos.analysismicroservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BasicWaterDataStatisticalResultDto {

    private Double dissolvedOxygenMean;
    private Double dissolvedOxygenMedian;
    private Double dissolvedOxygenRange;
    private Double dissolvedOxygenDeviation;

    private Double oxidationReductionPotentialMean;
    private Double oxidationReductionPotentialMedian;
    private Double oxidationReductionPotentialRange;
    private Double oxidationReductionPotentialDeviation;

    private Double pHMean;
    private Double pHMedian;
    private Double pHRange;
    private Double pHDeviation;

    private Double turbidityMean;
    private Double turbidityMedian;
    private Double turbidityRange;
    private Double turbidityDeviation;

    private Double totalDissolvedSolidsMean;
    private Double totalDissolvedSolidsMedian;
    private Double totalDissolvedSolidsRange;
    private Double totalDissolvedSolidsDeviation;

    private Double temperatureMean;
    private Double temperatureMedian;
    private Double temperatureRange;
    private Double temperatureDeviation;



}
