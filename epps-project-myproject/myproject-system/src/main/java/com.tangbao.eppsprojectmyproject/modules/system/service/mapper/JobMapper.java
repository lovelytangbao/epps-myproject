package com.tangbao.eppsprojectmyproject.modules.system.service.mapper;

import com.tangbao.eppsprojectmyproject.base.BaseMapper;
import com.tangbao.eppsprojectmyproject.modules.system.domain.Job;
import com.tangbao.eppsprojectmyproject.modules.system.service.dto.JobDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

/**
* @author Zheng Jie
* @date 2019-03-29
*/
@Mapper(componentModel = "spring",uses = {DeptMapper.class},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface JobMapper extends BaseMapper<JobDto, Job> {

    /**
     * 转Dto
     * @param job 原始数据
     * @param deptSuperiorName /
     * @return /
     */
    @Mapping(source = "deptSuperiorName", target = "deptSuperiorName")
    JobDto toDto(Job job, String deptSuperiorName);
}