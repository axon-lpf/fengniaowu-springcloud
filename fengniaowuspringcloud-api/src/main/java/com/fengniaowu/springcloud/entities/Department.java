package com.fengniaowu.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")  //ȡ��warning 
@AllArgsConstructor //ȫ�ι��캯��
@NoArgsConstructor //�޲ι��캯��
@Data //���get set����
@Accessors(chain=true)
public class Department implements Serializable {

	private Long deptno; // ����
	private String dname; // ��������
	private String db_source;// �����Ǹ����ݿ⣬��Ϊ΢����ܹ�����һ�������Ӧһ�����ݿ⣬ͬһ����Ϣ���洢����ͬ���ݿ�
}
