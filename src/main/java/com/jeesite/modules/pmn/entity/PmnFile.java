/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.pmn.entity;

import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotNull;
import java.util.Date;
import com.jeesite.common.mybatis.annotation.JoinTable;
import com.jeesite.common.mybatis.annotation.JoinTable.Type;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.NotBlank;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 采购单单身Entity
 * @author LJJ
 * @version 2018-07-27
 */
@Table(name="pmn_file", alias="a", columns={
		@Column(name="pmn01", attrName="pmn01", label="采购单号", isPK=true),
		@Column(name="pmn011", attrName="pmn011", label="pmn011"),
		@Column(name="pmn02", attrName="pmn02", label="序号"),
		@Column(name="pmn03", attrName="pmn03", label="pmn03"),
		@Column(name="pmn04", attrName="pmn04", label="料号"),
		@Column(name="pmn041", attrName="pmn041", label="品名"),
		@Column(name="pmn05", attrName="pmn05", label="pmn05"),
		@Column(name="pmn06", attrName="pmn06", label="pmn06"),
		@Column(name="pmn07", attrName="pmn07", label="单位"),
		@Column(name="pmn08", attrName="pmn08", label="pmn08"),
		@Column(name="pmn09", attrName="pmn09", label="pmn09"),
		@Column(name="pmn10", attrName="pmn10", label="pmn10"),
		@Column(name="pmn11", attrName="pmn11", label="pmn11"),
		@Column(name="pmn121", attrName="pmn121", label="pmn121"),
		@Column(name="pmn122", attrName="pmn122", label="pmn122"),
		@Column(name="pmn123", attrName="pmn123", label="pmn123"),
		@Column(name="pmn13", attrName="pmn13", label="pmn13"),
		@Column(name="pmn14", attrName="pmn14", label="pmn14"),
		@Column(name="pmn15", attrName="pmn15", label="pmn15"),
		@Column(name="pmn16", attrName="pmn16", label="pmn16"),
		@Column(name="pmn18", attrName="pmn18", label="pmn18"),
		@Column(name="pmn20", attrName="pmn20", label="数量"),
		@Column(name="pmn23", attrName="pmn23", label="pmn23"),
		@Column(name="pmn24", attrName="pmn24", label="pmn24"),
		@Column(name="pmn25", attrName="pmn25", label="pmn25"),
		@Column(name="pmn30", attrName="pmn30", label="pmn30"),
		@Column(name="pmn31", attrName="pmn31", label="pmn31"),
		@Column(name="pmn31t", attrName="pmn31t", label="含税单价"),
		@Column(name="pmn32", attrName="pmn32", label="pmn32"),
		@Column(name="pmn33", attrName="pmn33", label="交货日期"),
		@Column(name="pmn34", attrName="pmn34", label="pmn34"),
		@Column(name="pmn35", attrName="pmn35", label="pmn35"),
		@Column(name="pmn36", attrName="pmn36", label="pmn36"),
		@Column(name="pmn37", attrName="pmn37", label="pmn37"),
		@Column(name="pmn38", attrName="pmn38", label="pmn38"),
		@Column(name="pmn40", attrName="pmn40", label="pmn40"),
		@Column(name="pmn41", attrName="pmn41", label="pmn41"),
		@Column(name="pmn42", attrName="pmn42", label="pmn42"),
		@Column(name="pmn43", attrName="pmn43", label="pmn43"),
		@Column(name="pmn431", attrName="pmn431", label="pmn431"),
		@Column(name="pmn44", attrName="pmn44", label="pmn44"),
		@Column(name="pmn45", attrName="pmn45", label="pmn45"),
		@Column(name="pmn46", attrName="pmn46", label="pmn46"),
		@Column(name="pmn50", attrName="pmn50", label="收货量"),
		@Column(name="pmn51", attrName="pmn51", label="pmn51"),
		@Column(name="pmn52", attrName="pmn52", label="pmn52"),
		@Column(name="pmn53", attrName="pmn53", label="pmn53"),
		@Column(name="pmn54", attrName="pmn54", label="pmn54"),
		@Column(name="pmn55", attrName="pmn55", label="验退量"),
		@Column(name="pmn56", attrName="pmn56", label="pmn56"),
		@Column(name="pmn57", attrName="pmn57", label="pmn57"),
		@Column(name="pmn58", attrName="pmn58", label="pmn58"),
		@Column(name="pmn59", attrName="pmn59", label="仓退量"),
		@Column(name="pmn60", attrName="pmn60", label="pmn60"),
		@Column(name="pmn61", attrName="pmn61", label="pmn61"),
		@Column(name="pmn62", attrName="pmn62", label="pmn62"),
		@Column(name="pmn63", attrName="pmn63", label="pmn63"),
		@Column(name="pmn64", attrName="pmn64", label="pmn64"),
		@Column(name="pmn65", attrName="pmn65", label="pmn65"),
		@Column(name="pmn66", attrName="pmn66", label="pmn66"),
		@Column(name="pmn67", attrName="pmn67", label="pmn67"),
		@Column(name="pmn68", attrName="pmn68", label="pmn68"),
		@Column(name="pmn69", attrName="pmn69", label="pmn69"),
		@Column(name="pmn70", attrName="pmn70", label="pmn70"),
		@Column(name="pmn71", attrName="pmn71", label="pmn71"),
		@Column(name="pmn80", attrName="pmn80", label="pmn80"),
		@Column(name="pmn81", attrName="pmn81", label="pmn81"),
		@Column(name="pmn82", attrName="pmn82", label="pmn82"),
		@Column(name="pmn83", attrName="pmn83", label="pmn83"),
		@Column(name="pmn84", attrName="pmn84", label="pmn84"),
		@Column(name="pmn85", attrName="pmn85", label="pmn85"),
		@Column(name="pmn86", attrName="pmn86", label="pmn86"),
		@Column(name="pmn87", attrName="pmn87", label="pmn87"),
		@Column(name="pmn88", attrName="pmn88", label="pmn88"),
		@Column(name="pmn88t", attrName="pmn88t", label="含税总价"),
		@Column(name="pmn930", attrName="pmn930", label="pmn930"),
		@Column(name="pmn401", attrName="pmn401", label="pmn401"),
		@Column(name="pmn90", attrName="pmn90", label="pmn90"),
		@Column(name="pmn94", attrName="pmn94", label="pmn94"),
		@Column(name="pmn95", attrName="pmn95", label="pmn95"),
		@Column(name="pmn96", attrName="pmn96", label="pmn96"),
		@Column(name="pmn97", attrName="pmn97", label="pmn97"),
		@Column(name="pmn98", attrName="pmn98", label="pmn98"),
		@Column(name="pmn91", attrName="pmn91", label="pmn91"),
		@Column(name="pmnud01", attrName="pmnud01", label="pmnud01"),
		@Column(name="pmnud02", attrName="pmnud02", label="pmnud02"),
		@Column(name="pmnud03", attrName="pmnud03", label="pmnud03"),
		@Column(name="pmnud04", attrName="pmnud04", label="pmnud04"),
		@Column(name="pmnud05", attrName="pmnud05", label="pmnud05"),
		@Column(name="pmnud06", attrName="pmnud06", label="pmnud06"),
		@Column(name="pmnud07", attrName="pmnud07", label="pmnud07"),
		@Column(name="pmnud08", attrName="pmnud08", label="pmnud08"),
		@Column(name="pmnud09", attrName="pmnud09", label="pmnud09"),
		@Column(name="pmnud10", attrName="pmnud10", label="pmnud10"),
		@Column(name="pmnud11", attrName="pmnud11", label="pmnud11"),
		@Column(name="pmnud12", attrName="pmnud12", label="pmnud12"),
		@Column(name="pmnud13", attrName="pmnud13", label="pmnud13"),
		@Column(name="pmnud14", attrName="pmnud14", label="pmnud14"),
		@Column(name="pmnud15", attrName="pmnud15", label="pmnud15"),
		@Column(name="pmn89", attrName="pmn89", label="pmn89"),
		@Column(name="pmn72", attrName="pmn72", label="pmn72"),
		@Column(name="pmn73", attrName="pmn73", label="pmn73"),
		@Column(name="pmn74", attrName="pmn74", label="pmn74"),
		@Column(name="pmn75", attrName="pmn75", label="pmn75"),
		@Column(name="pmn76", attrName="pmn76", label="pmn76"),
		@Column(name="pmn77", attrName="pmn77", label="pmn77"),
		@Column(name="pmnplant", attrName="pmnplant", label="pmnplant"),
		@Column(name="pmnlegal", attrName="pmnlegal", label="pmnlegal"),
		@Column(name="pmn012", attrName="pmn012", label="pmn012"),
		@Column(name="pmn919", attrName="pmn919", label="pmn919"),
		@Column(name="pmn99", attrName="pmn99", label="pmn99"),
		@Column(name="pmn78", attrName="pmn78", label="pmn78"),
		@Column(includeEntity=DataEntity.class),
		@Column(name="del_flag", attrName="delFlag", label="del_flag"),
	}, orderBy="a.update_date DESC"
)
public class PmnFile extends DataEntity<PmnFile> {
	
