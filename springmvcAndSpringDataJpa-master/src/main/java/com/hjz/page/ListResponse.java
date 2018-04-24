package com.hjz.page;


import java.util.Collections;
import java.util.List;

public class ListResponse<T> extends SimpleResponse {
	

	private static final long serialVersionUID = 7355109290886880716L;
	private List<T> list;//�����б�

	public List<T> getList() {
		if(list == null){
			return Collections.emptyList();
		}
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	
	public void addObject(T object){
		list.add(object);
	}
	
}