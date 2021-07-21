package digital.innovation.one.apiRestSpringBootSoda.config;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import org.springframework.context.annotation.Bean;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.RequestHandlerSelectors.*;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableSwagger2
public class SodaConfig {

    private static final String BASE_PACKAGE = "digital.innovation.one.apiRestSpringBootSoda.controllerrf";
    private static final String API_TITLE = "Soda Stock API";
    private static final String API_DESCRIPTION = "REST API for soda stock management";
    private static final String CONTACT_NAME = "Tiago Rodrigues";
    private static final String CONTACT_GITHUB = "https://gtihub.com/tiagorfdesouza";
    private static final String CONTACT_EMAIL = "vouacertar@gmail.com";

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(basePackage(BASE_PACKAGE))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(buildApiInfo());
    }

    private ApiInfo buildApiInfo() {
        return new ApiInfoBuilder()
                .title(API_TITLE)
                .description(API_DESCRIPTION)
                .version("1.0.0")
                .contact(new Contact(CONTACT_NAME, CONTACT_GITHUB, CONTACT_EMAIL))
                .build();
    }
}

