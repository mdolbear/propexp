package net.secondphase.lsicloud;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "app")
public class ExperimentalProperties {

    private String applicationName;
    private String bootstrapServers;
    private String url;
    private String solrUrl;
    private boolean solrWaitFlush;
    private boolean solrWaitSearcher;
    private boolean solrSoftCommit;


}
