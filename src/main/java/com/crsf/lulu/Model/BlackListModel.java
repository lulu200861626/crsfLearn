package com.crsf.lulu.Model;

import com.crsf.lulu.domain.RuleDO;
import com.crsf.lulu.domain.UserDO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lulu on 15/8/12.
 */
public class BlackListModel {
    private List<UserDO> targets = new ArrayList<UserDO>();
    private List<RuleDO> rules = new ArrayList<RuleDO>();

    public List<UserDO> getTargets() {
        return targets;
    }

    public void setTargets(List<UserDO> targets) {
        this.targets = targets;
    }

    public List<RuleDO> getRules() {
        return rules;
    }

    public void setRules(List<RuleDO> rules) {
        this.rules = rules;
    }
}
