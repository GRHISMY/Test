package com.emall_3_afternoon.controller;

import com.emall_3_afternoon.entity.Address_Info;
import com.emall_3_afternoon.service.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    private Address addressServe;

    @PostMapping("addAddress")
    public Integer addAddress(@RequestParam(value = "b_s_id" ) Integer b_s_id,
                          @RequestParam(value = "address") String address,
                          @RequestParam(value = "address_detail") String address_detail,
                          @RequestParam(value = "addresssee") String addresssee,
                          @RequestParam(value = "telephone") String telephone,
                          @RequestParam(value = "default_status") Integer default_status){
        Address_Info address_info = new Address_Info(b_s_id,address,address_detail,addresssee,telephone,default_status);

        return addressServe.addAddress(address_info);
    }

    @RequestMapping("findAllAddress")
    public List<Address_Info> findAllAddress(@RequestParam(value = "b_s_id") Integer b_s_id){
        return addressServe.findAllAddress(b_s_id);
    }

    @RequestMapping("findOneAddress")
    public Address_Info findOneAddress(@RequestParam(value = "address_id") Integer address_id){
        return addressServe.findOneAddress(address_id);
    }

    @DeleteMapping("deleteAddress")
    public Integer deleteAddress(@RequestParam(value = "address_id") Integer address_id){
        return addressServe.deleteAddress(address_id);
    }

    /**
     * 修改是否为默认地址
     * @param address_id
     * @return
     */
    @PostMapping("updateAddress")
    public Integer updateAddress(@RequestParam(value = "address_id") Integer address_id){
        return addressServe.updateAddress(address_id);
    }

    /**
     * 修改地址
     * @param address_id
     * @param address
     * @param address_detail
     * @param addresssee
     * @param telephone
     * @return
     */
    @PostMapping("upAddress")
    public Integer upAddress(@RequestParam(value = "address_id") Integer address_id,
                             @RequestParam(value = "address") String address,
                             @RequestParam(value = "address_detail") String address_detail,
                             @RequestParam(value = "addresssee") String addresssee,
                             @RequestParam(value = "telephone") String telephone){
        Address_Info address_info = new Address_Info(address_id,address,address_detail,addresssee,telephone);
        return addressServe.upAddress(address_info);
    }
}
