package net.secondphase.lsicloud;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 *
 *
 */
@Slf4j
@SpringBootApplication
public class PropertiesExperimentApplication implements CommandLineRunner {

    @Autowired
    @Getter(AccessLevel.PRIVATE)
    private ExperimentalProperties properties;

    /**
     * Answer my logger
     * @return Logger
     */
    private static Logger getLogger() {
        return log;
    }


    /**
     * Answer an instance for the following arguments
     */
    public PropertiesExperimentApplication() {

        super();

    }

    /**
     * Main method
     * @param args String[]
     */
    public static void main(String[] args) {

        SpringApplication   tempApp;


        tempApp = new SpringApplication(PropertiesExperimentApplication.class);
        tempApp.run(args);


    }


    /**
     * Run me
     * @param anArgs String[]
     */
    @Override
    public void run(String[] anArgs) {

        getLogger().info("Dump of defined properties:");
        getLogger().info("url: " + this.getProperties().getUrl());
        getLogger().info("bootstrapServers: " + this.getProperties().getBootstrapServers());
        getLogger().info("Solr url: " + this.getProperties().getSolrUrl());


    }

}
