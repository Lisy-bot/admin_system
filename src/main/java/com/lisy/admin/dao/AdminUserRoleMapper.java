package com.lisy.admin.dao;

import com.lisy.admin.model.AdminUserRole;
import java.util.List;

public interface AdminUserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user_role
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer userRoleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user_role
     *
     * @mbg.generated
     */
    int insert(AdminUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user_role
     *
     * @mbg.generated
     */
    AdminUserRole selectByPrimaryKey(Integer userRoleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user_role
     *
     * @mbg.generated
     */
    List<AdminUserRole> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user_role
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(AdminUserRole record);
}