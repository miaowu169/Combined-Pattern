package com.game.heroShop;
/*
 *Ҷ����,������б�ʾ�ӽڵ����Ҷ�ӽڵ㲻�����ӽڵ㡣
 */

public class ClassificationA extends Type {
	//�����вεĹ��췽��
	public ClassificationA(String heroName) {
		super(heroName);
	}
	
	//ʵ����ϲ����ӿ��е���ز���
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
