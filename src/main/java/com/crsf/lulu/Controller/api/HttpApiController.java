package com.crsf.lulu.Controller.api;

import com.crsf.lulu.Model.BlackListModel;
import com.crsf.lulu.Service.IBlackListService;
import com.crsf.lulu.domain.UserDO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lulu on 15/8/12.
 */
@Controller
@RequestMapping("api/")
public class HttpApiController {
    @Resource
    IBlackListService iBlackListService;

    @RequestMapping(value = {"/blacklist", "blacklist"})
    @ResponseBody
    public Object blacklist() {
        return iBlackListService.getBlackListModel();
    }
}
