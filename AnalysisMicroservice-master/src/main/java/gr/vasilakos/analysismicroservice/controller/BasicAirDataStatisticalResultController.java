package gr.vasilakos.analysismicroservice.controller;

import gr.vasilakos.analysismicroservice.dto.AirDataDto;
import gr.vasilakos.analysismicroservice.dto.BasicAirDataStatisticalResultDto;
import gr.vasilakos.analysismicroservice.service.BasicAirDataStatisticalResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/analytics")
@RequiredArgsConstructor
public class BasicAirDataStatisticalResultController {

    private final BasicAirDataStatisticalResultService dataStatisticalResultService;

    @PostMapping("/basic-air")
    public ResponseEntity<BasicAirDataStatisticalResultDto> calculateBasicStatistics(@RequestBody List<AirDataDto> airDataDtoList){

        return new ResponseEntity<>(dataStatisticalResultService.calculateBasicAirStats(airDataDtoList), HttpStatus.OK);
    }

}
