package com.imooc.service;

import com.imooc.pojo.Stu;

/**
 * 基于通用mapper-restful风格
 */
public interface StuService {

    public Stu getStuInfo(int id);

    public void saveStu();

    public void updateStu(int id);

    public void deleteStu(int id);

    public void saveParent();
    public void saveChildren();
}
