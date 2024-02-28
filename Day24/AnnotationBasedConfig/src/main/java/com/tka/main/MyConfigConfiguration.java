package com.tka.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

import com.tka.entity.Country;
import com.tka.entity.Employee;


@ComponentScan(basePackages = {"com.tka"})
public class MyConfigConfiguration {

	
//		@Bean("emp")
//		@Scope(value = "prototype")
//		public Employee empObj() {
//			return (new Employee());
//		}
//	
//		@Bean("con")
//		public Country countryInstance() {
//			return (new Country() );
//		}
		
}
