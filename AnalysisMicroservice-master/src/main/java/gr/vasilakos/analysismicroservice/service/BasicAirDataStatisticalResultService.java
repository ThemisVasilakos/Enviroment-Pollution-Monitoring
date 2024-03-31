package gr.vasilakos.analysismicroservice.service;

import gr.vasilakos.analysismicroservice.dto.AirDataDto;
import gr.vasilakos.analysismicroservice.dto.BasicAirDataStatisticalResultDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasicAirDataStatisticalResultService {

    private final StatsCalculator statsCalculator;

    public BasicAirDataStatisticalResultService(StatsCalculator statsCalculator) {
        this.statsCalculator = statsCalculator;
    }

    public BasicAirDataStatisticalResultDto calculateBasicAirStats(List<AirDataDto> airDataDtoList){
        BasicAirDataStatisticalResultDto dataStatisticalResultDto = new BasicAirDataStatisticalResultDto();

        List<Double> airTemperatureList = new ArrayList<>();
        List<Double> airHumidityList = new ArrayList<>();
        List<Double> airC02List = new ArrayList<>();
        List<Double> airVOCsList = new ArrayList<>();
        List<Double> airPM25List = new ArrayList<>();
        List<Double> airC0List = new ArrayList<>();

        for (AirDataDto airData: airDataDtoList){
            airTemperatureList.add(airData.getAirTemperature());
            airHumidityList.add(airData.getAirHumidity());
            airC02List.add(airData.getAirC02());
            airVOCsList.add(airData.getAirVOCs());
            airPM25List.add(airData.getAirPM25());
            airC0List.add(airData.getAirC0());
        }

        //Set mean value
        dataStatisticalResultDto.setAirTemperatureMean(statsCalculator.calculateMean(airTemperatureList));
        dataStatisticalResultDto.setAirHumidityMean(statsCalculator.calculateMean(airHumidityList));
        dataStatisticalResultDto.setAirC02Mean(statsCalculator.calculateMean(airC02List));
        dataStatisticalResultDto.setAirVOCsMean(statsCalculator.calculateMean(airVOCsList));
        dataStatisticalResultDto.setAirPM25Mean(statsCalculator.calculateMean(airPM25List));
        dataStatisticalResultDto.setAirC0Mean(statsCalculator.calculateMean(airC0List));

        //Set median value
        dataStatisticalResultDto.setAirTemperatureMedian(statsCalculator.calculateMedian(airTemperatureList));
        dataStatisticalResultDto.setAirHumidityMedian(statsCalculator.calculateMedian(airHumidityList));
        dataStatisticalResultDto.setAirC02Median(statsCalculator.calculateMedian(airC02List));
        dataStatisticalResultDto.setAirVOCsMedian(statsCalculator.calculateMedian(airVOCsList));
        dataStatisticalResultDto.setAirPM25Median(statsCalculator.calculateMedian(airPM25List));
        dataStatisticalResultDto.setAirC0Median(statsCalculator.calculateMedian(airC0List));

        //Set Range value
        dataStatisticalResultDto.setAirTemperatureRange(statsCalculator.calculateRange(airTemperatureList));
        dataStatisticalResultDto.setAirHumidityRange(statsCalculator.calculateRange(airHumidityList));
        dataStatisticalResultDto.setAirC02Range(statsCalculator.calculateRange(airC02List));
        dataStatisticalResultDto.setAirVOCsRange(statsCalculator.calculateRange(airVOCsList));
        dataStatisticalResultDto.setAirPM25Range(statsCalculator.calculateRange(airPM25List));
        dataStatisticalResultDto.setAirC0Range(statsCalculator.calculateRange(airC0List));

        //Set StandardDeviation value
        dataStatisticalResultDto.setAirTemperatureStandardDeviation(statsCalculator.calculateStandardDeviation(airTemperatureList));
        dataStatisticalResultDto.setAirHumidityStandardDeviation(statsCalculator.calculateStandardDeviation(airHumidityList));
        dataStatisticalResultDto.setAirC02StandardDeviation(statsCalculator.calculateStandardDeviation(airC02List));
        dataStatisticalResultDto.setAirVOCsStandardDeviation(statsCalculator.calculateStandardDeviation(airVOCsList));
        dataStatisticalResultDto.setAirPM25StandardDeviation(statsCalculator.calculateStandardDeviation(airPM25List));
        dataStatisticalResultDto.setAirC0StandardDeviation(statsCalculator.calculateStandardDeviation(airC0List));

        return  dataStatisticalResultDto;
    }

}
