package gr.vasilakos.analysismicroservice.controller;

import gr.vasilakos.analysismicroservice.dto.BasicWaterDataStatisticalResultDto;
import gr.vasilakos.analysismicroservice.dto.WaterDataDto;
import gr.vasilakos.analysismicroservice.service.BasicWaterDataStatisticalResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/analytics")
@RequiredArgsConstructor
public class BasicWaterDataStatisticalResultController {

    private final BasicWaterDataStatisticalResultService dataStatisticalResultService;

    @PostMapping("/basic-water")
    public ResponseEntity<BasicWaterDataStatisticalResultDto> calculateBasicStatistics(@RequestBody List<WaterDataDto> waterDataDtoList){

        return new ResponseEntity<>(dataStatisticalResultService.calculateBasicWaterStats(waterDataDtoList), HttpStatus.OK);
    }


}
