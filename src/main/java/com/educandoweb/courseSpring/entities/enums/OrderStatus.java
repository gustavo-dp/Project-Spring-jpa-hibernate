package com.educandoweb.courseSpring.entities.enums;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;
    OrderStatus(int code){
        this.code = code;
    }

    public int getCode(){
        return this.code;
    }

    public static OrderStatus valueOf(int code){
        for (OrderStatus orderStatus : OrderStatus.values()){
            if (orderStatus.getCode() == code){
                return orderStatus;
            }
        }
        throw new IllegalArgumentException("OrderStatus code not found");
    }
}
