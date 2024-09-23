package ca.gbc.productservice1;

import org.springframework.boot.SpringApplication;

public class TestProductService1Application {

	public static void main(String[] args) {
		SpringApplication.from(ProductService1Application::main).with(TestcontainersConfiguration.class).run(args);
	}

}
