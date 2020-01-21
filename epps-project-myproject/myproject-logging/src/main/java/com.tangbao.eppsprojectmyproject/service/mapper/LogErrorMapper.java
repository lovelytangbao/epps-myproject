package com.tangbao.eppsprojectmyproject.service.mapper;

import com.tangbao.eppsprojectmyproject.base.BaseMapper;
import com.tangbao.eppsprojectmyproject.domain.Log;
import com.tangbao.eppsprojectmyproject.service.dto.LogErrorDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author Zheng Jie
 * @date 2019-5-22
 */
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LogErrorMapper extends BaseMapper<LogErrorDTO, Log> {

}