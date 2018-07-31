/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.pmm.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jeesite.modules.pmc.entity.PmcFile;
import com.jeesite.modules.pmc.service.PmcFileService;
import com.jeesite.modules.pmn.entity.PmnFile;
import com.jeesite.modules.pmn.service.PmnFileService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jeesite.common.config.Global;
import com.jeesite.common.entity.Page;
import com.jeesite.common.web.BaseController;
import com.jeesite.modules.pmm.entity.PmmFile;
import com.jeesite.modules.pmm.service.PmmFileService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 采购单单头Controller
 * @author LJJ
 * @version 2018-07-26
 */
@Controller
@RequestMapping(value = "${adminPath}/pmm/pmmFile")
public class PmmFileController extends BaseController {

	@Autowired
	private PmmFileService pmmFileService;
	@Autowired
	private PmcFileService pmcFileService;
	@Autowired
	private PmnFileService pmnFileService;
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public PmmFile get(String pmm01, boolean isNewRecord) {
		return pmmFileService.get(pmm01, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("pmm:pmmFile:view")
	@RequestMapping(value = {"list", ""})
	public String list(PmmFile pmmFile, Model model) {
		model.addAttribute("pmmFile", pmmFile);
		return "modules/pmm/pmmFileList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("pmm:pmmFile:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<PmmFile> listData(PmmFile pmmFile, HttpServletRequest request, HttpServletResponse response) {
		Page<PmmFile> page = pmmFileService.findPage(new Page<PmmFile>(request, response), pmmFile); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("pmm:pmmFile:view")
	@RequestMapping(value = "form")
	public String form(PmmFile pmmFile, Model model) {
		PmcFile pmcFile=new PmcFile();
		pmcFile.setPmc01(pmmFile.getPmm09());
		pmmFile.setPmc081(pmcFileService.get(pmcFile).getPmc081());

		SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
		try {
			pmmFile.setPmm04(sdf.parse(sdf.format(pmmFile.getPmm04())));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		PmnFile pmnFile=new PmnFile();
		pmnFile.setPmn01(pmmFile.getPmm01());
		pmmFile.setPmnFile(pmnFileService.findList(pmnFile));
		model.addAttribute("pmmFile", pmmFile);
		return "modules/pmm/pmmFileForm";
	}

	/**
	 * 保存采购单单头
	 */
	@RequiresPermissions("pmm:pmmFile:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated PmmFile pmmFile) {
		pmmFileService.save(pmmFile);
		return renderResult(Global.TRUE, text("保存采购单单头成功！"));
	}
	
	/**
	 * 删除采购单单头
	 */
	@RequiresPermissions("pmm:pmmFile:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(PmmFile pmmFile) {
		pmmFileService.delete(pmmFile);
		return renderResult(Global.TRUE, text("删除采购单单头成功！"));
	}
	
}