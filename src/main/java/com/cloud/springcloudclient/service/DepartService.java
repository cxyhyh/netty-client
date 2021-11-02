package com.cloud.springcloudclient.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.springcloudclient.entity.Department;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @Author hanyuhao
 * @PackageName com.cloud.springcloudclient.service.impl
 * @Class DepartService
 * @Date 2021/8/5 9:25
 */
@Service
public interface DepartService extends IService<Department> {
    String addDepart(Department department);

    Optional<Department> selectAll();


}
