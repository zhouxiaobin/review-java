package com.example.demo.entity;



public enum VipType {
    PRIMARY(1, "小学"),
    MIDDLE(2, "初中"),
    HIGH(3, "高中");

    private final int code;
    private final String description;

    VipType(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static VipType fromCode(int code) {
        for (VipType type : values()) {
            if (type.code == code) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid vipType code: " + code);
    }
}
