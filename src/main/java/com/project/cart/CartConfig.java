package com.project.cart;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class CartConfig 
{
	@Bean
	public Docket postsApi2() 
	{
		return new Docket(DocumentationType.SWAGGER_2).groupName("Cart").apiInfo(apiInfo2()).select()
				.paths(regex("/cart.*")).build();
	}

	private ApiInfo apiInfo2() 
	{
		return new ApiInfoBuilder().title("Cart Service")
				.description("Sample Documentation Generated Using SWAGGER2 for our Cart Rest API")
				.version("1.0").build();
	}
}
