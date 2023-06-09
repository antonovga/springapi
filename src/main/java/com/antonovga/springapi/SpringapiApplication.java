package com.antonovga.springapi;

import com.antonovga.springapi.models.Post;
import com.antonovga.springapi.repos.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringapiApplication {

    @Autowired
    private PostRepo postRepo;

    public static void main(String[] args) {
        SpringApplication.run(SpringapiApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            for (int i=0; i<100; i++){
                postRepo.save(new Post("title_#{i}", "content_#{i}"));
            }
        };
    }
}
