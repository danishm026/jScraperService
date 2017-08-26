package com.arc.jScraperService.mappings;

import org.dozer.loader.api.BeanMappingBuilder;

public class DozerBeanMappings extends BeanMappingBuilder {
    @Override
    protected void configure() {
        mapping(com.arc.jScraperService.models.Model.class, com.arc.jScraperDao.dto.application.Model.class);
    }
}
