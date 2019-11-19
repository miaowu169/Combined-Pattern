package com.game.heroShop;

import java.util.ArrayList;
import java.util.List;
/*
 * 合成部件类
 * 定义有枝节点的行为，用来存储部件，实现在Component接口中的有关操作，如增加（Add）和删除（Remove）
 */
public class ProfessionType extends Type {
	//定义集合类存放Type类型
	private List<Type> cList;
	
	//创建无参的构造函数，初始化集合
	public ProfessionType() {
		cList = new ArrayList<Type>();
	}
	
	//创建有参的构造函数，初始化集合
	public ProfessionType(String name) {
		super(name); 
		cList = new ArrayList<Type>(); 
	}
 
	//实现组合部件接口中的add操作
	public void add(Type heroType) {
		cList.add(heroType);
	}
	
	//实现组合部件接口中的remove操作
	public void romove(Type heroType) {
		cList.remove(heroType);
	}
 
	//实现组合部件接口中的display操作
	public void display(int depth) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < depth; i++) {
			sb.append("-"); 
		}
		System.out.println(new String(sb) + this.getName());
		for (Type c : cList) {
			c.display(depth + 2);
		}
	}
}

