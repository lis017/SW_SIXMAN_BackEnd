package com.sixthMan.smartFarm.Arduino;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Arduino")
public class ArduinoController {
    @PostMapping
    public ResponseEntity<String> receiveSensorData(@RequestBody ArduinoDTO data) {

        //이걸로 받은 데이터 저장이든 처리든 추후 처리예정.
        //data.getAirHumidity()
        //data.getSoilHumidity()
        //data.getTemperature()
        //data.getWaterBottle()

        // TODO: DB 저장 등 추가 로직 가능

        return ResponseEntity.ok("Data received!");
    }
}
