package gr.vasilakos.analysismicroservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BasicSoilDataStatisticalResultDto {

    private Double soilTemperatureMean;
    private Double soilTemperatureMedian;
    private Double soilTemperatureRange;
    private Double soilTemperatureDeviation;

    private Double soilMoistureMean;
    private Double soilMoistureMedian;
    private Double soilMoistureRange;
    private Double soilMoistureDeviation;

    private Double electronicConductivityMean;
    private Double electronicConductivityMedian;
    private Double electronicConductivityRange;
    private Double electronicConductivityDeviation;

    private Double volumetricWaterContentMean;
    private Double volumetricWaterContentMedian;
    private Double volumetricWaterContentRange;
    private Double volumetricWaterContentDeviation;

    private Double salinityMean;
    private Double salinityMedian;
    private Double salinityRange;
    private Double salinityDeviation;

    private Double totalSuspendedSolidsMean;
    private Double totalSuspendedSolidsMedian;
    private Double totalSuspendedSolidsRange;
    private Double totalSuspendedSolidsDeviation;

    private Double flowVolumeMean;
    private Double flowVolumeMedian;
    private Double flowVolumeRange;
    private Double flowVolumeDeviation;

    private Double nitrateMean;
    private Double nitrateMedian;
    private Double nitrateRange;
    private Double nitrateDeviation;

}
