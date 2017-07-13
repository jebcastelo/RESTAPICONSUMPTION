package com.lmig.RestConsumption;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication 
public class RestConsumptionApplication {
    Book book;

    private static final Logger log = LoggerFactory.getLogger(RestConsumptionApplication.class);

//    CODE for consuming rest API using rest template
//    public static void main(String args[]) {
//        SpringApplication.run(ConsumeApplication.class);
//    }
//
//    @Bean
//    public RestTemplate restTemplate(RestTemplateBuilder builder) {
//        return builder.build();
//    }

//
//    @Bean
//    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//        return args -> {
//             book = restTemplate.getForObject(
//                    "https://www.googleapis.com/books/v1/volumes?q=crochet", Book.class);
//            log.info(book.toString());
//        };
//    }
//    

//    Code for posting to REST API using rest template
//    Comment out main method for GET 
       public static void main(String[] args) {
           //POST METHOD
            MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
            Map map = new HashMap<String, String>();
            map.put("Content-Type", "application/json");

            headers.setAll(map);

            Map req_payload = new HashMap();
            req_payload.put("name", "Jeb");
            req_payload.put("name2", "Elizabeth");
            HttpEntity<?> request = new HttpEntity<>(req_payload, headers);
            String url = "http://jsonplaceholder.typicode.com/posts";

            ResponseEntity<?> response = new RestTemplate().postForEntity(url, request, String.class);
            System.out.println(response);
        }    
    
    
    }