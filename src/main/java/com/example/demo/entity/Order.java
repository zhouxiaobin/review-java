package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("order_info") // 映射到数据库的订单表
public class Order {
    @TableId
    private Integer id;
    @TableField("orderName")
    private String orderName;
    @TableField("orderPeople")
    private String orderPeople;

    @TableField("orderPay")
    private Integer orderPay;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderPeople() {
        return orderPeople;
    }

    public void setOrderPeople(String orderPeople) {
        this.orderPeople = orderPeople;
    }

    public Integer getOrderPay() {
        return orderPay;
    }

    public void setOrderPay(Integer orderPay) {
        this.orderPay = orderPay;
    }
}