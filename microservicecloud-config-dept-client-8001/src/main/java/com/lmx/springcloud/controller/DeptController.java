package com.lmx.springcloud.controller;

import com.lmx.springcloud.entities.Dept;
import com.lmx.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean addDept(@RequestBody Dept dept) {
        return deptService.addDept(dept);
    }

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return deptService.getById(id);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return deptService.list();
    }

    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object discovery() {
        List<String> list = client.getServices();
        System.out.println("***********" + list);
        List<ServiceInstance> serviceInstanceList = client.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance serviceInstance : serviceInstanceList) {
            System.out.println(serviceInstance.getServiceId() + "\t" + serviceInstance.getHost() + "\t" +
                    serviceInstance.getPort() + "\t" + serviceInstance.getUri());
        }
        return this.client;
    }
}
