/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.pmc.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.jeesite.common.config.Global;
import com.jeesite.common.entity.Page;
import com.jeesite.common.web.BaseController;
import com.jeesite.modules.pmc.entity.PmcFile;
import com.jeesite.modules.pmc.service.PmcFileService;

/**
 * 供应商基本资料表Controller
 * @author LJJ
 * @version 2018-07-25
 */
@CrossOrigin
@Controller
@RequestMapping(value = "${adminPath}/pmc/pmcFile")
public class PmcFileController extends BaseController {

	@Autowired
	private PmcFileService pmcFileService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public PmcFile get(String pmc01, boolean isNewRecord) {
		return pmcFileService.get(pmc01, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("pmc:pmcFile:view")
	@RequestMapping(value = {"list", ""})
	public String list(PmcFile pmcFile, Model model) {
		model.addAttribute("pmcFile", pmcFile);
		return "modules/pmc/pmcFileList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("pmc:pmcFile:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<PmcFile> listData(PmcFile pmcFile, HttpServletRequest request, HttpServletResponse response) {
		Page<PmcFile> page = pmcFileService.findPage(new Page<PmcFile>(request, response), pmcFile); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("pmc:pmcFile:view")
	@RequestMapping(value = "form")
	public String form(PmcFile pmcFile, Model model) {
		model.addAttribute("pmcFile", pmcFile);
		return "modules/pmc/pmcFileForm";
	}

	/**
	 * 保存供应商基本资料表
	 */
	@RequiresPermissions("pmc:pmcFile:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated PmcFile pmcFile) {
		pmcFileService.save(pmcFile);
		return renderResult(Global.TRUE, text("保存供应商基本资料表成功！"));
	}
	
	/**
	 * 删除供应商基本资料表
	 */
	@RequiresPermissions("pmc:pmcFile:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(PmcFile pmcFile) {
		pmcFileService.delete(pmcFile);
		return renderResult(Global.TRUE, text("删除供应商基本资料表成功！"));
	}
	
}