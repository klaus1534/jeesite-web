/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.pmc.entity;

import org.hibernate.validator.constraints.Length;
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
 * 供应商基本资料表Entity
 * @author LJJ
 * @version 2018-07-25
 */
@Table(name="pmc_file", alias="a", columns={
		@Column(name="pmc01", attrName="pmc01", label="供应厂商编号", isPK=true),
		@Column(name="pmc02", attrName="pmc02", label="厂商分类"),
		@Column(name="pmc03", attrName="pmc03", label="简称", queryType=QueryType.LIKE),
		@Column(name="pmc04", attrName="pmc04", label="付款厂商编号"),
		@Column(name="pmc05", attrName="pmc05", label="交易状况"),
		@Column(name="pmc06", attrName="pmc06", label="pmc06"),
		@Column(name="pmc07", attrName="pmc07", label="pmc07"),
		@Column(name="pmc081", attrName="pmc081", label="全名 ", comment="全名 (第一行)"),
		@Column(name="pmc082", attrName="pmc082", label="全名 ", comment="全名 (第二行)"),
		@Column(name="pmc091", attrName="pmc091", label="地址", comment="地址(第一行)"),
		@Column(name="pmc092", attrName="pmc092", label="地址", comment="地址(第二行)"),
		@Column(name="pmc093", attrName="pmc093", label="pmc093"),
		@Column(name="pmc094", attrName="pmc094", label="pmc094"),
		@Column(name="pmc095", attrName="pmc095", label="pmc095"),
		@Column(name="pmc10", attrName="pmc10", label="电话号码"),
		@Column(name="pmc11", attrName="pmc11", label="传真号码"),
		@Column(name="pmc12", attrName="pmc12", label="pmc12"),
		@Column(name="pmc13", attrName="pmc13", label="pmc13"),
		@Column(name="pmc14", attrName="pmc14", label="资料性质"),
		@Column(name="pmc15", attrName="pmc15", label="送货地址"),
		@Column(name="pmc16", attrName="pmc16", label="pmc16"),
		@Column(name="pmc17", attrName="pmc17", label="付款方式"),
		@Column(name="pmc18", attrName="pmc18", label="pmc18"),
		@Column(name="pmc19", attrName="pmc19", label="pmc19"),
		@Column(name="pmc20", attrName="pmc20", label="pmc20"),
		@Column(name="pmc21", attrName="pmc21", label="pmc21"),
		@Column(name="pmc22", attrName="pmc22", label="pmc22"),
		@Column(name="pmc23", attrName="pmc23", label="pmc23"),
		@Column(name="pmc24", attrName="pmc24", label="pmc24"),
		@Column(name="pmc25", attrName="pmc25", label="pmc25"),
		@Column(name="pmc26", attrName="pmc26", label="pmc26"),
		@Column(name="pmc27", attrName="pmc27", label="pmc27"),
		@Column(name="pmc28", attrName="pmc28", label="pmc28"),
		@Column(name="pmc30", attrName="pmc30", label="厂商性质"),
		@Column(name="pmc40", attrName="pmc40", label="pmc40"),
		@Column(name="pmc41", attrName="pmc41", label="pmc41"),
		@Column(name="pmc42", attrName="pmc42", label="pmc42"),
		@Column(name="pmc43", attrName="pmc43", label="pmc43"),
		@Column(name="pmc44", attrName="pmc44", label="pmc44"),
		@Column(name="pmc45", attrName="pmc45", label="pmc45"),
		@Column(name="pmc46", attrName="pmc46", label="pmc46"),
		@Column(name="pmc47", attrName="pmc47", label="惯用税别"),
		@Column(name="pmc48", attrName="pmc48", label="pmc48"),
		@Column(name="pmc49", attrName="pmc49", label="惯用价格条件"),
		@Column(name="pmc50", attrName="pmc50", label="pmc50"),
		@Column(name="pmc51", attrName="pmc51", label="pmc51"),
		@Column(name="pmc52", attrName="pmc52", label="pmc52"),
		@Column(name="pmc53", attrName="pmc53", label="pmc53"),
		@Column(name="pmc54", attrName="pmc54", label="pmc54"),
		@Column(name="pmc55", attrName="pmc55", label="pmc55"),
		@Column(name="pmc56", attrName="pmc56", label="pmc56"),
		@Column(name="pmc901", attrName="pmc901", label="pmc901"),
		@Column(name="pmc902", attrName="pmc902", label="pmc902"),
		@Column(name="pmc903", attrName="pmc903", label="pmc903"),
		@Column(name="pmc904", attrName="pmc904", label="pmc904"),
		@Column(name="pmc905", attrName="pmc905", label="pmc905"),
		@Column(name="pmc906", attrName="pmc906", label="pmc906"),
		@Column(name="pmc907", attrName="pmc907", label="pmc907"),
		@Column(name="pmc908", attrName="pmc908", label="pmc908"),
		@Column(name="pmc909", attrName="pmc909", label="pmc909"),
		@Column(name="pmc910", attrName="pmc910", label="pmc910"),
		@Column(name="pmc911", attrName="pmc911", label="pmc911"),
		@Column(name="pmcacti", attrName="pmcacti", label="资料有效码"),
		@Column(name="pmcuser", attrName="pmcuser", label="pmcuser"),
		@Column(name="pmcgrup", attrName="pmcgrup", label="pmcgrup"),
		@Column(name="pmcmodu", attrName="pmcmodu", label="pmcmodu"),
		@Column(name="pmcdate", attrName="pmcdate", label="pmcdate"),
		@Column(name="pmcud01", attrName="pmcud01", label="pmcud01"),
		@Column(name="pmcud02", attrName="pmcud02", label="pmcud02"),
		@Column(name="pmcud03", attrName="pmcud03", label="pmcud03"),
		@Column(name="pmcud04", attrName="pmcud04", label="pmcud04"),
		@Column(name="pmcud05", attrName="pmcud05", label="pmcud05"),
		@Column(name="pmcud06", attrName="pmcud06", label="pmcud06"),
		@Column(name="pmcud07", attrName="pmcud07", label="pmcud07"),
		@Column(name="pmcud08", attrName="pmcud08", label="pmcud08"),
		@Column(name="pmcud09", attrName="pmcud09", label="pmcud09"),
		@Column(name="pmcud10", attrName="pmcud10", label="pmcud10"),
		@Column(name="pmcud11", attrName="pmcud11", label="pmcud11"),
		@Column(name="pmcud12", attrName="pmcud12", label="pmcud12"),
		@Column(name="pmcud13", attrName="pmcud13", label="pmcud13"),
		@Column(name="pmcud14", attrName="pmcud14", label="pmcud14"),
		@Column(name="pmcud15", attrName="pmcud15", label="pmcud15"),
		@Column(name="pmc912", attrName="pmc912", label="pmc912"),
		@Column(name="pmc1912", attrName="pmc1912", label="pmc1912"),
		@Column(name="pmc1913", attrName="pmc1913", label="pmc1913"),
		@Column(name="pmc1914", attrName="pmc1914", label="pmc1914"),
		@Column(name="pmc1915", attrName="pmc1915", label="pmc1915"),
		@Column(name="pmc1916", attrName="pmc1916", label="负责人", queryType=QueryType.LIKE),
		@Column(name="pmc1917", attrName="pmc1917", label="pmc1917"),
		@Column(name="pmc1918", attrName="pmc1918", label="pmc1918"),
		@Column(name="pmc1919", attrName="pmc1919", label="pmc1919"),
		@Column(name="pmc1920", attrName="pmc1920", label="pmc1920"),
		@Column(name="pmc1921", attrName="pmc1921", label="pmc1921"),
		@Column(name="pmc913", attrName="pmc913", label="pmc913"),
		@Column(name="pmc281", attrName="pmc281", label="pmc281"),
		@Column(name="pmc914", attrName="pmc914", label="pmc914"),
		@Column(name="pmc915", attrName="pmc915", label="pmc915"),
		@Column(name="pmc916", attrName="pmc916", label="pmc916"),
		@Column(name="pmc917", attrName="pmc917", label="pmc917"),
		@Column(name="pmc918", attrName="pmc918", label="pmc918"),
		@Column(name="pmc919", attrName="pmc919", label="pmc919"),
		@Column(name="pmc920", attrName="pmc920", label="pmc920"),
		@Column(name="pmc921", attrName="pmc921", label="pmc921"),
		@Column(name="pmc922", attrName="pmc922", label="pmc922"),
		@Column(name="pmc923", attrName="pmc923", label="pmc923"),
		@Column(name="pmc57", attrName="pmc57", label="pmc57"),
		@Column(name="pmc58", attrName="pmc58", label="pmc58"),
		@Column(name="pmc59", attrName="pmc59", label="pmc59"),
		@Column(name="pmc60", attrName="pmc60", label="pmc60"),
		@Column(name="pmc930", attrName="pmc930", label="对应营运中心代码"),
		@Column(name="pmccrat", attrName="pmccrat", label="pmccrat"),
		@Column(name="pmcoriu", attrName="pmcoriu", label="pmcoriu"),
		@Column(name="pmcorig", attrName="pmcorig", label="pmcorig"),
		@Column(name="pmc29", attrName="pmc29", label="pmc29"),
		@Column(includeEntity=DataEntity.class),
		@Column(name="del_flag", attrName="delFlag", label="del_flag"),
	}, orderBy="a.update_date DESC"
)
public class PmcFile extends DataEntity<PmcFile> {
	
