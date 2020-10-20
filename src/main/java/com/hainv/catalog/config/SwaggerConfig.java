package com.hainv.catalog.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Configuration
@EnableSwagger2
@Profile("!prod")
public class SwaggerConfig {

    @Value("${spring.application.version}")
    private String version;

    @Bean
    public Docket api() {
        AuthorizationScope[] authScopes = new AuthorizationScope[0];
        SecurityReference securityReference = SecurityReference.builder()
                .reference("bearer_token")
                .scopes(authScopes)
                .build();

        List<SecurityContext> securityContexts = Collections.singletonList(
                SecurityContext.builder()
                        //.securityReferences(Collections.singletonList(securityReference))
                        .build());

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hainv.catalog.rest"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metadata())
                .useDefaultResponseMessages(false)
                //.securitySchemes(Collections.singletonList(securityScheme()))
                .securityContexts(securityContexts)
                .genericModelSubstitutes(Optional.class);

    }

    private ApiInfo metadata() {
        return new ApiInfoBuilder()
                .title("Backend Api Service")
                .description(
                        "Backend Service for Catalog System")
                .version(version)
                .build();
    }

    private SecurityScheme securityScheme() {
        return new ApiKey("bearer_token", "Authorization", "header");
    }

}
