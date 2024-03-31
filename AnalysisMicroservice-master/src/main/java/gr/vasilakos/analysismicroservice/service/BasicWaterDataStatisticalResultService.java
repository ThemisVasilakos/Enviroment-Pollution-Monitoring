package gr.vasilakos.analysismicroservice.service;

import gr.vasilakos.analysismicroservice.dto.WaterDataDto;
import gr.vasilakos.analysismicroservice.dto.BasicWaterDataStatisticalResultDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasicWaterDataStatisticalResultService {

    private final StatsCalculator statsCalculator;

    public BasicWaterDataStatisticalResultService(StatsCalculator statsCalculator) {
        this.statsCalculator = statsCalculator;
    }

    public BasicWaterDataStatisticalResultDto calculateBasicWaterStats(List<WaterDataDto> waterDataDtoList){
        BasicWaterDataStatisticalResultDto dataStatisticalResultDto = new BasicWaterDataStatisticalResultDto();

        List<Double> waterDissolvedOxygenList = new ArrayList<>();
        List<Double> waterOxidationReductionPotentialList = new ArrayList<>();
        List<Double> waterPHList = new ArrayList<>();
        List<Double> waterTurbidityList = new ArrayList<>();
        List<Double> waterTotalDissolvedSolidsList = new ArrayList<>();
        List<Double> waterTemperatureList = new ArrayList<>();

        for (WaterDataDto waterData: waterDataDtoList){
            waterDissolvedOxygenList.add(waterData.getDissolvedOxygen());
            waterOxidationReductionPotentialList.add(waterData.getOxidationReductionPotential());
            waterPHList.add(waterData.getPH());
            waterTurbidityList.add(waterData.getTurbidity());
            waterTotalDissolvedSolidsList.add(waterData.getTotalDissolvedSolids());
            waterTemperatureList.add(waterData.getTemperature());
        }

        //Set mean value
        dataStatisticalResultDto.setDissolvedOxygenMean(statsCalculator.calculateMean(waterDissolvedOxygenList));
        dataStatisticalResultDto.setOxidationReductionPotentialMean(statsCalculator.calculateMean(waterOxidationReductionPotentialList));
        dataStatisticalResultDto.setPHMean(statsCalculator.calculateMean(waterPHList));
        dataStatisticalResultDto.setTurbidityMean(statsCalculator.calculateMean(waterTurbidityList));
        dataStatisticalResultDto.setTotalDissolvedSolidsMean(statsCalculator.calculateMean(waterTotalDissolvedSolidsList));
        dataStatisticalResultDto.setTemperatureMean(statsCalculator.calculateMean(waterTemperatureList));

        //Set median value
        dataStatisticalResultDto.setDissolvedOxygenMedian(statsCalculator.calculateMedian(waterDissolvedOxygenList));
        dataStatisticalResultDto.setOxidationReductionPotentialMedian(statsCalculator.calculateMedian(waterOxidationReductionPotentialList));
        dataStatisticalResultDto.setPHMedian(statsCalculator.calculateMedian(waterPHList));
        dataStatisticalResultDto.setTurbidityMedian(statsCalculator.calculateMedian(waterTurbidityList));
        dataStatisticalResultDto.setTotalDissolvedSolidsMedian(statsCalculator.calculateMedian(waterTotalDissolvedSolidsList));
        dataStatisticalResultDto.setTemperatureMedian(statsCalculator.calculateMedian(waterTemperatureList));

        //Set Range value
        dataStatisticalResultDto.setDissolvedOxygenRange(statsCalculator.calculateRange(waterDissolvedOxygenList));
        dataStatisticalResultDto.setOxidationReductionPotentialRange(statsCalculator.calculateRange(waterOxidationReductionPotentialList));
        dataStatisticalResultDto.setPHRange(statsCalculator.calculateRange(waterPHList));
        dataStatisticalResultDto.setTurbidityRange(statsCalculator.calculateRange(waterTurbidityList));
        dataStatisticalResultDto.setTotalDissolvedSolidsRange(statsCalculator.calculateRange(waterTotalDissolvedSolidsList));
        dataStatisticalResultDto.setTemperatureRange(statsCalculator.calculateRange(waterTemperatureList));

        //Set StandardDeviation value
        dataStatisticalResultDto.setDissolvedOxygenDeviation(statsCalculator.calculateStandardDeviation(waterDissolvedOxygenList));
        dataStatisticalResultDto.setOxidationReductionPotentialDeviation(statsCalculator.calculateStandardDeviation(waterOxidationReductionPotentialList));
        dataStatisticalResultDto.setPHDeviation(statsCalculator.calculateStandardDeviation(waterPHList));
        dataStatisticalResultDto.setTurbidityDeviation(statsCalculator.calculateStandardDeviation(waterTurbidityList));
        dataStatisticalResultDto.setTotalDissolvedSolidsDeviation(statsCalculator.calculateStandardDeviation(waterTotalDissolvedSolidsList));
        dataStatisticalResultDto.setTemperatureDeviation(statsCalculator.calculateStandardDeviation(waterTemperatureList));

        return  dataStatisticalResultDto;
    }

}