	private static final long serialVersionUID = 1L;
	private String pmc01;		// 供应厂商编号
	private String pmc02;		// 厂商分类
	private String pmc03;		// 简称
	private String pmc04;		// 付款厂商编号
	private String pmc05;		// 交易状况
	private String pmc06;		// pmc06
	private String pmc07;		// pmc07
	private String pmc081;		// 全名 (第一行)
	private String pmc082;		// 全名 (第二行)
	private String pmc091;		// 地址(第一行)
	private String pmc092;		// 地址(第二行)
	private String pmc093;		// pmc093
	private String pmc094;		// pmc094
	private String pmc095;		// pmc095
	private String pmc10;		// 电话号码
	private String pmc11;		// 传真号码
	private String pmc12;		// pmc12
	private String pmc13;		// pmc13
	private String pmc14;		// 资料性质
	private String pmc15;		// 送货地址
	private String pmc16;		// pmc16
	private String pmc17;		// 付款方式
	private String pmc18;		// pmc18
	private String pmc19;		// pmc19
	private String pmc20;		// pmc20
	private String pmc21;		// pmc21
	private String pmc22;		// pmc22
	private String pmc23;		// pmc23
	private String pmc24;		// pmc24
	private String pmc25;		// pmc25
	private String pmc26;		// pmc26
	private String pmc27;		// pmc27
	private Integer pmc28;		// pmc28
	private String pmc30;		// 厂商性质
	private Date pmc40;		// pmc40
	private Date pmc41;		// pmc41
	private Date pmc42;		// pmc42
	private Date pmc43;		// pmc43
	private Date pmc44;		// pmc44
	private Double pmc45;		// pmc45
	private Double pmc46;		// pmc46
	private String pmc47;		// 惯用税别
	private String pmc48;		// pmc48
	private String pmc49;		// 惯用价格条件
	private Integer pmc50;		// pmc50
	private Integer pmc51;		// pmc51
	private String pmc52;		// pmc52
	private String pmc53;		// pmc53
	private String pmc54;		// pmc54
	private String pmc55;		// pmc55
	private String pmc56;		// pmc56
	private String pmc901;		// pmc901
	private String pmc902;		// pmc902
	private String pmc903;		// pmc903
	private String pmc904;		// pmc904
	private String pmc905;		// pmc905
	private String pmc906;		// pmc906
	private String pmc907;		// pmc907
	private String pmc908;		// pmc908
	private String pmc909;		// pmc909
	private String pmc910;		// pmc910
	private String pmc911;		// pmc911
	private String pmcacti;		// 资料有效码
	private String pmcuser;		// pmcuser
	private String pmcgrup;		// pmcgrup
	private String pmcmodu;		// pmcmodu
	private Date pmcdate;		// pmcdate
	private String pmcud01;		// pmcud01
	private String pmcud02;		// pmcud02
	private String pmcud03;		// pmcud03
	private String pmcud04;		// pmcud04
	private String pmcud05;		// pmcud05
	private String pmcud06;		// pmcud06
	private Double pmcud07;		// pmcud07
	private Double pmcud08;		// pmcud08
	private Double pmcud09;		// pmcud09
	private Integer pmcud10;		// pmcud10
	private Integer pmcud11;		// pmcud11
	private Integer pmcud12;		// pmcud12
	private Date pmcud13;		// pmcud13
	private Date pmcud14;		// pmcud14
	private Date pmcud15;		// pmcud15
	private String pmc912;		// pmc912
	private String pmc1912;		// pmc1912
	private String pmc1913;		// pmc1913
	private String pmc1914;		// pmc1914
	private String pmc1915;		// pmc1915
	private String pmc1916;		// 负责人
	private String pmc1917;		// pmc1917
	private Double pmc1918;		// pmc1918
	private String pmc1919;		// pmc1919
	private String pmc1920;		// pmc1920
	private Integer pmc1921;		// pmc1921
	private String pmc913;		// pmc913
	private String pmc281;		// pmc281
	private String pmc914;		// pmc914
	private String pmc915;		// pmc915
	private String pmc916;		// pmc916
	private String pmc917;		// pmc917
	private String pmc918;		// pmc918
	private String pmc919;		// pmc919
	private String pmc920;		// pmc920
	private String pmc921;		// pmc921
	private String pmc922;		// pmc922
	private String pmc923;		// pmc923
	private String pmc57;		// pmc57
	private Integer pmc58;		// pmc58
	private String pmc59;		// pmc59
	private String pmc60;		// pmc60
	private String pmc930;		// 对应营运中心代码
	private Date pmccrat;		// pmccrat
	private String pmcoriu;		// pmcoriu
	private String pmcorig;		// pmcorig
	private Integer pmc29;		// pmc29
	private String delFlag;		// del_flag


