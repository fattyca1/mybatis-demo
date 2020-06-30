package com.mybatis.demo.mapper;


import com.mybatis.demo.entity.Pet;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author fattyca1
 * @since 2019-05-01
 */
public interface PetMapper {

    Pet selectByName(@Param("name") String name);
}
