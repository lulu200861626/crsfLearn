package com.crsf.lulu.Service.impl;

import com.crsf.lulu.Model.BlackListModel;
import com.crsf.lulu.Service.IBlackListService;
import com.crsf.lulu.domain.RuleDO;
import com.crsf.lulu.domain.UserDO;
import com.crsf.lulu.util.JsonUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lulu on 15/8/12.
 */
@Service
public class IBlackListServideImpl implements IBlackListService {
    public List<UserDO> getBlackListAll(){
        List<UserDO> userDOs = new ArrayList<UserDO>();
        UserDO u1 = new UserDO();
        u1.setName("陈杰");
        u1.setPhone("18210002827");
        UserDO u2 = new UserDO();
        u2.setName("邹广朋");
        u2.setPhone("13311157743");
        userDOs.add(u1);
        userDOs.add(u2);
        return userDOs;
    }
    public List<RuleDO> getRule(){

        String selectedItemsJson = "[{\"site\": \"58.com\",\"tel\": \"#t_phone\",\"name\": \".jjreninfo_des_jjr span a\",\"selectors\": [{\"selector\": \".jjreninfo_des\"}, {\"selector\": \".jjreninfo_pic a\"}, {\"selector\": \".bottom_bar .tel\"}]}," +
                "{\"site\": \"ganji.com\",\"tel\": \".contact-mobile\",\"name\": \".person-name span a\",\"selectors\": [{\"selector\": \".contact-mobile\"}, {\"selector\": \".rightBar .right-border .col-right:first-child\"}, {\"selector\": \".bot-floating-mobile\"}]}]";
        List<RuleDO> ruleDOs = JsonUtil.fromJson(selectedItemsJson,
                new TypeReference<List<RuleDO>>() {
                }
        );
        return ruleDOs;
    }
    public BlackListModel getBlackListModel(){
        BlackListModel blackListModel = new BlackListModel();
        blackListModel.setTargets(getBlackListAll());
        blackListModel.setRules(getRule());
        return  blackListModel;
    }
}