	public PmcFile() {
		this(null);
	}

	public PmcFile(String id){
		super(id);
	}
	
	public String getPmc01() {
		return pmc01;
	}

	public void setPmc01(String pmc01) {
		this.pmc01 = pmc01;
	}
	
	@Length(min=0, max=10, message="厂商分类长度不能超过 10 个字符")
	public String getPmc02() {
		return pmc02;
	}

	public void setPmc02(String pmc02) {
		this.pmc02 = pmc02;
	}
	
	@Length(min=0, max=40, message="简称长度不能超过 40 个字符")
	public String getPmc03() {
		return pmc03;
	}

	public void setPmc03(String pmc03) {
		this.pmc03 = pmc03;
	}
	
	@Length(min=0, max=10, message="付款厂商编号长度不能超过 10 个字符")
	public String getPmc04() {
		return pmc04;
	}

	public void setPmc04(String pmc04) {
		this.pmc04 = pmc04;
	}
	
	@Length(min=0, max=1, message="交易状况长度不能超过 1 个字符")
	public String getPmc05() {
		return pmc05;
	}

	public void setPmc05(String pmc05) {
		this.pmc05 = pmc05;
	}
	
	@Length(min=0, max=10, message="pmc06长度不能超过 10 个字符")
	public String getPmc06() {
		return pmc06;
	}