	private static final long serialVersionUID = 1L;
	private String pmn01;		// 采购单号
	private String pmn011;		// pmn011
	private Integer pmn02;		// 序号
	private String pmn03;		// pmn03
	private String pmn04;		// 料号
	private String pmn041;		// 品名
	private String pmn05;		// pmn05
	private String pmn06;		// pmn06
	private String pmn07;		// 单位
	private String pmn08;		// pmn08
	private Double pmn09;		// pmn09
	private String pmn10;		// pmn10
	private String pmn11;		// pmn11
	private Double pmn121;		// pmn121
	private String pmn122;		// pmn122
	private String pmn123;		// pmn123
	private Double pmn13;		// pmn13
	private String pmn14;		// pmn14
	private String pmn15;		// pmn15
	private String pmn16;		// pmn16
	private String pmn18;		// pmn18
	private Double pmn20;		// 数量
	private String pmn23;		// pmn23
	private String pmn24;		// pmn24
	private Integer pmn25;		// pmn25
	private Double pmn30;		// pmn30
	private Double pmn31;		// pmn31
	private Double pmn31t;		// 含税单价
	private Integer pmn32;		// pmn32
	private Date pmn33;		// 交货日期
	private Date pmn34;		// pmn34
	private Date pmn35;		// pmn35
	private Date pmn36;		// pmn36
	private Date pmn37;		// pmn37
	private String pmn38;		// pmn38
	private String pmn40;		// pmn40
	private String pmn41;		// pmn41
	private String pmn42;		// pmn42
	private Integer pmn43;		// pmn43
	private Integer pmn431;		// pmn431
	private Double pmn44;		// pmn44
	private Integer pmn45;		// pmn45
	private Integer pmn46;		// pmn46
	private Double pmn50;		// 收货量
	private Double pmn51;		// pmn51
	private String pmn52;		// pmn52
	private Double pmn53;		// pmn53
	private String pmn54;		// pmn54
	private Double pmn55;		// 验退量
	private String pmn56;		// pmn56
	private Double pmn57;		// pmn57
	private Double pmn58;		// pmn58
	private String pmn59;		// 仓退量
	private Integer pmn60;		// pmn60
	private String pmn61;		// pmn61
	private Double pmn62;		// pmn62
	private String pmn63;		// pmn63
	private String pmn64;		// pmn64
	private String pmn65;		// pmn65
	private String pmn66;		// pmn66
	private String pmn67;		// pmn67
	private String pmn68;		// pmn68
	private Integer pmn69;		// pmn69
	private Double pmn70;		// pmn70
	private String pmn71;		// pmn71
	private String pmn80;		// pmn80
	private Double pmn81;		// pmn81
	private Double pmn82;		// pmn82
	private String pmn83;		// pmn83
	private Double pmn84;		// pmn84
	private Double pmn85;		// pmn85
	private String pmn86;		// pmn86
	private Double pmn87;		// pmn87
	private Double pmn88;		// pmn88
	private Double pmn88t;		// 含税总价
	private String pmn930;		// pmn930
	private String pmn401;		// pmn401
	private Double pmn90;		// pmn90
	private String pmn94;		// pmn94
	private Integer pmn95;		// pmn95
	private String pmn96;		// pmn96
	private String pmn97;		// pmn97
	private String pmn98;		// pmn98
	private String pmn91;		// pmn91
	private String pmnud01;		// pmnud01
	private String pmnud02;		// pmnud02
	private String pmnud03;		// pmnud03
	private String pmnud04;		// pmnud04
	private String pmnud05;		// pmnud05
	private String pmnud06;		// pmnud06
	private Double pmnud07;		// pmnud07
	private Double pmnud08;		// pmnud08
	private Double pmnud09;		// pmnud09
	private Integer pmnud10;		// pmnud10
	private Integer pmnud11;		// pmnud11
	private Integer pmnud12;		// pmnud12
	private Date pmnud13;		// pmnud13
	private Date pmnud14;		// pmnud14
	private Date pmnud15;		// pmnud15
	private String pmn89;		// pmn89
	private String pmn72;		// pmn72
	private String pmn73;		// pmn73
	private String pmn74;		// pmn74
	private String pmn75;		// pmn75
	private Integer pmn76;		// pmn76
	private String pmn77;		// pmn77
	private String pmnplant;		// pmnplant
	private String pmnlegal;		// pmnlegal
	private String pmn012;		// pmn012
	private String pmn919;		// pmn919
	private String pmn99;		// pmn99
	private String pmn78;		// pmn78
	private String delFlag;		// del_flag
	
