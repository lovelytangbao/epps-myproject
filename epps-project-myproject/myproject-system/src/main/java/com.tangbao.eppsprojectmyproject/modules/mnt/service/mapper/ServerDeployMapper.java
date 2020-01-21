package com.tangbao.eppsprojectmyproject.modules.mnt.service.mapper;

import com.tangbao.eppsprojectmyproject.base.BaseMapper;
import com.tangbao.eppsprojectmyproject.modules.mnt.domain.ServerDeploy;
import com.tangbao.eppsprojectmyproject.modules.mnt.service.dto.ServerDeployDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author zhanghouying
* @date 2019-08-24
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ServerDeployMapper extends BaseMapper<ServerDeployDto, ServerDeploy> {

}