	public void setPmc06(String pmc06) {
		this.pmc06 = pmc06;
	}
	
	@Length(min=0, max=10, message="pmc07长度不能超过 10 个字符")
	public String getPmc07() {
		return pmc07;
	}

	public void setPmc07(String pmc07) {
		this.pmc07 = pmc07;
	}
	
	@Length(min=0, max=80, message="全名 长度不能超过 80 个字符")
	public String getPmc081() {
		return pmc081;
	}

	public void setPmc081(String pmc081) {
		this.pmc081 = pmc081;
	}
	
	@Length(min=0, max=80, message="全名 长度不能超过 80 个字符")
	public String getPmc082() {
		return pmc082;
	}

	public void setPmc082(String pmc082) {
		this.pmc082 = pmc082;
	}
	
	@Length(min=0, max=255, message="地址长度不能超过 255 个字符")
	public String getPmc091() {
		return pmc091;
	}

	public void setPmc091(String pmc091) {
		this.pmc091 = pmc091;
	}
	
	@Length(min=0, max=255, message="地址长度不能超过 255 个字符")
	public String getPmc092() {
		return pmc092;
	}

	public void setPmc092(String pmc092) {
		this.pmc092 = pmc092;
	}
	
	@Length(min=0, max=255, message="pmc093长度不能超过 255 个字符")
	public String getPmc093() {
		return pmc093;
	}

	public void setPmc093(String pmc093) {
		this.pmc093 = pmc093;
	}
	
	@Length(min=0, max=255, message="pmc094长度不能超过 255 个字符")
	public String getPmc094() {
		return pmc094;
	}

	public void setPmc094(String pmc094) {
		this.pmc094 = pmc094;
	}
	
	@Length(min=0, max=255, message="pmc095长度不能超过 255 个字符")
	public String getPmc095() {
		return pmc095;
	}

	public void setPmc095(String pmc095) {
		this.pmc095 = pmc095;
	}
	
	@Length(min=0, max=40, message="电话号码长度不能超过 40 个字符")
	public String getPmc10() {
		return pmc10;
	}

	public void setPmc10(String pmc10) {
		this.pmc10 = pmc10;
	}
	
	@Length(min=0, max=40, message="传真号码长度不能超过 40 个字符")
	public String getPmc11() {
		return pmc11;
	}

	public void setPmc11(String pmc11) {
		this.pmc11 = pmc11;
	}
	
	@Length(min=0, max=40, message="pmc12长度不能超过 40 个字符")
	public String getPmc12() {
		return pmc12;
	}

	public void setPmc12(String pmc12) {
		this.pmc12 = pmc12;
	}
	
	@Length(min=0, max=1, message="pmc13长度不能超过 1 个字符")
	public String getPmc13() {
		return pmc13;
	}

	public void setPmc13(String pmc13) {
		this.pmc13 = pmc13;
	}
	
	@Length(min=0, max=1, message="资料性质长度不能超过 1 个字符")
	public String getPmc14() {
		return pmc14;
	}

	public void setPmc14(String pmc14) {
		this.pmc14 = pmc14;
	}
	
	@Length(min=0, max=10, message="送货地址长度不能超过 10 个字符")
	public String getPmc15() {
		return pmc15;
	}

	public void setPmc15(String pmc15) {
		this.pmc15 = pmc15;
	}
	
	@Length(min=0, max=10, message="pmc16长度不能超过 10 个字符")
	public String getPmc16() {
		return pmc16;
	}

	public void setPmc16(String pmc16) {
		this.pmc16 = pmc16;
	}
	
	@Length(min=0, max=10, message="付款方式长度不能超过 10 个字符")
	public String getPmc17() {
		return pmc17;
	}

	public void setPmc17(String pmc17) {
		this.pmc17 = pmc17;
	}
	
	@Length(min=0, max=1, message="pmc18长度不能超过 1 个字符")
	public String getPmc18() {
		return pmc18;
	}

	public void setPmc18(String pmc18) {
		this.pmc18 = pmc18;
	}
	
