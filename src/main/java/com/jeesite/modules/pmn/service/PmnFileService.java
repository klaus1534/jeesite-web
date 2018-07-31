/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.pmn.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.pmn.entity.PmnFile;
import com.jeesite.modules.pmn.dao.PmnFileDao;

/**
 * 采购单单身Service
 * @author LJJ
 * @version 2018-07-27
 */
@Service
@Transactional(readOnly=true)
public class PmnFileService extends CrudService<PmnFileDao, PmnFile> {
	
	/**
	 * 获取单条数据
	 * @param pmnFile
	 * @return
	 */
	@Override
	public PmnFile get(PmnFile pmnFile) {
		return super.get(pmnFile);
	}

	@Override
	public List<PmnFile> findList(PmnFile pmnFile) {
		return super.findList(pmnFile);
	}

	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param pmnFile
	 * @return
	 */
	@Override
	public Page<PmnFile> findPage(Page<PmnFile> page, PmnFile pmnFile) {
		return super.findPage(page, pmnFile);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param pmnFile
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(PmnFile pmnFile) {
		super.save(pmnFile);
	}
	
	/**
	 * 更新状态
	 * @param pmnFile
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(PmnFile pmnFile) {
		super.updateStatus(pmnFile);
	}
	
	/**
	 * 删除数据
	 * @param pmnFile
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(PmnFile pmnFile) {
		super.delete(pmnFile);
	}
	
}