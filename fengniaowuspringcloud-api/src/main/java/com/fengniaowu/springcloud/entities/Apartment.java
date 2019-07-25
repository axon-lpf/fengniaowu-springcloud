package com.fengniaowu.springcloud.entities;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Apartment extends BaseEntitiy {

	@ApiModelProperty(value = "Id", required = false)
	public Long Id;
	
	@ApiModelProperty(value = "actorId", required = false)
	public String ActorId;

	@ApiModelProperty(value = "公寓Id", required = false)
	public String ApartmentId;

	@ApiModelProperty(value = "商戶Id", required = true)
	public String AssetTenancyId;

	@ApiModelProperty(value = "公寓简称", required = true)
	public String ApartmentName;

	@ApiModelProperty(value = "公寓全称", required = true)
	public String FullName;

	@ApiModelProperty(value = "地区Id", required = false)
	public String DistrictId;

	@ApiModelProperty(value = "地址", required = false)
	public String Address;

	@ApiModelProperty(value = "公寓类型", required = false)
	public String TrafficMethod;

	@ApiModelProperty(value = "公寓类型", required = false)
	public String SupportFacilities;

	@ApiModelProperty(value = "公寓图片", required = false)
	public String Pictures;

	@ApiModelProperty(value = "=联系方式", required = false)
	public String Contacts;

	@ApiModelProperty(value = "公司名称", required = false)
	public String CompanyName;

	@ApiModelProperty(value = "公寓类型", required = false)
	public String CompanyNumber;

	@ApiModelProperty(value = "公寓月租单价", required = false)
	public long RetailPrice;

	@ApiModelProperty(value = "公寓日租单价", required = false)
	public long DailyRetailPrice;

	@ApiModelProperty(value = "项目Id", required = false)
	public String ProjectId;

	@ApiModelProperty(value = "公寓类型", required = false)
	public String ApartmentType;
	
	@ApiModelProperty(value = "项目Id", required = false)
	public String VillageId;
	
	@ApiModelProperty(value = "公司Id", required = false)
	public String CompanyId;
	
	@ApiModelProperty(value = "公司Id", required = false)
	public String OuterId;

}
