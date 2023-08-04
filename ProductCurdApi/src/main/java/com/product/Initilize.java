package com.product;

import org.springframework.boot.builder.SpringApplicationBuilder;

public class Initilize {
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ProductCurdApiApplication.class);
	}

}
