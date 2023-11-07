package sca.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ScaControllerApi {
    @GetMapping("/hello/{message}")
    ApiRes<String> hello(@PathVariable String message);

    @GetMapping("/circuit")
    ApiRes<String> circuit();
}