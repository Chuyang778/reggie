package com.itheima.reggie.dto;

import com.itheima.reggie.entity.Orders;
import lombok.Data;

/**
 * @author ChuYang
 * @version 1.0
 */
@Data
public class OrdersDto extends Orders {
    private int SumNum;

}
