package sca.web;

import org.springframework.cloud.openfeign.FeignClient;
import sca.api.ScaControllerApi;

@FeignClient(name = "sca-service")
public interface ScaService extends ScaControllerApi {
}