	public PmnFile() {
		this(null);
	}

	public PmnFile(String id){
		super(id);
	}
	
	public String getPmn01() {
		return pmn01;
	}

	public void setPmn01(String pmn01) {
		this.pmn01 = pmn01;
	}
	
	@Length(min=0, max=10, message="pmn011长度不能超过 10 个字符")
	public String getPmn011() {
		return pmn011;
	}

	public void setPmn011(String pmn011) {
		this.pmn011 = pmn011;
	}
	
	@NotNull(message="序号不能为空")
	public Integer getPmn02() {
		return pmn02;
	}

	public void setPmn02(Integer pmn02) {
		this.pmn02 = pmn02;
	}
	
	@Length(min=0, max=20, message="pmn03长度不能超过 20 个字符")
	public String getPmn03() {
		return pmn03;
	}

	public void setPmn03(String pmn03) {
		this.pmn03 = pmn03;
	}
	
	@Length(min=0, max=40, message="料号长度不能超过 40 个字符")
	public String getPmn04() {
		return pmn04;
	}

	public void setPmn04(String pmn04) {
		this.pmn04 = pmn04;
	}
	
	@Length(min=0, max=120, message="品名长度不能超过 120 个字符")
	public String getPmn041() {
		return pmn041;
	}

	public void setPmn041(String pmn041) {
		this.pmn041 = pmn041;
	}
	
