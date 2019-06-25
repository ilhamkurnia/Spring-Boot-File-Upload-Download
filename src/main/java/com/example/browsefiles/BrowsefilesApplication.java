package com.example.browsefiles;

import com.example.browsefiles.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class BrowsefilesApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrowsefilesApplication.class, args);
    }

}
