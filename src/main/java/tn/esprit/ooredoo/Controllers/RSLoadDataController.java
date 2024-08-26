package tn.esprit.ooredoo.Controllers;

import org.springframework.core.io.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ooredoo.Services.RSLoadDataService;
import tn.esprit.ooredoo.DTO.RSLoadDataDTO;

import java.util.List;

@RestController
@RequestMapping("/api/excel")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class RSLoadDataController {

    @Autowired
    private RSLoadDataService rsLoadDataService;

    @PostMapping("/uploadData")
    public ResponseEntity<String> uploadData(@RequestBody List<RSLoadDataDTO> data) {
        try {
            if (data == null || data.isEmpty()) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No data provided.");
            }

            rsLoadDataService.uploadData(data);
            return ResponseEntity.ok("Data processed successfully");
        } catch (Exception e) {
            // Log the exception here if necessary
            // Example: log.error("Error processing data", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error processing data: " + e.getMessage());
        }
    }

    @GetMapping("/downloadXML")
    public ResponseEntity<Resource> downloadXML() {
        try {
            ResponseEntity<Resource> response = rsLoadDataService.getXMLData();
            if (response.getStatusCode() == HttpStatus.NO_CONTENT) {
                return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
            }

            // If you need to set custom headers for the response
            HttpHeaders headers = new HttpHeaders();
            headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=data.xml");

            return ResponseEntity.ok()
                    .headers(headers)
                    .body(response.getBody());
        } catch (Exception e) {
            // Log the exception here if necessary
            // Example: log.error("Error generating XML", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }
}
