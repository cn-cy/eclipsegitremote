package com.demo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class AllCollectionTYpe {
	private List<String> list1;
	private String[] array1;
	private Set<String> set1;
	private Map<String, String> map1;
	private Properties props1;

	

	public List<String> getList1() {
		return list1;
	}



	public void setList1(List<String> list1) {
		this.list1 = list1;
	}



	public String[] getArray1() {
		return array1;
	}



	public void setArray1(String[] array1) {
		this.array1 = array1;
	}



	public Set<String> getSet1() {
		return set1;
	}



	public void setSet1(Set<String> set1) {
		this.set1 = set1;
	}



	public Map<String, String> getMap1() {
		return map1;
	}



	public void setMap1(Map<String, String> map1) {
		this.map1 = map1;
	}



	public Properties getProps1() {
		return props1;
	}



	public void setProps1(Properties props1) {
		this.props1 = props1;
	}


	public AllCollectionTYpe() {
	
		
	}



	public AllCollectionTYpe(List<String> list1) {
	
		this.list1 = list1;
	}



	public String toString() {
		String strContent = "";
		for (String str : array1) {
			strContent += str + ",";
		}
		return this.list1+","+this.set1+","+this.map1+","+this.props1+strContent;


	}
}
