package com.cloud.springcloudclient.controller;

import com.cloud.springcloudclient.entity.Department;
import com.cloud.springcloudclient.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @Author hanyuhao
 * @PackageName com.cloud.springcloudclient.controller
 * @Class HelloController
 * @Date 2021/8/4 9:25
 */
@RestController
@RequestMapping("/demo")
public class HelloController {

    @GetMapping("/list")
    private String say(){
        return null;
    }

    @GetMapping("/distinct")
    private List<String> distinct(List<String> list){

        return list;
    }

    @Autowired
    private DepartService departService;

    @GetMapping("/addDepart")
    private String addDepart(Department department){
        return departService.addDepart(department);
    }

    @GetMapping("/selectAll")
    private Optional<Department> selectAll(){
        return departService.selectAll();
    }

    @PostMapping("/selectDepartId")
    private void selectDepartId(@RequestBody Department department){
        String name = "工厂";
        String nameTemp  =department.getName();
        if (name.equals(nameTemp)) {
            System.out.println(department.getId());
        }
        List<Department> list = department.getChildren();
        if (!CollectionUtils.isEmpty(list)) {
            for (Department temp:list) {
                this.selectDepartId(temp);
            }
        }
    }

}
