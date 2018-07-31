/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.pmm.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.pmm.entity.PmmFile;

/**
 * 采购单单头DAO接口
 * @author LJJ
 * @version 2018-07-26
 */
@MyBatisDao
public interface PmmFileDao extends CrudDao<PmmFile> {
	
}