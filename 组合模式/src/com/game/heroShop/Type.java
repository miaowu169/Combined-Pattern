package com.game.heroShop;
/*
 * 组合部件（抽象角色）为要组合的对象提供统一的接口
 */

public abstract class Type {
	//设置组合部件的名称
	private String rootName;
	//创建有参的构造方法
	public Type(String rootName) {
		super();
		this.rootName = rootName;
	}
	//创建无参的构造方法
	public Type() {
	}
	//get.set
	public String getName() {
		return rootName;
	}
 
	public void setName(String rootName) {
		this.rootName = rootName;
	}
	
	//为要组合的对象提供接口add
	public abstract void add(Type heroType);
	//为要组合的对象提供接口remove
	public abstract void romove(Type heroType);
	//为要组合的对象提供接口display
	public abstract void display(int depth);
}