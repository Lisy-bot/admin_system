package com.lisy.admin.dao;

import com.lisy.admin.model.AdminRole;
import java.util.List;

public interface AdminRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_role
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_role
     *
     * @mbg.generated
     */
    int insert(AdminRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_role
     *
     * @mbg.generated
     */
    AdminRole selectByPrimaryKey(Integer roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_role
     *
     * @mbg.generated
     */
    List<AdminRole> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_role
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(AdminRole record);
}