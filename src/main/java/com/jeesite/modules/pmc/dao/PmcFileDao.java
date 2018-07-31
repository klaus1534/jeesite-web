/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.pmc.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.pmc.entity.PmcFile;

/**
 * 供应商基本资料表DAO接口
 * @author LJJ
 * @version 2018-07-25
 */
@MyBatisDao
public interface PmcFileDao extends CrudDao<PmcFile> {
	
}