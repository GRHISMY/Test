package com.emall_3_afternoon.entity;

public class Address_Info {
    private int address_id;
    private int b_s_id;
    private String address;
    private String address_detail;
    private String addresssee;
    private String telephone;
    private int default_status;


    public Address_Info(int address_id,String address, String address_detail, String addresssee, String telephone) {
        this.address_id = address_id;
        this.address = address;
        this.address_detail = address_detail;
        this.addresssee = addresssee;
        this.telephone = telephone;
    }

    public Address_Info(int b_s_id, String address, String address_detail, String addresssee, String telephone, int default_status) {
        this.b_s_id = b_s_id;
        this.address = address;
        this.address_detail = address_detail;
        this.addresssee = addresssee;
        this.telephone = telephone;
        this.default_status = default_status;
    }

    @Override
    public String toString() {
        return "Address_Info{" +
                "address_id=" + address_id +
                ", b_s_id=" + b_s_id +
                ", address='" + address + '\'' +
                ", address_detail='" + address_detail + '\'' +
                ", addresssee='" + addresssee + '\'' +
                ", telephone='" + telephone + '\'' +
                ", default_status=" + default_status +
                '}';
    }

    public Address_Info() {
    }

    public Address_Info(int address_id, int b_s_id, String address, String address_detail, String addresssee, String telephone, int default_status) {
        this.address_id = address_id;
        this.b_s_id = b_s_id;
        this.address = address;
        this.address_detail = address_detail;
        this.addresssee = addresssee;
        this.telephone = telephone;
        this.default_status = default_status;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public int getB_s_id() {
        return b_s_id;
    }

    public void setB_s_id(int b_s_id) {
        this.b_s_id = b_s_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress_detail() {
        return address_detail;
    }

    public void setAddress_detail(String address_detail) {
        this.address_detail = address_detail;
    }

    public String getAddresssee() {
        return addresssee;
    }

    public void setAddresssee(String addresssee) {
        this.addresssee = addresssee;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getDefault_status() {
        return default_status;
    }

    public void setDefault_status(int default_status) {
        this.default_status = default_status;
    }
}
