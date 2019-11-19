package com.game.heroShop;

import java.util.ArrayList;
import java.util.List;
/*
 * �ϳɲ�����
 * ������֦�ڵ����Ϊ�������洢������ʵ����Component�ӿ��е��йز����������ӣ�Add����ɾ����Remove��
 */
public class ProfessionType extends Type {
	//���弯������Type����
	private List<Type> cList;
	
	//�����޲εĹ��캯������ʼ������
	public ProfessionType() {
		cList = new ArrayList<Type>();
	}
	
	//�����вεĹ��캯������ʼ������
	public ProfessionType(String name) {
		super(name); 
		cList = new ArrayList<Type>(); 
	}
 
	//ʵ����ϲ����ӿ��е�add����
	public void add(Type heroType) {
		cList.add(heroType);
	}
	
	//ʵ����ϲ����ӿ��е�remove����
	public void romove(Type heroType) {
		cList.remove(heroType);
	}
 
	//ʵ����ϲ����ӿ��е�display����
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

