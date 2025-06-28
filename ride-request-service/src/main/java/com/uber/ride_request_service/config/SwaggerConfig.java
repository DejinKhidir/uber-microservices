package com.uber.ride_request_service.config;


import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI rideRequestOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Ride Request Service API")
                        .description("API documentation for the Ride Request microservice")
                        .version("1.0.0"));
    }
}
