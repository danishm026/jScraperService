package com.arc.jScraperService.controllers;

import com.arc.jScraperDao.dao.hsqldb.applicationDao.JdbcTemplateModelDao;

import com.arc.jScraperService.models.Model;
import lombok.RequiredArgsConstructor;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor = @__({@Autowired}))
public class ModelController {
    private final JdbcTemplateModelDao modelDao;
    private final DozerBeanMapper mapper;

    @RequestMapping(value = "/models/{modelID}", method = RequestMethod.GET)
    public Model getModelByID(@PathVariable String modelID) {
        return mapper.map(modelDao.load(modelID), Model.class);
    }
}
