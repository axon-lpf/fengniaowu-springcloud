package com.fengniaowu.springcloud.entities;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Apartment extends BaseEntitiy {

    /// <summary>
    ///     公寓Id
    /// </summary>
    public String ApartmentId ;

    /// <summary>
    ///     资产商户Id
    /// </summary>
    public String AssetTenancyId ;

    /// <summary>
    ///     公寓简称
    /// </summary>
    public String ApartmentName ;

    /// <summary>
    ///     公寓全称
    /// </summary>
    public String FullName ;

    /// <summary>
    ///     区域Id
    /// </summary>
    public String DistrictId ;

    /// <summary>
    ///     公寓地址
    /// </summary>
    public String Address ;

    /// <summary>
    ///     交通出行
    /// </summary>
    public String TrafficMethod ;

    /// <summary>
    ///     周边配套设施
    /// </summary>
    public String SupportFacilities ;

    /// <summary>
    ///     公寓图片 使用','分隔附件Id
    /// </summary>
    public String Pictures ;

    /// <summary>
    ///     联系方式，对外联系使用
    /// </summary>
    public String Contacts ;

    /// <summary>
    ///     公司名称，用于合同签署
    /// </summary>
    public String CompanyName ;

    /// <summary>
    ///     公司证件号，用于合同签署
    /// </summary>
    public String CompanyNumber ;

    /// <summary>
    ///     月租平均门市价
    /// </summary>
    public long RetailPrice ;

    /// <summary>
    ///     日租平均门市价
    /// </summary>
    public long DailyRetailPrice ;

    /// <summary>
    ///     项目Id
    /// </summary>
    public String ProjectId ;

    /// <summary>
    ///     公寓类型（集中，分散）
    /// </summary>
    public String ApartmentType ;
	
}
