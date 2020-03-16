package com.emall_3_afternoon.provider;

import com.emall_3_afternoon.entity.Address_Info;
import org.apache.ibatis.jdbc.SQL;

public class AddressUpdateProvider {
    public String updateAddress(final Address_Info addressInfo){
        return new SQL(){{
            UPDATE("address_info");
            if (addressInfo.getAddress() != null){
                SET("address=#{address}");
            }
            if (addressInfo.getAddress_detail() != null){
                SET("address_detail=#{address_detail}");
            }
            if (addressInfo.getAddresssee() != null){
                SET("addresssee=#{addresssee}");
            }
            if (addressInfo.getTelephone() != null){
                SET("telephone=#{telephone}");
            }
            WHERE("address_id = #{address_id}");
        }}.toString();
    }
}
