package com.sixthMan.smartFarm.Arduino;

import com.sixthMan.smartFarm.Arduino.ArduinoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@RestController
@RequestMapping("/smartFarm") // 상위 경로 통일
public class ArduinoController {

    private static final String SAVE_PATH = "src/main/resources/static/image/"; // 상대 경로 (프로젝트 디렉토리 내 images 폴더)

    // 센서 데이터 수신
    @PostMapping("/Arduino")
    public ResponseEntity<String> receiveSensorData(@RequestBody ArduinoDTO data) {

        // TODO: 데이터 처리 로직 (예: DB 저장 등)
        // data.getAirHumidity()
        // data.getSoilHumidity()
        // data.getTemperature()
        // data.getWaterBottle()

        return ResponseEntity.ok("Sensor data received!");
    }

    // 이미지 업로드
    @PostMapping("/image")
    public ResponseEntity<Void> uploadImage(@RequestParam("file") MultipartFile file) throws IOException {
        File dir = new File(SAVE_PATH);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        String filename = UUID.randomUUID() + "_" + file.getOriginalFilename();
        Path filepath = Paths.get(SAVE_PATH, filename);

        Files.write(filepath, file.getBytes());

        return ResponseEntity.ok().build();
    }
}