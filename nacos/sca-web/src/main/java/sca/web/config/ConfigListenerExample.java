package sca.web.config;

import com.alibaba.cloud.nacos.NacosConfigManager;
import com.alibaba.nacos.api.config.listener.Listener;
import com.alibaba.nacos.api.exception.NacosException;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@Component
public class ConfigListenerExample {
    private final Logger logger = LoggerFactory.getLogger(ConfigListenerExample.class);
    @Resource
    private NacosConfigManager nacosConfigManager;
    String DATA_ID = "sca-web-config.properties";
    String GROUP = "DEFAULT_GROUP";

    @PostConstruct
    public void init() throws NacosException {

        nacosConfigManager.getConfigService().addListener(DATA_ID, GROUP, new Listener() {
            @Override
            public Executor getExecutor() {
                return Executors.newSingleThreadExecutor();
            }

            @Override
            public void receiveConfigInfo(String configInfo) {
                logger.info("[dataId]:[" + DATA_ID + "],Configuration changed to:"
                        + configInfo);
            }
        });
    }
}
