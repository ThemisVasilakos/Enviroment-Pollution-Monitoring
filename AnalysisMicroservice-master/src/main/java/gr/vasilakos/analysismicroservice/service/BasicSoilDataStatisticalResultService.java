package gr.vasilakos.analysismicroservice.service;

import gr.vasilakos.analysismicroservice.dto.BasicSoilDataStatisticalResultDto;
import gr.vasilakos.analysismicroservice.dto.SoilDataDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasicSoilDataStatisticalResultService {

    private final StatsCalculator statsCalculator;

    public BasicSoilDataStatisticalResultService(StatsCalculator statsCalculator) {
        this.statsCalculator = statsCalculator;
    }

    public BasicSoilDataStatisticalResultDto calculateBasicSoilStats(List<SoilDataDto> soilDataDtoList){
        BasicSoilDataStatisticalResultDto dataStatisticalResultDto = new BasicSoilDataStatisticalResultDto();

        List<Double> soilTemperatureList = new ArrayList<>();
        List<Double> moistureList = new ArrayList<>();
        List<Double> electronicConductivityList = new ArrayList<>();
        List<Double> salinityList = new ArrayList<>();
        List<Double> totalSuspendedSolidsList = new ArrayList<>();
        List<Double> flowVolumeList = new ArrayList<>();
        List<Double> nitrateList = new ArrayList<>();
        List<Double> volumetricWaterContentList = new ArrayList<>();

        for (SoilDataDto soilData: soilDataDtoList){
            soilTemperatureList.add(soilData.getSoilTemperature());
            moistureList.add(soilData.getSoilMoisture());
            electronicConductivityList.add(soilData.getElectronicConductivity());
            salinityList.add(soilData.getSalinity());
            totalSuspendedSolidsList.add(soilData.getTotalSuspendedSolids());
            flowVolumeList.add(soilData.getFlowVolume());
            nitrateList.add(soilData.getNitrate());
            volumetricWaterContentList.add(soilData.getVolumetricWaterContent());
        }

        //Set mean value
        dataStatisticalResultDto.setSoilTemperatureMean(statsCalculator.calculateMean(soilTemperatureList));
        dataStatisticalResultDto.setSoilMoistureMean(statsCalculator.calculateMean(moistureList));
        dataStatisticalResultDto.setElectronicConductivityMean(statsCalculator.calculateMean(electronicConductivityList));
        dataStatisticalResultDto.setSalinityMean(statsCalculator.calculateMean(salinityList));
        dataStatisticalResultDto.setTotalSuspendedSolidsMean(statsCalculator.calculateMean(totalSuspendedSolidsList));
        dataStatisticalResultDto.setFlowVolumeMean(statsCalculator.calculateMean(flowVolumeList));
        dataStatisticalResultDto.setNitrateMean(statsCalculator.calculateMean(nitrateList));
        dataStatisticalResultDto.setVolumetricWaterContentMean(statsCalculator.calculateMean(volumetricWaterContentList));

        //Set median value
        dataStatisticalResultDto.setSoilTemperatureMedian(statsCalculator.calculateMedian(soilTemperatureList));
        dataStatisticalResultDto.setSoilMoistureMedian(statsCalculator.calculateMedian(moistureList));
        dataStatisticalResultDto.setElectronicConductivityMedian(statsCalculator.calculateMedian(electronicConductivityList));
        dataStatisticalResultDto.setSalinityMedian(statsCalculator.calculateMedian(salinityList));
        dataStatisticalResultDto.setTotalSuspendedSolidsMedian(statsCalculator.calculateMedian(totalSuspendedSolidsList));
        dataStatisticalResultDto.setFlowVolumeMedian(statsCalculator.calculateMedian(flowVolumeList));
        dataStatisticalResultDto.setNitrateMedian(statsCalculator.calculateMedian(nitrateList));
        dataStatisticalResultDto.setVolumetricWaterContentMedian(statsCalculator.calculateMean(volumetricWaterContentList));

        //Set Range value
        dataStatisticalResultDto.setSoilTemperatureRange(statsCalculator.calculateRange(soilTemperatureList));
        dataStatisticalResultDto.setSoilMoistureRange(statsCalculator.calculateRange(moistureList));
        dataStatisticalResultDto.setElectronicConductivityRange(statsCalculator.calculateRange(electronicConductivityList));
        dataStatisticalResultDto.setSalinityRange(statsCalculator.calculateRange(salinityList));
        dataStatisticalResultDto.setTotalSuspendedSolidsRange(statsCalculator.calculateRange(totalSuspendedSolidsList));
        dataStatisticalResultDto.setFlowVolumeRange(statsCalculator.calculateRange(flowVolumeList));
        dataStatisticalResultDto.setNitrateRange(statsCalculator.calculateRange(nitrateList));
        dataStatisticalResultDto.setVolumetricWaterContentRange(statsCalculator.calculateMean(volumetricWaterContentList));

        //Set StandardDeviation value
        dataStatisticalResultDto.setSoilTemperatureDeviation(statsCalculator.calculateStandardDeviation(soilTemperatureList));
        dataStatisticalResultDto.setSoilMoistureDeviation(statsCalculator.calculateStandardDeviation(moistureList));
        dataStatisticalResultDto.setElectronicConductivityDeviation(statsCalculator.calculateStandardDeviation(electronicConductivityList));
        dataStatisticalResultDto.setSalinityDeviation(statsCalculator.calculateStandardDeviation(salinityList));
        dataStatisticalResultDto.setTotalSuspendedSolidsDeviation(statsCalculator.calculateStandardDeviation(totalSuspendedSolidsList));
        dataStatisticalResultDto.setFlowVolumeDeviation(statsCalculator.calculateStandardDeviation(flowVolumeList));
        dataStatisticalResultDto.setNitrateDeviation(statsCalculator.calculateStandardDeviation(nitrateList));
        dataStatisticalResultDto.setVolumetricWaterContentDeviation(statsCalculator.calculateMean(volumetricWaterContentList));

        return  dataStatisticalResultDto;
    }

}
