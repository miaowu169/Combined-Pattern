package com.game.heroShop;
/*
 *叶子类,在组合中表示子节点对象，叶子节点不能有子节点。
 */

public class ClassificationA extends Type {
	//创建有参的构造方法
	public ClassificationA(String heroName) {
		super(heroName);
	}
	
	//实现组合部件接口中的相关操作
	public void add(Type heroName) {}
	
	public void romove(Type heroName) {}
	
	public void display(int depth) {
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < depth; i++) {
			sb.append("-");
		}
		System.out.println(new String(sb) + this.getName());
	}


}
