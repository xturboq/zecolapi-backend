package com.zecola.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zecola.project.model.entity.UserInterfaceInfo;


/**
* @author XTurbo
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-05-17 14:53:00
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    boolean invokeCount(long interfaceInfoId, long userId);
}