	@Length(min=0, max=20, message="pmn05长度不能超过 20 个字符")
	public String getPmn05() {
		return pmn05;
	}

	public void setPmn05(String pmn05) {
		this.pmn05 = pmn05;
	}
	
	@Length(min=0, max=40, message="pmn06长度不能超过 40 个字符")
	public String getPmn06() {
		return pmn06;
	}

	public void setPmn06(String pmn06) {
		this.pmn06 = pmn06;
	}
	
	@Length(min=0, max=4, message="单位长度不能超过 4 个字符")
	public String getPmn07() {
		return pmn07;
	}

	public void setPmn07(String pmn07) {
		this.pmn07 = pmn07;
	}
	
	@Length(min=0, max=4, message="pmn08长度不能超过 4 个字符")
	public String getPmn08() {
		return pmn08;
	}

	public void setPmn08(String pmn08) {
		this.pmn08 = pmn08;
	}
	
	public Double getPmn09() {
		return pmn09;
	}

	public void setPmn09(Double pmn09) {
		this.pmn09 = pmn09;
	}
	
	@Length(min=0, max=4, message="pmn10长度不能超过 4 个字符")
	public String getPmn10() {
		return pmn10;
	}

	public void setPmn10(String pmn10) {
		this.pmn10 = pmn10;
	}
	
	@Length(min=0, max=1, message="pmn11长度不能超过 1 个字符")
	public String getPmn11() {
		return pmn11;
	}

	public void setPmn11(String pmn11) {
		this.pmn11 = pmn11;
	}
	
	public Double getPmn121() {
		return pmn121;
	}

	public void setPmn121(Double pmn121) {
		this.pmn121 = pmn121;
	}
	
	@Length(min=0, max=10, message="pmn122长度不能超过 10 个字符")
	public String getPmn122() {
		return pmn122;
	}

	public void setPmn122(String pmn122) {
		this.pmn122 = pmn122;
	}
	
	@Length(min=0, max=24, message="pmn123长度不能超过 24 个字符")
	public String getPmn123() {
		return pmn123;
	}

	public void setPmn123(String pmn123) {
		this.pmn123 = pmn123;
	}
	
	public Double getPmn13() {
		return pmn13;
	}

	public void setPmn13(Double pmn13) {
		this.pmn13 = pmn13;
	}
	
	@Length(min=0, max=1, message="pmn14长度不能超过 1 个字符")
	public String getPmn14() {
		return pmn14;
	}

	public void setPmn14(String pmn14) {
		this.pmn14 = pmn14;
	}
	
	@Length(min=0, max=1, message="pmn15长度不能超过 1 个字符")
	public String getPmn15() {
		return pmn15;
	}

	public void setPmn15(String pmn15) {
		this.pmn15 = pmn15;
	}
	
	@Length(min=0, max=1, message="pmn16长度不能超过 1 个字符")
	public String getPmn16() {
		return pmn16;
	}

	public void setPmn16(String pmn16) {
		this.pmn16 = pmn16;
	}
	
	@Length(min=0, max=23, message="pmn18长度不能超过 23 个字符")
	public String getPmn18() {
		return pmn18;
	}

	public void setPmn18(String pmn18) {
		this.pmn18 = pmn18;
	}
	
