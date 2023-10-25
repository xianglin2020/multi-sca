package sca.service;

import org.springframework.web.bind.annotation.RestController;
import sca.api.ApiRes;
import sca.api.ScaControllerApi;

@RestController
public class ScaController implements ScaControllerApi {
    @Override
    public ApiRes<String> hello(String message) {
        return ApiRes.ok("sca-service: " + message);
    }
}