	@Length(min=0, max=1, message="pmc19长度不能超过 1 个字符")
	public String getPmc19() {
		return pmc19;
	}

	public void setPmc19(String pmc19) {
		this.pmc19 = pmc19;
	}
	
	@Length(min=0, max=1, message="pmc20长度不能超过 1 个字符")
	public String getPmc20() {
		return pmc20;
	}

	public void setPmc20(String pmc20) {
		this.pmc20 = pmc20;
	}
	
	@Length(min=0, max=1, message="pmc21长度不能超过 1 个字符")
	public String getPmc21() {
		return pmc21;
	}

	public void setPmc21(String pmc21) {
		this.pmc21 = pmc21;
	}
	
	@Length(min=0, max=4, message="pmc22长度不能超过 4 个字符")
	public String getPmc22() {
		return pmc22;
	}

	public void setPmc22(String pmc22) {
		this.pmc22 = pmc22;
	}
	
	@Length(min=0, max=1, message="pmc23长度不能超过 1 个字符")
	public String getPmc23() {
		return pmc23;
	}

	public void setPmc23(String pmc23) {
		this.pmc23 = pmc23;
	}
	
	@Length(min=0, max=20, message="pmc24长度不能超过 20 个字符")
	public String getPmc24() {
		return pmc24;
	}

	public void setPmc24(String pmc24) {
		this.pmc24 = pmc24;
	}
	
	@Length(min=0, max=2, message="pmc25长度不能超过 2 个字符")
	public String getPmc25() {
		return pmc25;
	}

	public void setPmc25(String pmc25) {
		this.pmc25 = pmc25;
	}
	
	@Length(min=0, max=24, message="pmc26长度不能超过 24 个字符")
	public String getPmc26() {
		return pmc26;
	}

	public void setPmc26(String pmc26) {
		this.pmc26 = pmc26;
	}
	
	@Length(min=0, max=1, message="pmc27长度不能超过 1 个字符")
	public String getPmc27() {
		return pmc27;
	}

	public void setPmc27(String pmc27) {
		this.pmc27 = pmc27;
	}
	
	public Integer getPmc28() {
		return pmc28;
	}

	public void setPmc28(Integer pmc28) {
		this.pmc28 = pmc28;
	}
	
	@Length(min=0, max=1, message="厂商性质长度不能超过 1 个字符")
	public String getPmc30() {
		return pmc30;
	}

