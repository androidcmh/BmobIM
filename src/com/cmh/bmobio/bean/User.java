package com.cmh.bmobio.bean;

import cn.bmob.im.bean.BmobChatUser;
import cn.bmob.v3.datatype.BmobGeoPoint;
import cn.bmob.v3.datatype.BmobRelation;

public class User extends BmobChatUser{

	
	private static final long serialVersionUID = 1L;
	//�����Ĳ����б�
	private BmobRelation blogs; 
	//��ʾ����ƴ��������ĸ
	private String sortLetters;
	//�Ա�   true Ϊ��
	private Boolean sex;
	
	private Blog blog;
	
	private BmobGeoPoint location;
	
	
	private Integer height;
}
