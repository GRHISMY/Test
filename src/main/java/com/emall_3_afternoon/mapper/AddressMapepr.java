package com.emall_3_afternoon.mapper;

import com.emall_3_afternoon.entity.Address_Info;
import com.emall_3_afternoon.provider.AddressUpdateProvider;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AddressMapepr {
    @Insert("INSERT INTO address_info(b_s_id,address,address_detail,addresssee,telephone,default_status) " +
            "VALUES(#{b_s_id},#{address},#{address_detail},#{addresssee},#{telephone},#{default_status})")
    Integer addAddress(Address_Info address_info);

    @Select("SELECT * FROM address_info WHERE b_s_id = #{b_s_id}")
    List<Address_Info> findAllAddress(Integer b_s_id);

    @Select("SELECT * FROM address_info WHERE address_id = #{address_id}")
    Address_Info findOneAddress(Integer address_id);

    @Delete("DELETE FROM address_info WHERE address_id = #{address_id}")
    Integer deleteAddress(Integer address_id);

    @Update("update address_info set default_status =case when address_id=#{address_id} then 0 else 1 end")
    Integer updateAddress(Integer address_id);

    @UpdateProvider(type = AddressUpdateProvider.class,method = "updateAddress")
    Integer upAddress(Address_Info address_info);
}
