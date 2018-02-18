package com.batch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = { "com.*" })
@PropertySource(value = "${externalapp}")
public class springConfigurer {

	@Autowired
	private Environment env;
	//1.2.3.4
	private String mongodbUrl;//=env.getProperty("mongodb.url");

	//hello
	private String defaultDb;//=env.getProperty("mongodb.db");
	public springConfigurer(){
		System.out.print("springConfigurer-------------------------");
		this.mongodbUrl=env.getProperty("mongodb.url");
	}
	public String getMongodbUrl() {
		return mongodbUrl;
	}

	public void setMongodbUrl(String mongodbUrl) {
		this.mongodbUrl = mongodbUrl;
	}

	public String getDefaultDb() {
		return defaultDb;
	}

	public void setDefaultDb(String defaultDb) {
		this.defaultDb = defaultDb;
	}
	
	
	
}
