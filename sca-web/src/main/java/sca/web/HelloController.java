package sca.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sca.api.ApiRes;

import java.util.Map;

@RestController
public class HelloController {
    private final ScaService scaService;

    public HelloController(ScaService scaService) {
        this.scaService = scaService;
    }

    @GetMapping("/hello/{message}")
    ApiRes<Map<String, String>> hello(@PathVariable String message) {
        var res = scaService.hello(message);
        return ApiRes.ok(Map.of("from", "sca-service", "result", res.getData()));
    }
}
