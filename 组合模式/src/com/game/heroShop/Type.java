package com.game.heroShop;
/*
 * ��ϲ����������ɫ��ΪҪ��ϵĶ����ṩͳһ�Ľӿ�
 */

public abstract class Type {
	//������ϲ���������
	private String rootName;
	//�����вεĹ��췽��
	public Type(String rootName) {
		super();
		this.rootName = rootName;
	}
	//�����޲εĹ��췽��
	public Type() {
	}
	//get.set
	public String getName() {
		return rootName;
	}
 
	public void setName(String rootName) {
		this.rootName = rootName;
	}
	
	//ΪҪ��ϵĶ����ṩ�ӿ�add
	public abstract void add(Type heroType);
	//ΪҪ��ϵĶ����ṩ�ӿ�remove
	public abstract void romove(Type heroType);
	//ΪҪ��ϵĶ����ṩ�ӿ�display
	public abstract void display(int depth);
}