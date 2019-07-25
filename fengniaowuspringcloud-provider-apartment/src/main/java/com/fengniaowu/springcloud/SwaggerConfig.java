package com.fengniaowu.springcloud;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.ApiOperation;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//請求地址：http://ip:port/swagger-ui.html

@Configuration        //让Spring来加载该类配置
@EnableSwagger2        //启用Swagger2
public class SwaggerConfig {
	   @Bean
	    public Docket createRestApi() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .apiInfo(apiInfo()).select()
	                //扫描指定包中的swagger注解
	                .apis(RequestHandlerSelectors.basePackage("com.fengniaowu.springcloud"))
	                //扫描所有有注解的api，用这种方式更灵活
	                //.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
	                .paths(PathSelectors.any())
	                .build();
	    }

	    private ApiInfo apiInfo() {
	        return new ApiInfoBuilder()
	                .title("FengniaowuSpringCloud-Apartment")
	                .description("对公寓信息的操作")
	                .termsOfServiceUrl("http://127.0.0.1:8002/")
	                .version("1.0.0")
	                .build();
	    }
}