	public void setPmc30(String pmc30) {
		this.pmc30 = pmc30;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPmc40() {
		return pmc40;
	}

	public void setPmc40(Date pmc40) {
		this.pmc40 = pmc40;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPmc41() {
		return pmc41;
	}

	public void setPmc41(Date pmc41) {
		this.pmc41 = pmc41;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPmc42() {
		return pmc42;
	}

	public void setPmc42(Date pmc42) {
		this.pmc42 = pmc42;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPmc43() {
		return pmc43;
	}

	public void setPmc43(Date pmc43) {
		this.pmc43 = pmc43;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPmc44() {
		return pmc44;
	}

	public void setPmc44(Date pmc44) {
		this.pmc44 = pmc44;
	}
	
	public Double getPmc45() {
		return pmc45;
	}

	public void setPmc45(Double pmc45) {
		this.pmc45 = pmc45;
	}
	
	public Double getPmc46() {
		return pmc46;
	}

	public void setPmc46(Double pmc46) {
		this.pmc46 = pmc46;
	}
	
	@Length(min=0, max=4, message="惯用税别长度不能超过 4 个字符")
	public String getPmc47() {
		return pmc47;
	}

	public void setPmc47(String pmc47) {
		this.pmc47 = pmc47;
	}
	
	@Length(min=0, max=1, message="pmc48长度不能超过 1 个字符")
	public String getPmc48() {
		return pmc48;
	}

	public void setPmc48(String pmc48) {
		this.pmc48 = pmc48;
	}
	
	@Length(min=0, max=20, message="惯用价格条件长度不能超过 20 个字符")
	public String getPmc49() {
		return pmc49;
	}

	public void setPmc49(String pmc49) {
		this.pmc49 = pmc49;
	}
	
	public Integer getPmc50() {
		return pmc50;
	}

	public void setPmc50(Integer pmc50) {
		this.pmc50 = pmc50;
	}
	
	public Integer getPmc51() {
		return pmc51;
	}

	public void setPmc51(Integer pmc51) {
		this.pmc51 = pmc51;
	}
	
	@Length(min=0, max=255, message="pmc52长度不能超过 255 个字符")
	public String getPmc52() {
		return pmc52;
	}

	public void setPmc52(String pmc52) {
		this.pmc52 = pmc52;
	}
	
	@Length(min=0, max=255, message="pmc53长度不能超过 255 个字符")
	public String getPmc53() {
		return pmc53;
	}

	public void setPmc53(String pmc53) {
		this.pmc53 = pmc53;
	}
	
	@Length(min=0, max=10, message="pmc54长度不能超过 10 个字符")
	public String getPmc54() {
		return pmc54;
	}

	public void setPmc54(String pmc54) {
		this.pmc54 = pmc54;
	}
	
	@Length(min=0, max=20, message="pmc55长度不能超过 20 个字符")
	public String getPmc55() {
		return pmc55;
	}

	public void setPmc55(String pmc55) {
		this.pmc55 = pmc55;
	}
	
	@Length(min=0, max=30, message="pmc56长度不能超过 30 个字符")
	public String getPmc56() {
		return pmc56;
	}

	public void setPmc56(String pmc56) {
		this.pmc56 = pmc56;
	}
	
	@Length(min=0, max=10, message="pmc901长度不能超过 10 个字符")
	public String getPmc901() {
		return pmc901;
	}

	public void setPmc901(String pmc901) {
		this.pmc901 = pmc901;
	}
	
	@Length(min=0, max=1, message="pmc902长度不能超过 1 个字符")
	public String getPmc902() {
		return pmc902;
	}

	public void setPmc902(String pmc902) {
		this.pmc902 = pmc902;
	}
	
	@Length(min=0, max=1, message="pmc903长度不能超过 1 个字符")
	public String getPmc903() {
		return pmc903;
	}

	public void setPmc903(String pmc903) {
		this.pmc903 = pmc903;
	}
	
	@Length(min=0, max=10, message="pmc904长度不能超过 10 个字符")
	public String getPmc904() {
		return pmc904;
	}

	public void setPmc904(String pmc904) {
		this.pmc904 = pmc904;
	}
	
	@Length(min=0, max=1, message="pmc905长度不能超过 1 个字符")
	public String getPmc905() {
		return pmc905;
	}

	public void setPmc905(String pmc905) {
		this.pmc905 = pmc905;
	}
	
	@Length(min=0, max=1, message="pmc906长度不能超过 1 个字符")
	public String getPmc906() {
		return pmc906;
	}

	public void setPmc906(String pmc906) {
		this.pmc906 = pmc906;
	}
	
	@Length(min=0, max=1, message="pmc907长度不能超过 1 个字符")
	public String getPmc907() {
		return pmc907;
	}

	public void setPmc907(String pmc907) {
		this.pmc907 = pmc907;
	}
	
	@Length(min=0, max=10, message="pmc908长度不能超过 10 个字符")
	public String getPmc908() {
		return pmc908;
	}

	public void setPmc908(String pmc908) {
		this.pmc908 = pmc908;
	}
	
	@Length(min=0, max=30, message="pmc909长度不能超过 30 个字符")
	public String getPmc909() {
		return pmc909;
	}

	public void setPmc909(String pmc909) {
		this.pmc909 = pmc909;
	}
	
	@Length(min=0, max=30, message="pmc910长度不能超过 30 个字符")
	public String getPmc910() {
		return pmc910;
	}

	public void setPmc910(String pmc910) {
		this.pmc910 = pmc910;
	}
	
	@Length(min=0, max=1, message="pmc911长度不能超过 1 个字符")
	public String getPmc911() {
		return pmc911;
	}

	public void setPmc911(String pmc911) {
		this.pmc911 = pmc911;
	}
	
	@Length(min=0, max=1, message="资料有效码长度不能超过 1 个字符")
	public String getPmcacti() {
		return pmcacti;
	}

	public void setPmcacti(String pmcacti) {
		this.pmcacti = pmcacti;
	}
	
	@Length(min=0, max=10, message="pmcuser长度不能超过 10 个字符")
	public String getPmcuser() {
		return pmcuser;
	}

	public void setPmcuser(String pmcuser) {
		this.pmcuser = pmcuser;
	}
	
	@Length(min=0, max=10, message="pmcgrup长度不能超过 10 个字符")
	public String getPmcgrup() {
		return pmcgrup;
	}

	public void setPmcgrup(String pmcgrup) {
		this.pmcgrup = pmcgrup;
	}
	
	@Length(min=0, max=10, message="pmcmodu长度不能超过 10 个字符")
	public String getPmcmodu() {
		return pmcmodu;
	}

	public void setPmcmodu(String pmcmodu) {
		this.pmcmodu = pmcmodu;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPmcdate() {
		return pmcdate;
	}

	public void setPmcdate(Date pmcdate) {
		this.pmcdate = pmcdate;
	}
	
	@Length(min=0, max=255, message="pmcud01长度不能超过 255 个字符")
	public String getPmcud01() {
		return pmcud01;
	}

	public void setPmcud01(String pmcud01) {
		this.pmcud01 = pmcud01;
	}
	
	@Length(min=0, max=40, message="pmcud02长度不能超过 40 个字符")
	public String getPmcud02() {
		return pmcud02;
	}

	public void setPmcud02(String pmcud02) {
		this.pmcud02 = pmcud02;
	}
	
	@Length(min=0, max=40, message="pmcud03长度不能超过 40 个字符")
	public String getPmcud03() {
		return pmcud03;
	}

	public void setPmcud03(String pmcud03) {
		this.pmcud03 = pmcud03;
	}
	
	@Length(min=0, max=40, message="pmcud04长度不能超过 40 个字符")
	public String getPmcud04() {
		return pmcud04;
	}

	public void setPmcud04(String pmcud04) {
		this.pmcud04 = pmcud04;
	}
	
	@Length(min=0, max=40, message="pmcud05长度不能超过 40 个字符")
	public String getPmcud05() {
		return pmcud05;
	}

	public void setPmcud05(String pmcud05) {
		this.pmcud05 = pmcud05;
	}
	
	@Length(min=0, max=40, message="pmcud06长度不能超过 40 个字符")
	public String getPmcud06() {
		return pmcud06;
	}

	public void setPmcud06(String pmcud06) {
		this.pmcud06 = pmcud06;
	}
	
	public Double getPmcud07() {
		return pmcud07;
	}

	public void setPmcud07(Double pmcud07) {
		this.pmcud07 = pmcud07;
	}
	
	public Double getPmcud08() {
		return pmcud08;
	}

	public void setPmcud08(Double pmcud08) {
		this.pmcud08 = pmcud08;
	}
	
	public Double getPmcud09() {
		return pmcud09;
	}

	public void setPmcud09(Double pmcud09) {
		this.pmcud09 = pmcud09;
	}
	
	public Integer getPmcud10() {
		return pmcud10;
	}

	public void setPmcud10(Integer pmcud10) {
		this.pmcud10 = pmcud10;
	}
	
	public Integer getPmcud11() {
		return pmcud11;
	}

	public void setPmcud11(Integer pmcud11) {
		this.pmcud11 = pmcud11;
	}
	
	public Integer getPmcud12() {
		return pmcud12;
	}

	public void setPmcud12(Integer pmcud12) {
		this.pmcud12 = pmcud12;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPmcud13() {
		return pmcud13;
	}

	public void setPmcud13(Date pmcud13) {
		this.pmcud13 = pmcud13;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPmcud14() {
		return pmcud14;
	}

	public void setPmcud14(Date pmcud14) {
		this.pmcud14 = pmcud14;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPmcud15() {
		return pmcud15;
	}

	public void setPmcud15(Date pmcud15) {
		this.pmcud15 = pmcud15;
	}
	
	@Length(min=0, max=1, message="pmc912长度不能超过 1 个字符")
	public String getPmc912() {
		return pmc912;
	}

	public void setPmc912(String pmc912) {
		this.pmc912 = pmc912;
	}
	
	@Length(min=0, max=10, message="pmc1912长度不能超过 10 个字符")
	public String getPmc1912() {
		return pmc1912;
	}

	public void setPmc1912(String pmc1912) {
		this.pmc1912 = pmc1912;
	}
	
	@Length(min=0, max=10, message="pmc1913长度不能超过 10 个字符")
	public String getPmc1913() {
		return pmc1913;
	}

	public void setPmc1913(String pmc1913) {
		this.pmc1913 = pmc1913;
	}
	
	@Length(min=0, max=10, message="pmc1914长度不能超过 10 个字符")
	public String getPmc1914() {
		return pmc1914;
	}

	public void setPmc1914(String pmc1914) {
		this.pmc1914 = pmc1914;
	}
	
	@Length(min=0, max=10, message="pmc1915长度不能超过 10 个字符")
	public String getPmc1915() {
		return pmc1915;
	}

	public void setPmc1915(String pmc1915) {
		this.pmc1915 = pmc1915;
	}
	
	@Length(min=0, max=10, message="负责人长度不能超过 10 个字符")
	public String getPmc1916() {
		return pmc1916;
	}

	public void setPmc1916(String pmc1916) {
		this.pmc1916 = pmc1916;
	}
	
	@Length(min=0, max=6, message="pmc1917长度不能超过 6 个字符")
	public String getPmc1917() {
		return pmc1917;
	}

	public void setPmc1917(String pmc1917) {
		this.pmc1917 = pmc1917;
	}
	
	public Double getPmc1918() {
		return pmc1918;
	}

	public void setPmc1918(Double pmc1918) {
		this.pmc1918 = pmc1918;
	}
	
	@Length(min=0, max=1, message="pmc1919长度不能超过 1 个字符")
	public String getPmc1919() {
		return pmc1919;
	}

	public void setPmc1919(String pmc1919) {
		this.pmc1919 = pmc1919;
	}
	
	@NotBlank(message="pmc1920不能为空")
	@Length(min=0, max=10, message="pmc1920长度不能超过 10 个字符")
	public String getPmc1920() {
		return pmc1920;
	}

	public void setPmc1920(String pmc1920) {
		this.pmc1920 = pmc1920;
	}
	
	public Integer getPmc1921() {
		return pmc1921;
	}

	public void setPmc1921(Integer pmc1921) {
		this.pmc1921 = pmc1921;
	}
	
	@Length(min=0, max=1, message="pmc913长度不能超过 1 个字符")
	public String getPmc913() {
		return pmc913;
	}

	public void setPmc913(String pmc913) {
		this.pmc913 = pmc913;
	}
	
	@Length(min=0, max=1, message="pmc281长度不能超过 1 个字符")
	public String getPmc281() {
		return pmc281;
	}

	public void setPmc281(String pmc281) {
		this.pmc281 = pmc281;
	}
	
	@Length(min=0, max=1, message="pmc914长度不能超过 1 个字符")
	public String getPmc914() {
		return pmc914;
	}

	public void setPmc914(String pmc914) {
		this.pmc914 = pmc914;
	}
	
	@Length(min=0, max=10, message="pmc915长度不能超过 10 个字符")
	public String getPmc915() {
		return pmc915;
	}

	public void setPmc915(String pmc915) {
		this.pmc915 = pmc915;
	}
	
	@Length(min=0, max=10, message="pmc916长度不能超过 10 个字符")
	public String getPmc916() {
		return pmc916;
	}

	public void setPmc916(String pmc916) {
		this.pmc916 = pmc916;
	}
	
	@Length(min=0, max=10, message="pmc917长度不能超过 10 个字符")
	public String getPmc917() {
		return pmc917;
	}

	public void setPmc917(String pmc917) {
		this.pmc917 = pmc917;
	}
	
	@Length(min=0, max=10, message="pmc918长度不能超过 10 个字符")
	public String getPmc918() {
		return pmc918;
	}

	public void setPmc918(String pmc918) {
		this.pmc918 = pmc918;
	}
	
	@Length(min=0, max=5, message="pmc919长度不能超过 5 个字符")
	public String getPmc919() {
		return pmc919;
	}

	public void setPmc919(String pmc919) {
		this.pmc919 = pmc919;
	}
	
	@Length(min=0, max=5, message="pmc920长度不能超过 5 个字符")
	public String getPmc920() {
		return pmc920;
	}

	public void setPmc920(String pmc920) {
		this.pmc920 = pmc920;
	}
	
	@Length(min=0, max=5, message="pmc921长度不能超过 5 个字符")
	public String getPmc921() {
		return pmc921;
	}

	public void setPmc921(String pmc921) {
		this.pmc921 = pmc921;
	}
	
	@Length(min=0, max=5, message="pmc922长度不能超过 5 个字符")
	public String getPmc922() {
		return pmc922;
	}

	public void setPmc922(String pmc922) {
		this.pmc922 = pmc922;
	}
	
	@Length(min=0, max=5, message="pmc923长度不能超过 5 个字符")
	public String getPmc923() {
		return pmc923;
	}

	public void setPmc923(String pmc923) {
		this.pmc923 = pmc923;
	}
	
	@Length(min=0, max=2, message="pmc57长度不能超过 2 个字符")
	public String getPmc57() {
		return pmc57;
	}

	public void setPmc57(String pmc57) {
		this.pmc57 = pmc57;
	}
	
	public Integer getPmc58() {
		return pmc58;
	}

	public void setPmc58(Integer pmc58) {
		this.pmc58 = pmc58;
	}
	
	@Length(min=0, max=2, message="pmc59长度不能超过 2 个字符")
	public String getPmc59() {
		return pmc59;
	}

	public void setPmc59(String pmc59) {
		this.pmc59 = pmc59;
	}
	
	@Length(min=0, max=8, message="pmc60长度不能超过 8 个字符")
	public String getPmc60() {
		return pmc60;
	}

	public void setPmc60(String pmc60) {
		this.pmc60 = pmc60;
	}
	
	@Length(min=0, max=10, message="对应营运中心代码长度不能超过 10 个字符")
	public String getPmc930() {
		return pmc930;
	}

	public void setPmc930(String pmc930) {
		this.pmc930 = pmc930;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPmccrat() {
		return pmccrat;
	}

	public void setPmccrat(Date pmccrat) {
		this.pmccrat = pmccrat;
	}
	
	@Length(min=0, max=10, message="pmcoriu长度不能超过 10 个字符")
	public String getPmcoriu() {
		return pmcoriu;
	}

	public void setPmcoriu(String pmcoriu) {
		this.pmcoriu = pmcoriu;
	}
	
	@Length(min=0, max=10, message="pmcorig长度不能超过 10 个字符")
	public String getPmcorig() {
		return pmcorig;
	}

	public void setPmcorig(String pmcorig) {
		this.pmcorig = pmcorig;
	}
	
	public Integer getPmc29() {
		return pmc29;
	}

	public void setPmc29(Integer pmc29) {
		this.pmc29 = pmc29;
	}
	
	@NotBlank(message="del_flag不能为空")
	@Length(min=0, max=1, message="del_flag长度不能超过 1 个字符")
	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	
}