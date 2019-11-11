package com.lisy.admin.dao;

import com.lisy.admin.model.AdminUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AdminUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbg.generated
     */
    int insert(AdminUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbg.generated
     */
    AdminUser selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbg.generated
     */
    List<AdminUser> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(AdminUser record);
}