package com.bdg.kruger.stocksapplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.any;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket StockApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(any())
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo(){

        ApiInfo apiInfo = new ApiInfo(
                "Stock API",
                "Spring Boot Swagger Stock Api For PayConiq",
                "1.0",
                "",
                new Contact("Brandt Kruger", "", "brandt.kruger087@gmail.com"),
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0"
        );

        return apiInfo;
    }

}
