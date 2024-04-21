package com.home.boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Tiles configuration.
 */
@Configuration
public class ConfigurationForTiles {

	@Bean
    public InternalResourceViewResolver jspViewResolver() {
    	final InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
    	viewResolver.setOrder(10);
    	viewResolver.setViewClass(JstlView.class);
    	viewResolver.setPrefix("/WEB-INF/jsp/");
    	viewResolver.setSuffix("");
    	viewResolver.setViewNames("*.jsp");
    	return viewResolver;
    }
}
