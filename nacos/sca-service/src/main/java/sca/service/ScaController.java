package sca.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import sca.api.ApiRes;
import sca.api.ScaControllerApi;

@RestController
public class ScaController implements ScaControllerApi {
    @Value("${server.port}")
    private String port;

    @Override
    public ApiRes<String> hello(String message) {
        return ApiRes.ok("sca-service-" + port + ": " + message);
    }

    @Override
    public ApiRes<String> circuit() {
        if (Math.random() > 0.2) {
            throw new RuntimeException("circuit exception!");
        }
        return ApiRes.ok("circuit");
    }
}
