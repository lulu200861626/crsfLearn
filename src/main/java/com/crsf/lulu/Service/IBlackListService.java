package com.crsf.lulu.Service;

import com.crsf.lulu.Model.BlackListModel;
import com.crsf.lulu.domain.UserDO;

import java.util.List;

/**
 * Created by lulu on 15/8/12.
 */
public interface IBlackListService {
    public List<UserDO> getBlackListAll();
    public BlackListModel getBlackListModel();
}
