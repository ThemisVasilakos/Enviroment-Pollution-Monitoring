package gr.vasilakos.analysismicroservice.controller;

import gr.vasilakos.analysismicroservice.dto.BasicSoilDataStatisticalResultDto;
import gr.vasilakos.analysismicroservice.dto.SoilDataDto;
import gr.vasilakos.analysismicroservice.service.BasicSoilDataStatisticalResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/analytics")
@RequiredArgsConstructor
public class BasicSoilDataStatisticalResultController {

    private final BasicSoilDataStatisticalResultService dataStatisticalResultService;

    @PostMapping("/basic-soil")
    public ResponseEntity<BasicSoilDataStatisticalResultDto> calculateBasicStatistics(@RequestBody List<SoilDataDto> soilDataDtoList){

        return new ResponseEntity<>(dataStatisticalResultService.calculateBasicSoilStats(soilDataDtoList), HttpStatus.OK);
    }


}
