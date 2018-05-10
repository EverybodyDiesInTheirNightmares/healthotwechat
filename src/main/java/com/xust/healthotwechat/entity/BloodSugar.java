package com.xust.healthotwechat.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created by evildoerdb_ on 2018/4/27
 *
 * 血糖
 */

@Data
public class BloodSugar {

    /**id*/
    private Integer id;

    /**phone 关联用户*/
    private String phone;

    /**血糖值*/
    private String bloodSugarValue;

    /**1代表饭前 2 代表饭后*/
    private String mealCondition;

    /**1代表服药前  2代表服药后*/
    private String medicineCondition;

    /**1代表录入健康档案  2 代表不录入健康档案*/
    private String saveHealthRecord;

    /**测量时间*/
    private Date measureTime;
}
