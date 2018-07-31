/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.pmm.entity;

import com.jeesite.common.entity.Page;
import com.jeesite.modules.pmc.entity.PmcFile;
import com.jeesite.modules.pmn.entity.PmnFile;
import org.hibernate.validator.constraints.Length;
import java.util.Date;
import java.util.List;

import com.jeesite.common.mybatis.annotation.JoinTable;
import com.jeesite.common.mybatis.annotation.JoinTable.Type;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.NotBlank;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 采购单单头Entity
 * @author LJJ
 * @version 2018-07-26
 */
@Table(name="pmm_file", alias="a", columns={
		@Column(name="pmm01", attrName="pmm01", label="采购单号", isPK=true),
		@Column(name="pmm02", attrName="pmm02", label="采购类型"),
		@Column(name="pmm03", attrName="pmm03", label="更动序号"),
		@Column(name="pmm04", attrName="pmm04", label="采购日期"),
		@Column(name="pmm05", attrName="pmm05", label="pmm05"),
		@Column(name="pmm06", attrName="pmm06", label="pmm06"),
		@Column(name="pmm07", attrName="pmm07", label="pmm07"),
		@Column(name="pmm08", attrName="pmm08", label="pmm08"),
		@Column(name="pmm09", attrName="pmm09", label="pmm09"),
		@Column(name="pmm10", attrName="pmm10", label="pmm10"),
		@Column(name="pmm11", attrName="pmm11", label="pmm11"),
		@Column(name="pmm12", attrName="pmm12", label="采购员"),
		@Column(name="pmm13", attrName="pmm13", label="pmm13"),
		@Column(name="pmm14", attrName="pmm14", label="pmm14"),
		@Column(name="pmm15", attrName="pmm15", label="pmm15"),
		@Column(name="pmm16", attrName="pmm16", label="pmm16"),
		@Column(name="pmm17", attrName="pmm17", label="pmm17"),
		@Column(name="pmm18", attrName="pmm18", label="pmm18"),
		@Column(name="pmm20", attrName="pmm20", label="付款方式"),
		@Column(name="pmm21", attrName="pmm21", label="税别"),
		@Column(name="pmm22", attrName="pmm22", label="币别"),
		@Column(name="pmm25", attrName="pmm25", label="pmm25"),
		@Column(name="pmm26", attrName="pmm26", label="pmm26"),
		@Column(name="pmm27", attrName="pmm27", label="pmm27"),
		@Column(name="pmm28", attrName="pmm28", label="pmm28"),
		@Column(name="pmm29", attrName="pmm29", label="pmm29"),
		@Column(name="pmm30", attrName="pmm30", label="pmm30"),
		@Column(name="pmm31", attrName="pmm31", label="pmm31"),
		@Column(name="pmm32", attrName="pmm32", label="pmm32"),
		@Column(name="pmm40", attrName="pmm40", label="pmm40"),
		@Column(name="pmm401", attrName="pmm401", label="pmm401"),
		@Column(name="pmm41", attrName="pmm41", label="pmm41"),
		@Column(name="pmm42", attrName="pmm42", label="pmm42"),
		@Column(name="pmm43", attrName="pmm43", label="pmm43"),
		@Column(name="pmm44", attrName="pmm44", label="pmm44"),
		@Column(name="pmm45", attrName="pmm45", label="pmm45"),
		@Column(name="pmm46", attrName="pmm46", label="pmm46"),
		@Column(name="pmm47", attrName="pmm47", label="pmm47"),
		@Column(name="pmm48", attrName="pmm48", label="pmm48"),
		@Column(name="pmm49", attrName="pmm49", label="pmm49"),
		@Column(name="pmm50", attrName="pmm50", label="pmm50"),
		@Column(name="pmm99", attrName="pmm99", label="pmm99"),
		@Column(name="pmm901", attrName="pmm901", label="pmm901"),
		@Column(name="pmm902", attrName="pmm902", label="pmm902"),
		@Column(name="pmm903", attrName="pmm903", label="pmm903"),
		@Column(name="pmm904", attrName="pmm904", label="pmm904"),
		@Column(name="pmm905", attrName="pmm905", label="pmm905"),
		@Column(name="pmm906", attrName="pmm906", label="pmm906"),
		@Column(name="pmm907", attrName="pmm907", label="pmm907"),
		@Column(name="pmm908", attrName="pmm908", label="pmm908"),
		@Column(name="pmm909", attrName="pmm909", label="pmm909"),
		@Column(name="pmm911", attrName="pmm911", label="pmm911"),
		@Column(name="pmm912", attrName="pmm912", label="pmm912"),
		@Column(name="pmm913", attrName="pmm913", label="pmm913"),
		@Column(name="pmm914", attrName="pmm914", label="pmm914"),
		@Column(name="pmm915", attrName="pmm915", label="pmm915"),
		@Column(name="pmm916", attrName="pmm916", label="pmm916"),
		@Column(name="pmmprsw", attrName="pmmprsw", label="pmmprsw"),
		@Column(name="pmmprno", attrName="pmmprno", label="pmmprno"),
		@Column(name="pmmprdt", attrName="pmmprdt", label="pmmprdt"),
		@Column(name="pmmmksg", attrName="pmmmksg", label="pmmmksg"),
		@Column(name="pmmsign", attrName="pmmsign", label="pmmsign"),
		@Column(name="pmmdays", attrName="pmmdays", label="pmmdays"),
		@Column(name="pmmprit", attrName="pmmprit", label="pmmprit"),
		@Column(name="pmmsseq", attrName="pmmsseq", label="pmmsseq"),
		@Column(name="pmmsmax", attrName="pmmsmax", label="pmmsmax"),
		@Column(name="pmmacti", attrName="pmmacti", label="pmmacti"),
		@Column(name="pmmuser", attrName="pmmuser", label="pmmuser"),
		@Column(name="pmmgrup", attrName="pmmgrup", label="pmmgrup"),
		@Column(name="pmmmodu", attrName="pmmmodu", label="pmmmodu"),
		@Column(name="pmmdate", attrName="pmmdate", label="pmmdate"),
		@Column(name="pmm40t", attrName="pmm40t", label="pmm40t"),
		@Column(name="pmmud01", attrName="pmmud01", label="pmmud01"),
		@Column(name="pmmud02", attrName="pmmud02", label="pmmud02"),
		@Column(name="pmmud03", attrName="pmmud03", label="pmmud03"),
		@Column(name="pmmud04", attrName="pmmud04", label="pmmud04"),
		@Column(name="pmmud05", attrName="pmmud05", label="pmmud05"),
		@Column(name="pmmud06", attrName="pmmud06", label="pmmud06"),
		@Column(name="pmmud07", attrName="pmmud07", label="pmmud07"),
		@Column(name="pmmud08", attrName="pmmud08", label="pmmud08"),
		@Column(name="pmmud09", attrName="pmmud09", label="pmmud09"),
		@Column(name="pmmud10", attrName="pmmud10", label="pmmud10"),
		@Column(name="pmmud11", attrName="pmmud11", label="pmmud11"),
		@Column(name="pmmud12", attrName="pmmud12", label="pmmud12"),
		@Column(name="pmmud13", attrName="pmmud13", label="pmmud13"),
		@Column(name="pmmud14", attrName="pmmud14", label="pmmud14"),
		@Column(name="pmmud15", attrName="pmmud15", label="pmmud15"),
		@Column(name="pmm51", attrName="pmm51", label="pmm51"),
		@Column(name="pmm52", attrName="pmm52", label="pmm52"),
		@Column(name="pmm53", attrName="pmm53", label="pmm53"),
		@Column(name="pmmcond", attrName="pmmcond", label="pmmcond"),
		@Column(name="pmmcont", attrName="pmmcont", label="pmmcont"),
		@Column(name="pmmconu", attrName="pmmconu", label="pmmconu"),
		@Column(name="pmmcrat", attrName="pmmcrat", label="pmmcrat"),
		@Column(name="pmmpos", attrName="pmmpos", label="pmmpos"),
		@Column(name="pmmplant", attrName="pmmplant", label="pmmplant"),
		@Column(name="pmmlegal", attrName="pmmlegal", label="pmmlegal"),
		@Column(name="pmmoriu", attrName="pmmoriu", label="pmmoriu"),
		@Column(name="pmmorig", attrName="pmmorig", label="pmmorig"),
		@Column(includeEntity=DataEntity.class),
	}, /*joinTable={
		@JoinTable( type=Type.LEFT_JOIN, entity=PmcFile.class, alias="c",
				on="a.pmm09=c.pmc01 "),}
		,  extWhereKeys="pmc081",*/
		orderBy="a.pmm01 DESC"
)
public class PmmFile extends DataEntity<PmmFile> {
	
