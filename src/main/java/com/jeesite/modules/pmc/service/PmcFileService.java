/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.pmc.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.pmc.entity.PmcFile;
import com.jeesite.modules.pmc.dao.PmcFileDao;

/**
 * 供应商基本资料表Service
 * @author LJJ
 * @version 2018-07-25
 */
@Service
@Transactional(readOnly=true)
public class PmcFileService extends CrudService<PmcFileDao, PmcFile> {
	
	/**
	 * 获取单条数据
	 * @param pmcFile
	 * @return
	 */
	@Override
	public PmcFile get(PmcFile pmcFile) {
		return super.get(pmcFile);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param pmcFile
	 * @return
	 */
	@Override
	public Page<PmcFile> findPage(Page<PmcFile> page, PmcFile pmcFile) {
		return super.findPage(page, pmcFile);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param pmcFile
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(PmcFile pmcFile) {
		super.save(pmcFile);
	}
	
	/**
	 * 更新状态
	 * @param pmcFile
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(PmcFile pmcFile) {
		super.updateStatus(pmcFile);
	}
	
	/**
	 * 删除数据
	 * @param pmcFile
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(PmcFile pmcFile) {
		super.delete(pmcFile);
	}
	
}