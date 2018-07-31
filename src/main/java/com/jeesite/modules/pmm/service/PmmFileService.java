/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.pmm.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.pmm.entity.PmmFile;
import com.jeesite.modules.pmm.dao.PmmFileDao;

/**
 * 采购单单头Service
 * @author LJJ
 * @version 2018-07-26
 */
@Service
@Transactional(readOnly=true)
public class PmmFileService extends CrudService<PmmFileDao, PmmFile> {
	
	/**
	 * 获取单条数据
	 * @param pmmFile
	 * @return
	 */
	@Override
	public PmmFile get(PmmFile pmmFile) {
		return super.get(pmmFile);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param pmmFile
	 * @return
	 */
	@Override
	public Page<PmmFile> findPage(Page<PmmFile> page, PmmFile pmmFile) {
		return super.findPage(page, pmmFile);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param pmmFile
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(PmmFile pmmFile) {
		super.save(pmmFile);
	}
	
	/**
	 * 更新状态
	 * @param pmmFile
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(PmmFile pmmFile) {
		super.updateStatus(pmmFile);
	}
	
	/**
	 * 删除数据
	 * @param pmmFile
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(PmmFile pmmFile) {
		super.delete(pmmFile);
	}
	
}