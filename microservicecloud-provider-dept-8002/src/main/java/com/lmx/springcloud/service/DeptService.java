package com.lmx.springcloud.service;

import com.lmx.springcloud.entities.Dept;

import java.util.List;

public interface DeptService {
    boolean addDept(Dept dept);

    Dept getById(Long id);

    List<Dept> list();
}
