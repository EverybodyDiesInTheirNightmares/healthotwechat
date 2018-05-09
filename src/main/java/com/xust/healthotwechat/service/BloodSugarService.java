package com.xust.healthotwechat.service;

import com.xust.healthotwechat.entity.BloodSugar;
import com.xust.healthotwechat.mapper.BloodSugarMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by evildoerdb_ on 2018/5/8
 *
 * 血糖service
 */
@Service
public class BloodSugarService {

    @Autowired
    private BloodSugarMapper bloodSugarMapper;

    /**
     * 插入一条记录
     * @param bloodSugar
     * @return
     */
    public int insert(BloodSugar bloodSugar){
        return bloodSugarMapper.insert(bloodSugar);
    }


    /**
     * 根据openid查询历史记录
     * @param openid
     * @return
     */
    public List<BloodSugar> findBloodSugarListByOpenid(@Param("openid")String openid){
        return bloodSugarMapper.findBloodSugarListByOpenid(openid);
    }
}
