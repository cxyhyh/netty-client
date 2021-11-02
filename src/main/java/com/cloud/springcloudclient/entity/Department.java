package com.cloud.springcloudclient.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author hanyuhao
 * @PackageName com.cloud.springcloudclient.entity
 * @Class Department
 * @Date 2021/8/4 14:09
 */
@Data
@TableName(value = "depart")
public class Department implements Serializable {

    @TableId(value = "id")
    private int id;

    @TableField(value = "parentid")
    private int parentId;

    @TableField(value = "name")
    private String name;

  /* @TableField(value = "children")*/
    private List<Department> children;

}
