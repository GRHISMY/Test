package com.emall_3_afternoon.service;

import com.emall_3_afternoon.entity.Address_Info;
import com.emall_3_afternoon.mapper.AddressMapepr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Address {
    @Autowired
    private AddressMapepr addressMapepr;

    public Integer addAddress(Address_Info addressInfo){
        return addressMapepr.addAddress(addressInfo);
    }

    public List<Address_Info> findAllAddress(Integer b_s_id){
        return addressMapepr.findAllAddress(b_s_id);
    }

    public Address_Info findOneAddress(Integer address_id){
        return addressMapepr.findOneAddress(address_id);
    }

    public Integer deleteAddress(Integer address_id){
        return addressMapepr.deleteAddress(address_id);
    }

    public Integer updateAddress(Integer address_id){
        return addressMapepr.updateAddress(address_id);
    }

    public Integer upAddress(Address_Info address_info){
        return addressMapepr.upAddress(address_info);
    }
}