	@NotNull(message="数量不能为空")
	public Double getPmn20() {
		return pmn20;
	}

	public void setPmn20(Double pmn20) {
		this.pmn20 = pmn20;
	}
	
	@Length(min=0, max=10, message="pmn23长度不能超过 10 个字符")
	public String getPmn23() {
		return pmn23;
	}

	public void setPmn23(String pmn23) {
		this.pmn23 = pmn23;
	}
	
	@Length(min=0, max=20, message="pmn24长度不能超过 20 个字符")
	public String getPmn24() {
		return pmn24;
	}

	public void setPmn24(String pmn24) {
		this.pmn24 = pmn24;
	}
	
	public Integer getPmn25() {
		return pmn25;
	}

	public void setPmn25(Integer pmn25) {
		this.pmn25 = pmn25;
	}
	
	public Double getPmn30() {
		return pmn30;
	}

	public void setPmn30(Double pmn30) {
		this.pmn30 = pmn30;
	}
	
	@NotNull(message="pmn31不能为空")
	public Double getPmn31() {
		return pmn31;
	}

	public void setPmn31(Double pmn31) {
		this.pmn31 = pmn31;
	}
	
	public Double getPmn31t() {
		return pmn31t;
	}

	public void setPmn31t(Double pmn31t) {
		this.pmn31t = pmn31t;
	}
	
	public Integer getPmn32() {
		return pmn32;
	}

