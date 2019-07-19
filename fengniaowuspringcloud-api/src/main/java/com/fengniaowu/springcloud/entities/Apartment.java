package com.fengniaowu.springcloud.entities;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Apartment extends BaseEntitiy {

    /// <summary>
    ///     ��ԢId
    /// </summary>
    public String ApartmentId ;

    /// <summary>
    ///     �ʲ��̻�Id
    /// </summary>
    public String AssetTenancyId ;

    /// <summary>
    ///     ��Ԣ���
    /// </summary>
    public String ApartmentName ;

    /// <summary>
    ///     ��Ԣȫ��
    /// </summary>
    public String FullName ;

    /// <summary>
    ///     ����Id
    /// </summary>
    public String DistrictId ;

    /// <summary>
    ///     ��Ԣ��ַ
    /// </summary>
    public String Address ;

    /// <summary>
    ///     ��ͨ����
    /// </summary>
    public String TrafficMethod ;

    /// <summary>
    ///     �ܱ�������ʩ
    /// </summary>
    public String SupportFacilities ;

    /// <summary>
    ///     ��ԢͼƬ ʹ��','�ָ�����Id
    /// </summary>
    public String Pictures ;

    /// <summary>
    ///     ��ϵ��ʽ��������ϵʹ��
    /// </summary>
    public String Contacts ;

    /// <summary>
    ///     ��˾���ƣ����ں�ͬǩ��
    /// </summary>
    public String CompanyName ;

    /// <summary>
    ///     ��˾֤���ţ����ں�ͬǩ��
    /// </summary>
    public String CompanyNumber ;

    /// <summary>
    ///     ����ƽ�����м�
    /// </summary>
    public long RetailPrice ;

    /// <summary>
    ///     ����ƽ�����м�
    /// </summary>
    public long DailyRetailPrice ;

    /// <summary>
    ///     ��ĿId
    /// </summary>
    public String ProjectId ;

    /// <summary>
    ///     ��Ԣ���ͣ����У���ɢ��
    /// </summary>
    public String ApartmentType ;
	
}
