package sca.web.config;

import com.alibaba.cloud.nacos.NacosConfigManager;
import com.alibaba.cloud.nacos.NacosServiceManager;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.exception.NacosException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sca.api.ApiRes;

import java.util.Map;

@RefreshScope
@RestController
public class NacosConfigController {
    @Value("${sca.web.config.key1}")
    private String key1;
    @Value("${sca.web.config.key2}")
    private String key2;

    private final ConfigBean configBean;

    private final ConfigService configService;
    String DATA_ID = "sca-web-config.properties";
    String GROUP = "DEFAULT_GROUP";

    public NacosConfigController(ConfigBean configBean, NacosConfigManager nacosConfigManager) {
        this.configBean = configBean;
        this.configService = nacosConfigManager.getConfigService();
    }

    @GetMapping("/configService")
    public ApiRes<String> configService() throws NacosException {
        return ApiRes.ok(configService.getConfig(DATA_ID, GROUP, 2000));
    }

    @GetMapping("/config")
    public ApiRes<Map<String, String>> config() {
        return ApiRes.ok(Map.of("key1", key1, "key2", key2));
    }

    @GetMapping("/configBean")
    public ApiRes<ConfigBean> configBean() {
        return ApiRes.ok(configBean);
    }
}
