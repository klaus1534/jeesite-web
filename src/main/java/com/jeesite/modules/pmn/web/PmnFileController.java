/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.pmn.web;

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
import com.jeesite.modules.pmn.entity.PmnFile;
import com.jeesite.modules.pmn.service.PmnFileService;

/**
 * 采购单单身Controller
 * @author LJJ
 * @version 2018-07-27
 */
@CrossOrigin
@Controller
@RequestMapping(value = "${adminPath}/pmn/pmnFile")
public class PmnFileController extends BaseController {

	@Autowired
	private PmnFileService pmnFileService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public PmnFile get(String pmn01, boolean isNewRecord) {
		return pmnFileService.get(pmn01, isNewRecord);
	}


	/**
	 * 查询列表
	 */
	@RequiresPermissions("pmm:pmmFile:view")
	@RequestMapping(value = {"list", ""})
	public String list(PmnFile pmnFile, Model model) {
		model.addAttribute("pmnFile", pmnFile);
		return "modules/pmn/pmnFileList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("pmm:pmmFile:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<PmnFile> listData(PmnFile pmnFile, HttpServletRequest request, HttpServletResponse response) {
		Page<PmnFile> page = pmnFileService.findPage(new Page<PmnFile>(request, response), pmnFile); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("pmn:pmnFile:view")
	@RequestMapping(value = "form")
	public String form(PmnFile pmnFile, Model model) {
		model.addAttribute("pmnFile", pmnFile);
		return "modules/pmn/pmnFileForm";
	}

	/**
	 * 保存采购单单身
	 */
	@RequiresPermissions("pmn:pmnFile:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated PmnFile pmnFile) {
		pmnFileService.save(pmnFile);
		return renderResult(Global.TRUE, text("保存采购单单身成功！"));
	}
	
	/**
	 * 删除采购单单身
	 */
	@RequiresPermissions("pmn:pmnFile:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(PmnFile pmnFile) {
		pmnFileService.delete(pmnFile);
		return renderResult(Global.TRUE, text("删除采购单单身成功！"));
	}
	
}