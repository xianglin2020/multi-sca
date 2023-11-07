package sca.web.sentinel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sca.web.ScaService;

@RestController
public class SentinelController {
    private final ScaService scaService;

    public SentinelController(ScaService scaService) {
        this.scaService = scaService;
    }

    @GetMapping("/sentinel/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/sentinel/circuit")
    public String circuit() {
        return scaService.circuit().getData();
    }
}
