package com.lmx.springcloud.controller;

import com.lmx.springcloud.entities.Dept;
import com.lmx.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController_Consumer {
    @Autowired
    private DeptClientService service;

    @RequestMapping(value = "/consumer/dept/add", method = RequestMethod.POST)
    public boolean addDept(@RequestBody Dept dept) {
        return service.addDept(dept);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return service.list();
    }
}
