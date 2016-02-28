package com.cmh.bmobio.bean;

import cn.bmob.im.bean.BmobChatUser;
import cn.bmob.v3.datatype.BmobGeoPoint;
import cn.bmob.v3.datatype.BmobRelation;

public class User extends BmobChatUser{

	
	private static final long serialVersionUID = 1L;
	//发布的博客列表
	private BmobRelation blogs; 
	//显示数据拼音的首字母
	private String sortLetters;
	//性别   true 为男
	private Boolean sex;
	
	private Blog blog;
	
	private BmobGeoPoint location;
	
	
	private Integer height;
}
