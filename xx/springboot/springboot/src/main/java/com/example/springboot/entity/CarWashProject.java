package com.example.springboot.entity;

public class CarWashProject {
    private Integer wp_id ;
	private Integer cw_id;//引用t_carwash
    private String wp_name ;// 项目名称
    private String cw_image;// 图片
    private Integer price;// 单价
    private String wp_description  ;//描述

    public Integer getWp_id() {
        return wp_id;
    }

    public void setWp_id(Integer wp_id) {
        this.wp_id = wp_id;
    }

    public Integer getCw_id() {
        return cw_id;
    }

    public void setCw_id(Integer cw_id) {
        this.cw_id = cw_id;
    }

    public String getWp_name() {
        return wp_name;
    }

    public void setWp_name(String wp_name) {
        this.wp_name = wp_name;
    }

    public String getCw_image() {
        return cw_image;
    }

    public void setCw_image(String cw_image) {
        this.cw_image = cw_image;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getWp_description() {
        return wp_description;
    }

    public void setWp_description(String wp_description) {
        this.wp_description = wp_description;
    }


}


