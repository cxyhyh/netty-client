package com.cloud.springcloudclient.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.springcloudclient.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author hanyuhao
 * @PackageName com.cloud.springcloudclient.mapper
 * @Class DepartMapper
 * @Date 2021/8/5 9:23
 */
@Repository
public interface DepartMapper extends BaseMapper<Department> {
    List<Department> selectAll();
}
