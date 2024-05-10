package com.zecola.project.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.zecola.project.model.entity.InterfaceInfo;
import com.zecola.project.model.entity.Post;

/**
* @author XTurbo
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-05-10 09:07:28
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
