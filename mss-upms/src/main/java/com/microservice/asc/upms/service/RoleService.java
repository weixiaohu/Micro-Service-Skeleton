package com.microservice.asc.upms.service;

import com.microservice.asc.upms.entity.SysRole;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Mr.Yangxiufeng
 * Date: 2018-05-10
 * Time: 20:26
 */
public interface RoleService {
    List<SysRole> getRoleByUserId(Integer userId);
}
