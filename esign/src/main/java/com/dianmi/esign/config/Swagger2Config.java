package com.dianmi.esign.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author www
 * @date 2017/7/16
 * http://localhost:8090/swagger-ui.html
 */

@Configuration
@EnableSwagger2
@ComponentScan(basePackages = {"com.dianmi.esign.controller"})
public class Swagger2Config {

    @Value("${project.version}")
    private String projectVersion;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.dianmi.esign.controller"))
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(getPars());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("ssm项目构建工具")
                .description("ssm项目快速构建REST api工具")
                .termsOfServiceUrl("www.dianmi.com")
                .version("版本:" +projectVersion+ "\n发布时间:" + new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒").format(new Date()))
                .build();
    }

    private List<Parameter> getPars() {
        ParameterBuilder tokenPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<>();
        tokenPar.name("Authorization").description("令牌").modelRef(new ModelRef("string")).parameterType("header").required(false).build();
        pars.add(tokenPar.build());
        return pars;
    }
}
