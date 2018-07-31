/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.pmn.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.pmn.entity.PmnFile;

/**
 * 采购单单身DAO接口
 * @author LJJ
 * @version 2018-07-27
 */
@MyBatisDao
public interface PmnFileDao extends CrudDao<PmnFile> {
	
}