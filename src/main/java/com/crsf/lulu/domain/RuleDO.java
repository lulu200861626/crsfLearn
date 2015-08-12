package com.crsf.lulu.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lulu on 15/8/12.
 */
public class RuleDO {
    private String site;
    private String tel;
    private String name;
    private List<SelectorDO> selectors = new ArrayList<SelectorDO>();

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SelectorDO> getSelectors() {
        return selectors;
    }

    public void setSelectors(List<SelectorDO> selectors) {
        this.selectors = selectors;
    }
}
