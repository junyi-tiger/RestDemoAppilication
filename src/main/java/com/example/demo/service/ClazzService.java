package com.example.demo.service;

import com.example.demo.entity.Clazz;

import java.util.List;

public interface ClazzService {

    /**
     * 获取所有班级
     * @return 所有班级列表
     */
    List<Clazz> all();

    /**
     * 新增一个班级
     * @param clazz 班级信息
     * @return 新增的班级信息
     */
    Clazz save(Clazz clazz);

    /**
     * 通过clazzId删除
     * @param clazzId 班级id
     */
    void deleteByClazzId(Long clazzId);
}
