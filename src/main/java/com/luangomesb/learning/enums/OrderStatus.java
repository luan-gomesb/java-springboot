package com.luangomesb.learning.enums;

public enum OrderStatus {
  // declare options wich explicit code
  WAITING_PAYMENT(1),
  PAID(2),
  SHIPPED(3),
  DELIVERED(4),
  CANCELED(5);

  // store the status code
  private int code;

  // private constructor that's used by options
  private OrderStatus(int code) {
    this.code = code;
  }

  // return the code of status
  public int getCode() {
    return this.code;
  }

  // return new order status by code
  public static OrderStatus valueOf(int code) {
    for (OrderStatus value : OrderStatus.values()) {
      if (value.getCode() == code) {
        return value;
      }
    }
    throw new IllegalArgumentException("Invalid OrderStatus code");
  }

}
