package com.tangbao.eppsprojectmyproject.modules.mnt.service.dto;

import lombok.Data;
import com.tangbao.eppsprojectmyproject.annotation.Query;

import java.sql.Timestamp;
import java.util.List;

/**
* @author zhanghouying
* @date 2019-08-24
*/
@Data
public class ServerDeployQueryCriteria{

	/**
	 * 模糊
	 */
	@Query(blurry = "name,ip,account")
    private String blurry;

	@Query(type = Query.Type.BETWEEN)
	private List<Timestamp> createTime;
}