	private static final long serialVersionUID = 1L;
	private String pmm01;		// 采购单号
	private String pmm02;		// 采购类型
	private Integer pmm03;		// 更动序号
	private Date pmm04;		// 采购日期
	private String pmm05;		// pmm05
	private String pmm06;		// pmm06
	private String pmm07;		// pmm07
	private String pmm08;		// pmm08
	private String pmm09;		// pmm09
	private String pmm10;		// pmm10
	private String pmm11;		// pmm11
	private String pmm12;		// 采购员
	private String pmm13;		// pmm13
	private String pmm14;		// pmm14
	private String pmm15;		// pmm15
	private String pmm16;		// pmm16
	private String pmm17;		// pmm17
	private String pmm18;		// pmm18
	private String pmm20;		// 付款方式
	private String pmm21;		// 税别
	private String pmm22;		// 币别
	private String pmm25;		// pmm25
	private String pmm26;		// pmm26
	private Date pmm27;		// pmm27
	private String pmm28;		// pmm28
	private String pmm29;		// pmm29
	private String pmm30;		// pmm30
	private Integer pmm31;		// pmm31
	private Integer pmm32;		// pmm32
	private Double pmm40;		// pmm40
	private Double pmm401;		// pmm401
	private String pmm41;		// pmm41
	private Double pmm42;		// pmm42
	private Double pmm43;		// pmm43
	private String pmm44;		// pmm44
	private String pmm45;		// pmm45
	private Integer pmm46;		// pmm46
	private Double pmm47;		// pmm47
	private Double pmm48;		// pmm48
	private String pmm49;		// pmm49
	private String pmm50;		// pmm50
	private String pmm99;		// pmm99
	private String pmm901;		// pmm901
	private String pmm902;		// pmm902
	private String pmm903;		// pmm903
	private String pmm904;		// pmm904
	private String pmm905;		// pmm905
	private String pmm906;		// pmm906
	private String pmm907;		// pmm907
	private Date pmm908;		// pmm908
	private String pmm909;		// pmm909
	private String pmm911;		// pmm911
	private String pmm912;		// pmm912
	private String pmm913;		// pmm913
	private String pmm914;		// pmm914
	private String pmm915;		// pmm915
	private String pmm916;		// pmm916
	private String pmmprsw;		// pmmprsw
	private Integer pmmprno;		// pmmprno
	private Date pmmprdt;		// pmmprdt
	private String pmmmksg;		// pmmmksg
	private String pmmsign;		// pmmsign
	private Integer pmmdays;		// pmmdays
	private Integer pmmprit;		// pmmprit
	private Integer pmmsseq;		// pmmsseq
	private Integer pmmsmax;		// pmmsmax
	private String pmmacti;		// pmmacti
	private String pmmuser;		// pmmuser
	private String pmmgrup;		// pmmgrup
	private String pmmmodu;		// pmmmodu
	private Date pmmdate;		// pmmdate
	private Double pmm40t;		// pmm40t
	private String pmmud01;		// pmmud01
	private String pmmud02;		// pmmud02
	private String pmmud03;		// pmmud03
	private String pmmud04;		// pmmud04
	private String pmmud05;		// pmmud05
	private String pmmud06;		// pmmud06
	private Double pmmud07;		// pmmud07
	private Double pmmud08;		// pmmud08
	private Double pmmud09;		// pmmud09
	private Integer pmmud10;		// pmmud10
	private Integer pmmud11;		// pmmud11
	private Integer pmmud12;		// pmmud12
	private Date pmmud13;		// pmmud13
	private Date pmmud14;		// pmmud14
	private Date pmmud15;		// pmmud15
	private String pmm51;		// pmm51
	private String pmm52;		// pmm52
	private String pmm53;		// pmm53
	private Date pmmcond;		// pmmcond
	private String pmmcont;		// pmmcont
	private String pmmconu;		// pmmconu
	private Date pmmcrat;		// pmmcrat
	private String pmmpos;		// pmmpos
	private String pmmplant;		// pmmplant
	private String pmmlegal;		// pmmlegal
	private String pmmoriu;		// pmmoriu
	private String pmmorig;		// pmmorig
	private String pmc081;//供应商名称
	private List<PmnFile> pmnFile;//采购明细

