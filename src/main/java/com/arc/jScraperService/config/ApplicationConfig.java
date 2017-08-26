package com.arc.jScraperService.config;

import com.arc.jScraperDao.config.DataAccessConfig;
import com.arc.jScraperService.mappings.DozerBeanMappings;
import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.arc.jScraperService"})
@Import(DataAccessConfig.class)
public class ApplicationConfig {
    @Bean
    public ViewResolver resourceBundleViewResolver() {
        ResourceBundleViewResolver resourceBundleViewResolver = new ResourceBundleViewResolver();
        resourceBundleViewResolver.setBasename("views");
        return resourceBundleViewResolver;
    }

    @Bean
    public DozerBeanMapper mapper() {
        DozerBeanMapper mapper = new DozerBeanMapper();
        mapper.addMapping(new DozerBeanMappings());
        return mapper;
    }
}
