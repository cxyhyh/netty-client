package com.cloud.springcloudclient.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.springcloudclient.entity.Department;
import com.cloud.springcloudclient.mapper.DepartMapper;
import com.cloud.springcloudclient.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @Author hanyuhao
 * @PackageName com.cloud.springcloudclient.service.impl
 * @Class DepartServiceImpl
 * @Date 2021/8/5 9:25
 */
@Service
public class DepartServiceImpl extends ServiceImpl<DepartMapper, Department> implements DepartService {

    @Autowired
    private DepartService departService;

    @Autowired
    private DepartMapper departMapper;

    @Override
    public String addDepart(Department department) {

        department.setId(department.getId());
        department.setName(department.getName());
        department.setParentId(department.getParentId());
        departService.save(department);
        return department.toString();
    }


    @Override
    public Optional<Department> selectAll() {

        List<Department> list = departMapper.selectAll();

        for (Department department : list) {
            List<Department> childrenDepart = new ArrayList<>();
            for (Department departments : list) {
                if (Objects.equals(department.getId(), departments.getParentId())) {
                    childrenDepart.add(departments);
                }
                department.setChildren(childrenDepart);
            }
        }
        Optional<Department> list1 = list.stream().findFirst();
        return list1;
    }


}