	public List<PmnFile> getPmnFile() {
		return pmnFile;
	}

	public void setPmnFile(List<PmnFile> pmnFile) {
		this.pmnFile = pmnFile;
	}

	public String getPmc081() {
		return pmc081;
	}

	public void setPmc081(String pmc081) {
		this.pmc081 = pmc081;
	}

	public PmmFile() {
		this(null);
	}

	public PmmFile(String id){
		super(id);
	}
	
	public String getPmm01() {
		return pmm01;
	}

	public void setPmm01(String pmm01) {
		this.pmm01 = pmm01;
	}
	
	@Length(min=0, max=10, message="采购类型长度不能超过 10 个字符")
	public String getPmm02() {
		return pmm02;
	}

	public void setPmm02(String pmm02) {
		this.pmm02 = pmm02;
	}
	
	public Integer getPmm03() {
		return pmm03;
	}

	public void setPmm03(Integer pmm03) {
		this.pmm03 = pmm03;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPmm04() {
		return pmm04;
	}

	public void setPmm04(Date pmm04) {
		this.pmm04 = pmm04;
	}
	
	@Length(min=0, max=10, message="pmm05长度不能超过 10 个字符")
	public String getPmm05() {
		return pmm05;
	}

	public void setPmm05(String pmm05) {
		this.pmm05 = pmm05;
	}
	
	@Length(min=0, max=10, message="pmm06长度不能超过 10 个字符")
	public String getPmm06() {
		return pmm06;
	}

	public void setPmm06(String pmm06) {
		this.pmm06 = pmm06;
	}
	
	@Length(min=0, max=10, message="pmm07长度不能超过 10 个字符")
	public String getPmm07() {
		return pmm07;
	}

	public void setPmm07(String pmm07) {
		this.pmm07 = pmm07;
	}
	
	@Length(min=0, max=20, message="pmm08长度不能超过 20 个字符")
	public String getPmm08() {
		return pmm08;
	}

	public void setPmm08(String pmm08) {
		this.pmm08 = pmm08;
	}
	
	@Length(min=0, max=10, message="pmm09长度不能超过 10 个字符")
	public String getPmm09() {
		return pmm09;
	}

	public void setPmm09(String pmm09) {
		this.pmm09 = pmm09;
	}
	
	@Length(min=0, max=10, message="pmm10长度不能超过 10 个字符")
	public String getPmm10() {
		return pmm10;
	}

	public void setPmm10(String pmm10) {
		this.pmm10 = pmm10;
	}
	
	@Length(min=0, max=10, message="pmm11长度不能超过 10 个字符")
	public String getPmm11() {
		return pmm11;
	}

	public void setPmm11(String pmm11) {
		this.pmm11 = pmm11;
	}
	
	@Length(min=0, max=10, message="采购员长度不能超过 10 个字符")
	public String getPmm12() {
		return pmm12;
	}

	public void setPmm12(String pmm12) {
		this.pmm12 = pmm12;
	}
	
	@Length(min=0, max=10, message="pmm13长度不能超过 10 个字符")
	public String getPmm13() {
		return pmm13;
	}

	public void setPmm13(String pmm13) {
		this.pmm13 = pmm13;
	}
	
	@Length(min=0, max=10, message="pmm14长度不能超过 10 个字符")
	public String getPmm14() {
		return pmm14;
	}

	public void setPmm14(String pmm14) {
		this.pmm14 = pmm14;
	}
	
	@Length(min=0, max=10, message="pmm15长度不能超过 10 个字符")
	public String getPmm15() {
		return pmm15;
	}

	public void setPmm15(String pmm15) {
		this.pmm15 = pmm15;
	}
	
	@Length(min=0, max=10, message="pmm16长度不能超过 10 个字符")
	public String getPmm16() {
		return pmm16;
	}

	public void setPmm16(String pmm16) {
		this.pmm16 = pmm16;
	}
	
	@Length(min=0, max=10, message="pmm17长度不能超过 10 个字符")
	public String getPmm17() {
		return pmm17;
	}

	public void setPmm17(String pmm17) {
		this.pmm17 = pmm17;
	}
	
	@Length(min=0, max=1, message="pmm18长度不能超过 1 个字符")
	public String getPmm18() {
		return pmm18;
	}

	public void setPmm18(String pmm18) {
		this.pmm18 = pmm18;
	}
	
	@Length(min=0, max=10, message="付款方式长度不能超过 10 个字符")
	public String getPmm20() {
		return pmm20;
	}

	public void setPmm20(String pmm20) {
		this.pmm20 = pmm20;
	}
	
	@Length(min=0, max=4, message="税别长度不能超过 4 个字符")
	public String getPmm21() {
		return pmm21;
	}

	public void setPmm21(String pmm21) {
		this.pmm21 = pmm21;
	}
	
	@Length(min=0, max=4, message="币别长度不能超过 4 个字符")
	public String getPmm22() {
		return pmm22;
	}

	public void setPmm22(String pmm22) {
		this.pmm22 = pmm22;
	}
	
	@Length(min=0, max=1, message="pmm25长度不能超过 1 个字符")
	public String getPmm25() {
		return pmm25;
	}

	public void setPmm25(String pmm25) {
		this.pmm25 = pmm25;
	}
	
	@Length(min=0, max=10, message="pmm26长度不能超过 10 个字符")
	public String getPmm26() {
		return pmm26;
	}

	public void setPmm26(String pmm26) {
		this.pmm26 = pmm26;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPmm27() {
		return pmm27;
	}

	public void setPmm27(Date pmm27) {
		this.pmm27 = pmm27;
	}
	
	@Length(min=0, max=10, message="pmm28长度不能超过 10 个字符")
	public String getPmm28() {
		return pmm28;
	}

	public void setPmm28(String pmm28) {
		this.pmm28 = pmm28;
	}
	
	@Length(min=0, max=24, message="pmm29长度不能超过 24 个字符")
	public String getPmm29() {
		return pmm29;
	}

	public void setPmm29(String pmm29) {
		this.pmm29 = pmm29;
	}
	
	@Length(min=0, max=1, message="pmm30长度不能超过 1 个字符")
	public String getPmm30() {
		return pmm30;
	}

	public void setPmm30(String pmm30) {
		this.pmm30 = pmm30;
	}
	
	public Integer getPmm31() {
		return pmm31;
	}

	public void setPmm31(Integer pmm31) {
		this.pmm31 = pmm31;
	}
	
	public Integer getPmm32() {
		return pmm32;
	}

	public void setPmm32(Integer pmm32) {
		this.pmm32 = pmm32;
	}
	
	public Double getPmm40() {
		return pmm40;
	}

	public void setPmm40(Double pmm40) {
		this.pmm40 = pmm40;
	}
	
	public Double getPmm401() {
		return pmm401;
	}

	public void setPmm401(Double pmm401) {
		this.pmm401 = pmm401;
	}
	
	@Length(min=0, max=6, message="pmm41长度不能超过 6 个字符")
	public String getPmm41() {
		return pmm41;
	}

	public void setPmm41(String pmm41) {
		this.pmm41 = pmm41;
	}
	
	public Double getPmm42() {
		return pmm42;
	}

	public void setPmm42(Double pmm42) {
		this.pmm42 = pmm42;
	}
	
	public Double getPmm43() {
		return pmm43;
	}

	public void setPmm43(Double pmm43) {
		this.pmm43 = pmm43;
	}
	
	@Length(min=0, max=1, message="pmm44长度不能超过 1 个字符")
	public String getPmm44() {
		return pmm44;
	}

	public void setPmm44(String pmm44) {
		this.pmm44 = pmm44;
	}
	
	@Length(min=0, max=1, message="pmm45长度不能超过 1 个字符")
	public String getPmm45() {
		return pmm45;
	}

	public void setPmm45(String pmm45) {
		this.pmm45 = pmm45;
	}
	
	public Integer getPmm46() {
		return pmm46;
	}

	public void setPmm46(Integer pmm46) {
		this.pmm46 = pmm46;
	}
	
	public Double getPmm47() {
		return pmm47;
	}

	public void setPmm47(Double pmm47) {
		this.pmm47 = pmm47;
	}
	
	public Double getPmm48() {
		return pmm48;
	}

	public void setPmm48(Double pmm48) {
		this.pmm48 = pmm48;
	}
	
	@Length(min=0, max=1, message="pmm49长度不能超过 1 个字符")
	public String getPmm49() {
		return pmm49;
	}

	public void setPmm49(String pmm49) {
		this.pmm49 = pmm49;
	}
	
	@Length(min=0, max=10, message="pmm50长度不能超过 10 个字符")
	public String getPmm50() {
		return pmm50;
	}

	public void setPmm50(String pmm50) {
		this.pmm50 = pmm50;
	}
	
	@Length(min=0, max=17, message="pmm99长度不能超过 17 个字符")
	public String getPmm99() {
		return pmm99;
	}

	public void setPmm99(String pmm99) {
		this.pmm99 = pmm99;
	}
	
	@Length(min=0, max=1, message="pmm901长度不能超过 1 个字符")
	public String getPmm901() {
		return pmm901;
	}

	public void setPmm901(String pmm901) {
		this.pmm901 = pmm901;
	}
	
	@Length(min=0, max=1, message="pmm902长度不能超过 1 个字符")
	public String getPmm902() {
		return pmm902;
	}

	public void setPmm902(String pmm902) {
		this.pmm902 = pmm902;
	}
	
	@Length(min=0, max=1, message="pmm903长度不能超过 1 个字符")
	public String getPmm903() {
		return pmm903;
	}

	public void setPmm903(String pmm903) {
		this.pmm903 = pmm903;
	}
	
	@Length(min=0, max=8, message="pmm904长度不能超过 8 个字符")
	public String getPmm904() {
		return pmm904;
	}

	public void setPmm904(String pmm904) {
		this.pmm904 = pmm904;
	}
	
	@Length(min=0, max=1, message="pmm905长度不能超过 1 个字符")
	public String getPmm905() {
		return pmm905;
	}

	public void setPmm905(String pmm905) {
		this.pmm905 = pmm905;
	}
	
	@Length(min=0, max=1, message="pmm906长度不能超过 1 个字符")
	public String getPmm906() {
		return pmm906;
	}

	public void setPmm906(String pmm906) {
		this.pmm906 = pmm906;
	}
	
	@Length(min=0, max=10, message="pmm907长度不能超过 10 个字符")
	public String getPmm907() {
		return pmm907;
	}

	public void setPmm907(String pmm907) {
		this.pmm907 = pmm907;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPmm908() {
		return pmm908;
	}

	public void setPmm908(Date pmm908) {
		this.pmm908 = pmm908;
	}
	
	@Length(min=0, max=1, message="pmm909长度不能超过 1 个字符")
	public String getPmm909() {
		return pmm909;
	}

	public void setPmm909(String pmm909) {
		this.pmm909 = pmm909;
	}
	
	@Length(min=0, max=10, message="pmm911长度不能超过 10 个字符")
	public String getPmm911() {
		return pmm911;
	}

	public void setPmm911(String pmm911) {
		this.pmm911 = pmm911;
	}
	
	@Length(min=0, max=10, message="pmm912长度不能超过 10 个字符")
	public String getPmm912() {
		return pmm912;
	}

	public void setPmm912(String pmm912) {
		this.pmm912 = pmm912;
	}
	
	@Length(min=0, max=10, message="pmm913长度不能超过 10 个字符")
	public String getPmm913() {
		return pmm913;
	}

	public void setPmm913(String pmm913) {
		this.pmm913 = pmm913;
	}
	
	@Length(min=0, max=10, message="pmm914长度不能超过 10 个字符")
	public String getPmm914() {
		return pmm914;
	}

	public void setPmm914(String pmm914) {
		this.pmm914 = pmm914;
	}
	
	@Length(min=0, max=10, message="pmm915长度不能超过 10 个字符")
	public String getPmm915() {
		return pmm915;
	}

	public void setPmm915(String pmm915) {
		this.pmm915 = pmm915;
	}
	
	@Length(min=0, max=10, message="pmm916长度不能超过 10 个字符")
	public String getPmm916() {
		return pmm916;
	}

	public void setPmm916(String pmm916) {
		this.pmm916 = pmm916;
	}
	
	@Length(min=0, max=1, message="pmmprsw长度不能超过 1 个字符")
	public String getPmmprsw() {
		return pmmprsw;
	}

	public void setPmmprsw(String pmmprsw) {
		this.pmmprsw = pmmprsw;
	}
	
	public Integer getPmmprno() {
		return pmmprno;
	}

	public void setPmmprno(Integer pmmprno) {
		this.pmmprno = pmmprno;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPmmprdt() {
		return pmmprdt;
	}

	public void setPmmprdt(Date pmmprdt) {
		this.pmmprdt = pmmprdt;
	}
	
	@Length(min=0, max=1, message="pmmmksg长度不能超过 1 个字符")
	public String getPmmmksg() {
		return pmmmksg;
	}

	public void setPmmmksg(String pmmmksg) {
		this.pmmmksg = pmmmksg;
	}
	
	@Length(min=0, max=4, message="pmmsign长度不能超过 4 个字符")
	public String getPmmsign() {
		return pmmsign;
	}

	public void setPmmsign(String pmmsign) {
		this.pmmsign = pmmsign;
	}
	
	public Integer getPmmdays() {
		return pmmdays;
	}

	public void setPmmdays(Integer pmmdays) {
		this.pmmdays = pmmdays;
	}
	
	public Integer getPmmprit() {
		return pmmprit;
	}

	public void setPmmprit(Integer pmmprit) {
		this.pmmprit = pmmprit;
	}
	
	public Integer getPmmsseq() {
		return pmmsseq;
	}

	public void setPmmsseq(Integer pmmsseq) {
		this.pmmsseq = pmmsseq;
	}
	
	public Integer getPmmsmax() {
		return pmmsmax;
	}

	public void setPmmsmax(Integer pmmsmax) {
		this.pmmsmax = pmmsmax;
	}
	
	@Length(min=0, max=1, message="pmmacti长度不能超过 1 个字符")
	public String getPmmacti() {
		return pmmacti;
	}

	public void setPmmacti(String pmmacti) {
		this.pmmacti = pmmacti;
	}
	
	@Length(min=0, max=10, message="pmmuser长度不能超过 10 个字符")
	public String getPmmuser() {
		return pmmuser;
	}

	public void setPmmuser(String pmmuser) {
		this.pmmuser = pmmuser;
	}
	
	@Length(min=0, max=10, message="pmmgrup长度不能超过 10 个字符")
	public String getPmmgrup() {
		return pmmgrup;
	}

	public void setPmmgrup(String pmmgrup) {
		this.pmmgrup = pmmgrup;
	}
	
	@Length(min=0, max=10, message="pmmmodu长度不能超过 10 个字符")
	public String getPmmmodu() {
		return pmmmodu;
	}

	public void setPmmmodu(String pmmmodu) {
		this.pmmmodu = pmmmodu;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPmmdate() {
		return pmmdate;
	}

	public void setPmmdate(Date pmmdate) {
		this.pmmdate = pmmdate;
	}
	
	public Double getPmm40t() {
		return pmm40t;
	}

	public void setPmm40t(Double pmm40t) {
		this.pmm40t = pmm40t;
	}
	
	@Length(min=0, max=255, message="pmmud01长度不能超过 255 个字符")
	public String getPmmud01() {
		return pmmud01;
	}

	public void setPmmud01(String pmmud01) {
		this.pmmud01 = pmmud01;
	}
	
	@Length(min=0, max=40, message="pmmud02长度不能超过 40 个字符")
	public String getPmmud02() {
		return pmmud02;
	}

	public void setPmmud02(String pmmud02) {
		this.pmmud02 = pmmud02;
	}
	
	@Length(min=0, max=40, message="pmmud03长度不能超过 40 个字符")
	public String getPmmud03() {
		return pmmud03;
	}

	public void setPmmud03(String pmmud03) {
		this.pmmud03 = pmmud03;
	}
	
	@Length(min=0, max=40, message="pmmud04长度不能超过 40 个字符")
	public String getPmmud04() {
		return pmmud04;
	}

	public void setPmmud04(String pmmud04) {
		this.pmmud04 = pmmud04;
	}
	
	@Length(min=0, max=40, message="pmmud05长度不能超过 40 个字符")
	public String getPmmud05() {
		return pmmud05;
	}

	public void setPmmud05(String pmmud05) {
		this.pmmud05 = pmmud05;
	}
	
	@Length(min=0, max=40, message="pmmud06长度不能超过 40 个字符")
	public String getPmmud06() {
		return pmmud06;
	}

	public void setPmmud06(String pmmud06) {
		this.pmmud06 = pmmud06;
	}
	
	public Double getPmmud07() {
		return pmmud07;
	}

	public void setPmmud07(Double pmmud07) {
		this.pmmud07 = pmmud07;
	}
	
	public Double getPmmud08() {
		return pmmud08;
	}

	public void setPmmud08(Double pmmud08) {
		this.pmmud08 = pmmud08;
	}
	
	public Double getPmmud09() {
		return pmmud09;
	}

	public void setPmmud09(Double pmmud09) {
		this.pmmud09 = pmmud09;
	}
	
	public Integer getPmmud10() {
		return pmmud10;
	}

	public void setPmmud10(Integer pmmud10) {
		this.pmmud10 = pmmud10;
	}
	
	public Integer getPmmud11() {
		return pmmud11;
	}

	public void setPmmud11(Integer pmmud11) {
		this.pmmud11 = pmmud11;
	}
	
	public Integer getPmmud12() {
		return pmmud12;
	}

	public void setPmmud12(Integer pmmud12) {
		this.pmmud12 = pmmud12;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPmmud13() {
		return pmmud13;
	}

	public void setPmmud13(Date pmmud13) {
		this.pmmud13 = pmmud13;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPmmud14() {
		return pmmud14;
	}

	public void setPmmud14(Date pmmud14) {
		this.pmmud14 = pmmud14;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPmmud15() {
		return pmmud15;
	}

	public void setPmmud15(Date pmmud15) {
		this.pmmud15 = pmmud15;
	}
	
	@NotBlank(message="pmm51不能为空")
	@Length(min=0, max=1, message="pmm51长度不能超过 1 个字符")
	public String getPmm51() {
		return pmm51;
	}

	public void setPmm51(String pmm51) {
		this.pmm51 = pmm51;
	}
	
	@Length(min=0, max=10, message="pmm52长度不能超过 10 个字符")
	public String getPmm52() {
		return pmm52;
	}

	public void setPmm52(String pmm52) {
		this.pmm52 = pmm52;
	}
	
	@Length(min=0, max=10, message="pmm53长度不能超过 10 个字符")
	public String getPmm53() {
		return pmm53;
	}

	public void setPmm53(String pmm53) {
		this.pmm53 = pmm53;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPmmcond() {
		return pmmcond;
	}

	public void setPmmcond(Date pmmcond) {
		this.pmmcond = pmmcond;
	}
	
	@Length(min=0, max=8, message="pmmcont长度不能超过 8 个字符")
	public String getPmmcont() {
		return pmmcont;
	}

	public void setPmmcont(String pmmcont) {
		this.pmmcont = pmmcont;
	}
	
	@Length(min=0, max=10, message="pmmconu长度不能超过 10 个字符")
	public String getPmmconu() {
		return pmmconu;
	}

	public void setPmmconu(String pmmconu) {
		this.pmmconu = pmmconu;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPmmcrat() {
		return pmmcrat;
	}

	public void setPmmcrat(Date pmmcrat) {
		this.pmmcrat = pmmcrat;
	}
	
	@NotBlank(message="pmmpos不能为空")
	@Length(min=0, max=1, message="pmmpos长度不能超过 1 个字符")
	public String getPmmpos() {
		return pmmpos;
	}

	public void setPmmpos(String pmmpos) {
		this.pmmpos = pmmpos;
	}
	
	@NotBlank(message="pmmplant不能为空")
	@Length(min=0, max=10, message="pmmplant长度不能超过 10 个字符")
	public String getPmmplant() {
		return pmmplant;
	}

	public void setPmmplant(String pmmplant) {
		this.pmmplant = pmmplant;
	}
	
	@NotBlank(message="pmmlegal不能为空")
	@Length(min=0, max=10, message="pmmlegal长度不能超过 10 个字符")
	public String getPmmlegal() {
		return pmmlegal;
	}

	public void setPmmlegal(String pmmlegal) {
		this.pmmlegal = pmmlegal;
	}
	
	@Length(min=0, max=10, message="pmmoriu长度不能超过 10 个字符")
	public String getPmmoriu() {
		return pmmoriu;
	}

	public void setPmmoriu(String pmmoriu) {
		this.pmmoriu = pmmoriu;
	}
	
	@Length(min=0, max=10, message="pmmorig长度不能超过 10 个字符")
	public String getPmmorig() {
		return pmmorig;
	}

	public void setPmmorig(String pmmorig) {
		this.pmmorig = pmmorig;
	}
	
	public Date getPmm04_gte() {
		return sqlMap.getWhere().getValue("pmm04", QueryType.GTE);
	}

	public void setPmm04_gte(Date pmm04) {
		sqlMap.getWhere().and("pmm04", QueryType.GTE, pmm04);
	}
	
	public Date getPmm04_lte() {
		return sqlMap.getWhere().getValue("pmm04", QueryType.LTE);
	}

	public void setPmm04_lte(Date pmm04) {
		sqlMap.getWhere().and("pmm04", QueryType.LTE, pmm04);
	}
	
}