	public void setPmn32(Integer pmn32) {
		this.pmn32 = pmn32;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPmn33() {
		return pmn33;
	}

	public void setPmn33(Date pmn33) {
		this.pmn33 = pmn33;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPmn34() {
		return pmn34;
	}

	public void setPmn34(Date pmn34) {
		this.pmn34 = pmn34;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPmn35() {
		return pmn35;
	}

	public void setPmn35(Date pmn35) {
		this.pmn35 = pmn35;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPmn36() {
		return pmn36;
	}

	public void setPmn36(Date pmn36) {
		this.pmn36 = pmn36;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPmn37() {
		return pmn37;
	}

	public void setPmn37(Date pmn37) {
		this.pmn37 = pmn37;
	}
	
	@Length(min=0, max=1, message="pmn38长度不能超过 1 个字符")
	public String getPmn38() {
		return pmn38;
	}

	public void setPmn38(String pmn38) {
		this.pmn38 = pmn38;
	}
	
	@Length(min=0, max=24, message="pmn40长度不能超过 24 个字符")
	public String getPmn40() {
		return pmn40;
	}

	public void setPmn40(String pmn40) {
		this.pmn40 = pmn40;
	}
	
	@Length(min=0, max=20, message="pmn41长度不能超过 20 个字符")
	public String getPmn41() {
		return pmn41;
	}

	public void setPmn41(String pmn41) {
		this.pmn41 = pmn41;
	}
	
	@NotBlank(message="pmn42不能为空")
	@Length(min=0, max=1, message="pmn42长度不能超过 1 个字符")
	public String getPmn42() {
		return pmn42;
	}

	public void setPmn42(String pmn42) {
		this.pmn42 = pmn42;
	}
	
	public Integer getPmn43() {
		return pmn43;
	}

	public void setPmn43(Integer pmn43) {
		this.pmn43 = pmn43;
	}
	
	public Integer getPmn431() {
		return pmn431;
	}

	public void setPmn431(Integer pmn431) {
		this.pmn431 = pmn431;
	}
	
	public Double getPmn44() {
		return pmn44;
	}

	public void setPmn44(Double pmn44) {
		this.pmn44 = pmn44;
	}
	
	public Integer getPmn45() {
		return pmn45;
	}

	public void setPmn45(Integer pmn45) {
		this.pmn45 = pmn45;
	}
	
	public Integer getPmn46() {
		return pmn46;
	}

	public void setPmn46(Integer pmn46) {
		this.pmn46 = pmn46;
	}
	
	@NotNull(message="收货量不能为空")
	public Double getPmn50() {
		return pmn50;
	}

	public void setPmn50(Double pmn50) {
		this.pmn50 = pmn50;
	}
	
	@NotNull(message="pmn51不能为空")
	public Double getPmn51() {
		return pmn51;
	}

	public void setPmn51(Double pmn51) {
		this.pmn51 = pmn51;
	}
	
	@Length(min=0, max=10, message="pmn52长度不能超过 10 个字符")
	public String getPmn52() {
		return pmn52;
	}

	public void setPmn52(String pmn52) {
		this.pmn52 = pmn52;
	}
	
	@NotNull(message="pmn53不能为空")
	public Double getPmn53() {
		return pmn53;
	}

	public void setPmn53(Double pmn53) {
		this.pmn53 = pmn53;
	}
	
	@Length(min=0, max=10, message="pmn54长度不能超过 10 个字符")
	public String getPmn54() {
		return pmn54;
	}

	public void setPmn54(String pmn54) {
		this.pmn54 = pmn54;
	}
	
	@NotNull(message="验退量不能为空")
	public Double getPmn55() {
		return pmn55;
	}

	public void setPmn55(Double pmn55) {
		this.pmn55 = pmn55;
	}
	
	@Length(min=0, max=24, message="pmn56长度不能超过 24 个字符")
	public String getPmn56() {
		return pmn56;
	}

	public void setPmn56(String pmn56) {
		this.pmn56 = pmn56;
	}
	
	@NotNull(message="pmn57不能为空")
	public Double getPmn57() {
		return pmn57;
	}

	public void setPmn57(Double pmn57) {
		this.pmn57 = pmn57;
	}
	
	@NotNull(message="pmn58不能为空")
	public Double getPmn58() {
		return pmn58;
	}

	public void setPmn58(Double pmn58) {
		this.pmn58 = pmn58;
	}
	
	@Length(min=0, max=20, message="仓退量长度不能超过 20 个字符")
	public String getPmn59() {
		return pmn59;
	}

	public void setPmn59(String pmn59) {
		this.pmn59 = pmn59;
	}
	
	public Integer getPmn60() {
		return pmn60;
	}

	public void setPmn60(Integer pmn60) {
		this.pmn60 = pmn60;
	}
	
	@NotBlank(message="pmn61不能为空")
	@Length(min=0, max=40, message="pmn61长度不能超过 40 个字符")
	public String getPmn61() {
		return pmn61;
	}

	public void setPmn61(String pmn61) {
		this.pmn61 = pmn61;
	}
	
	@NotNull(message="pmn62不能为空")
	public Double getPmn62() {
		return pmn62;
	}

	public void setPmn62(Double pmn62) {
		this.pmn62 = pmn62;
	}
	
	@Length(min=0, max=1, message="pmn63长度不能超过 1 个字符")
	public String getPmn63() {
		return pmn63;
	}

	public void setPmn63(String pmn63) {
		this.pmn63 = pmn63;
	}
	
	@Length(min=0, max=1, message="pmn64长度不能超过 1 个字符")
	public String getPmn64() {
		return pmn64;
	}

	public void setPmn64(String pmn64) {
		this.pmn64 = pmn64;
	}
	
	@Length(min=0, max=1, message="pmn65长度不能超过 1 个字符")
	public String getPmn65() {
		return pmn65;
	}

	public void setPmn65(String pmn65) {
		this.pmn65 = pmn65;
	}
	
	@Length(min=0, max=10, message="pmn66长度不能超过 10 个字符")
	public String getPmn66() {
		return pmn66;
	}

	public void setPmn66(String pmn66) {
		this.pmn66 = pmn66;
	}
	
	@Length(min=0, max=10, message="pmn67长度不能超过 10 个字符")
	public String getPmn67() {
		return pmn67;
	}

	public void setPmn67(String pmn67) {
		this.pmn67 = pmn67;
	}
	
	@Length(min=0, max=20, message="pmn68长度不能超过 20 个字符")
	public String getPmn68() {
		return pmn68;
	}

	public void setPmn68(String pmn68) {
		this.pmn68 = pmn68;
	}
	
	public Integer getPmn69() {
		return pmn69;
	}

	public void setPmn69(Integer pmn69) {
		this.pmn69 = pmn69;
	}
	
	public Double getPmn70() {
		return pmn70;
	}

	public void setPmn70(Double pmn70) {
		this.pmn70 = pmn70;
	}
	
	@Length(min=0, max=20, message="pmn71长度不能超过 20 个字符")
	public String getPmn71() {
		return pmn71;
	}

	public void setPmn71(String pmn71) {
		this.pmn71 = pmn71;
	}
	
	@Length(min=0, max=4, message="pmn80长度不能超过 4 个字符")
	public String getPmn80() {
		return pmn80;
	}

	public void setPmn80(String pmn80) {
		this.pmn80 = pmn80;
	}
	
	public Double getPmn81() {
		return pmn81;
	}

	public void setPmn81(Double pmn81) {
		this.pmn81 = pmn81;
	}
	
	public Double getPmn82() {
		return pmn82;
	}

	public void setPmn82(Double pmn82) {
		this.pmn82 = pmn82;
	}
	
	@Length(min=0, max=4, message="pmn83长度不能超过 4 个字符")
	public String getPmn83() {
		return pmn83;
	}

	public void setPmn83(String pmn83) {
		this.pmn83 = pmn83;
	}
	
	public Double getPmn84() {
		return pmn84;
	}

	public void setPmn84(Double pmn84) {
		this.pmn84 = pmn84;
	}
	
	public Double getPmn85() {
		return pmn85;
	}

	public void setPmn85(Double pmn85) {
		this.pmn85 = pmn85;
	}
	
	@Length(min=0, max=4, message="pmn86长度不能超过 4 个字符")
	public String getPmn86() {
		return pmn86;
	}

	public void setPmn86(String pmn86) {
		this.pmn86 = pmn86;
	}
	
	public Double getPmn87() {
		return pmn87;
	}

	public void setPmn87(Double pmn87) {
		this.pmn87 = pmn87;
	}
	
	public Double getPmn88() {
		return pmn88;
	}

	public void setPmn88(Double pmn88) {
		this.pmn88 = pmn88;
	}
	
	public Double getPmn88t() {
		return pmn88t;
	}

	public void setPmn88t(Double pmn88t) {
		this.pmn88t = pmn88t;
	}
	
	@Length(min=0, max=10, message="pmn930长度不能超过 10 个字符")
	public String getPmn930() {
		return pmn930;
	}

	public void setPmn930(String pmn930) {
		this.pmn930 = pmn930;
	}
	
	@Length(min=0, max=24, message="pmn401长度不能超过 24 个字符")
	public String getPmn401() {
		return pmn401;
	}

	public void setPmn401(String pmn401) {
		this.pmn401 = pmn401;
	}
	
	public Double getPmn90() {
		return pmn90;
	}

	public void setPmn90(Double pmn90) {
		this.pmn90 = pmn90;
	}
	
	@Length(min=0, max=16, message="pmn94长度不能超过 16 个字符")
	public String getPmn94() {
		return pmn94;
	}

	public void setPmn94(String pmn94) {
		this.pmn94 = pmn94;
	}
	
	public Integer getPmn95() {
		return pmn95;
	}

	public void setPmn95(Integer pmn95) {
		this.pmn95 = pmn95;
	}
	
	@Length(min=0, max=30, message="pmn96长度不能超过 30 个字符")
	public String getPmn96() {
		return pmn96;
	}

	public void setPmn96(String pmn96) {
		this.pmn96 = pmn96;
	}
	
	@Length(min=0, max=4, message="pmn97长度不能超过 4 个字符")
	public String getPmn97() {
		return pmn97;
	}

	public void setPmn97(String pmn97) {
		this.pmn97 = pmn97;
	}
	
	@Length(min=0, max=10, message="pmn98长度不能超过 10 个字符")
	public String getPmn98() {
		return pmn98;
	}

	public void setPmn98(String pmn98) {
		this.pmn98 = pmn98;
	}
	
	@Length(min=0, max=10, message="pmn91长度不能超过 10 个字符")
	public String getPmn91() {
		return pmn91;
	}

	public void setPmn91(String pmn91) {
		this.pmn91 = pmn91;
	}
	
	@Length(min=0, max=255, message="pmnud01长度不能超过 255 个字符")
	public String getPmnud01() {
		return pmnud01;
	}

	public void setPmnud01(String pmnud01) {
		this.pmnud01 = pmnud01;
	}
	
	@Length(min=0, max=40, message="pmnud02长度不能超过 40 个字符")
	public String getPmnud02() {
		return pmnud02;
	}

	public void setPmnud02(String pmnud02) {
		this.pmnud02 = pmnud02;
	}
	
	@Length(min=0, max=40, message="pmnud03长度不能超过 40 个字符")
	public String getPmnud03() {
		return pmnud03;
	}

	public void setPmnud03(String pmnud03) {
		this.pmnud03 = pmnud03;
	}
	
	@Length(min=0, max=40, message="pmnud04长度不能超过 40 个字符")
	public String getPmnud04() {
		return pmnud04;
	}

	public void setPmnud04(String pmnud04) {
		this.pmnud04 = pmnud04;
	}
	
	@Length(min=0, max=40, message="pmnud05长度不能超过 40 个字符")
	public String getPmnud05() {
		return pmnud05;
	}

	public void setPmnud05(String pmnud05) {
		this.pmnud05 = pmnud05;
	}
	
	@Length(min=0, max=40, message="pmnud06长度不能超过 40 个字符")
	public String getPmnud06() {
		return pmnud06;
	}

	public void setPmnud06(String pmnud06) {
		this.pmnud06 = pmnud06;
	}
	
	public Double getPmnud07() {
		return pmnud07;
	}

	public void setPmnud07(Double pmnud07) {
		this.pmnud07 = pmnud07;
	}
	
	public Double getPmnud08() {
		return pmnud08;
	}

	public void setPmnud08(Double pmnud08) {
		this.pmnud08 = pmnud08;
	}
	
	public Double getPmnud09() {
		return pmnud09;
	}

	public void setPmnud09(Double pmnud09) {
		this.pmnud09 = pmnud09;
	}
	
	public Integer getPmnud10() {
		return pmnud10;
	}

	public void setPmnud10(Integer pmnud10) {
		this.pmnud10 = pmnud10;
	}
	
	public Integer getPmnud11() {
		return pmnud11;
	}

	public void setPmnud11(Integer pmnud11) {
		this.pmnud11 = pmnud11;
	}
	
	public Integer getPmnud12() {
		return pmnud12;
	}

	public void setPmnud12(Integer pmnud12) {
		this.pmnud12 = pmnud12;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPmnud13() {
		return pmnud13;
	}

	public void setPmnud13(Date pmnud13) {
		this.pmnud13 = pmnud13;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPmnud14() {
		return pmnud14;
	}

	public void setPmnud14(Date pmnud14) {
		this.pmnud14 = pmnud14;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPmnud15() {
		return pmnud15;
	}

	public void setPmnud15(Date pmnud15) {
		this.pmnud15 = pmnud15;
	}
	
	@Length(min=0, max=1, message="pmn89长度不能超过 1 个字符")
	public String getPmn89() {
		return pmn89;
	}

	public void setPmn89(String pmn89) {
		this.pmn89 = pmn89;
	}
	
	@Length(min=0, max=40, message="pmn72长度不能超过 40 个字符")
	public String getPmn72() {
		return pmn72;
	}

	public void setPmn72(String pmn72) {
		this.pmn72 = pmn72;
	}
	
	@NotBlank(message="pmn73不能为空")
	@Length(min=0, max=1, message="pmn73长度不能超过 1 个字符")
	public String getPmn73() {
		return pmn73;
	}

	public void setPmn73(String pmn73) {
		this.pmn73 = pmn73;
	}
	
	@Length(min=0, max=20, message="pmn74长度不能超过 20 个字符")
	public String getPmn74() {
		return pmn74;
	}

	public void setPmn74(String pmn74) {
		this.pmn74 = pmn74;
	}
	
	@Length(min=0, max=20, message="pmn75长度不能超过 20 个字符")
	public String getPmn75() {
		return pmn75;
	}

	public void setPmn75(String pmn75) {
		this.pmn75 = pmn75;
	}
	
	public Integer getPmn76() {
		return pmn76;
	}

	public void setPmn76(Integer pmn76) {
		this.pmn76 = pmn76;
	}
	
	@Length(min=0, max=10, message="pmn77长度不能超过 10 个字符")
	public String getPmn77() {
		return pmn77;
	}

	public void setPmn77(String pmn77) {
		this.pmn77 = pmn77;
	}
	
	@NotBlank(message="pmnplant不能为空")
	@Length(min=0, max=10, message="pmnplant长度不能超过 10 个字符")
	public String getPmnplant() {
		return pmnplant;
	}

	public void setPmnplant(String pmnplant) {
		this.pmnplant = pmnplant;
	}
	
	@NotBlank(message="pmnlegal不能为空")
	@Length(min=0, max=10, message="pmnlegal长度不能超过 10 个字符")
	public String getPmnlegal() {
		return pmnlegal;
	}

	public void setPmnlegal(String pmnlegal) {
		this.pmnlegal = pmnlegal;
	}
	
	@Length(min=0, max=10, message="pmn012长度不能超过 10 个字符")
	public String getPmn012() {
		return pmn012;
	}

	public void setPmn012(String pmn012) {
		this.pmn012 = pmn012;
	}
	
	@Length(min=0, max=50, message="pmn919长度不能超过 50 个字符")
	public String getPmn919() {
		return pmn919;
	}

	public void setPmn919(String pmn919) {
		this.pmn919 = pmn919;
	}
	
	@Length(min=0, max=15, message="pmn99长度不能超过 15 个字符")
	public String getPmn99() {
		return pmn99;
	}

	public void setPmn99(String pmn99) {
		this.pmn99 = pmn99;
	}
	
	@Length(min=0, max=6, message="pmn78长度不能超过 6 个字符")
	public String getPmn78() {
		return pmn78;
	}

	public void setPmn78(String pmn78) {
		this.pmn78 = pmn78;
	}
	
	@Length(min=0, max=1, message="del_flag长度不能超过 1 个字符")
	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	
}