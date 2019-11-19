package com.game.heroShopTest;
/*
  * ������
 */

import com.game.heroShop.ClassificationB;
import com.game.heroShop.ProfessionType;
import com.game.heroShop.ClassificationA;
import com.game.heroShop.Type;

public class HeroShopTest {
	public static void main(String[] args) {
		//�����ϳɲ���ʵ��
		Type root=new ProfessionType();
		root.setName("����Ӣ��");
		//��ʦ�����֣���Ұ��ϳ�����Ӣ��
		Type master = new ProfessionType("��ʦ");
		Type shooter = new ProfessionType("����");
		Type killBeast = new ProfessionType("��Ұ");
		root.add(master);
		root.add(shooter);
		root.add(killBeast);
		//�й���ʦ�������ʦ��ϳɷ�ʦְҵ
		Type master1=new ProfessionType("�й���ʦ");
		Type master2=new ProfessionType("�����ʦ");
		master.add(master1);
		master.add(master2);
		//�й���ʦ����ظ��Ӣ����϶���
		master1.add(new ClassificationB("��ظ"));
		//�����ʦ�������ϵ�Ӣ����϶���
		master2.add(new ClassificationB("������"));
		
		//�й����ֺ����������ϳ�����ְҵ
		Type shooter1=new ProfessionType("�й�����");
		Type shooter2=new ProfessionType("�������");
		shooter.add(shooter1);
		shooter.add(shooter2);
		//�й�������³���ߺź��ݼ���Ӣ����϶���
		shooter1.add(new ClassificationA("³���ߺ�"));
		shooter1.add(new ClassificationA("�ݼ�"));
		//�����������ɲ��޵�Ӣ����϶���
		shooter2.add(new ClassificationA("��ɲ���"));
		
		//�й���Ұ�������Ұ��ϳɴ�Ұְҵ
		Type killBeast1=new ProfessionType("�й���Ұ");
		Type killBeast2=new ProfessionType("�����Ұ");
		killBeast.add(killBeast1);
		killBeast.add(killBeast2);
		//�й���Ұ����ף����ŵ�Ӣ����϶���
		killBeast1.add(new ClassificationA("����"));
		killBeast1.add(new ClassificationA("���"));
		//�����Ұ�ɹ�����ص�Ӣ����϶���
		killBeast2.add(new ClassificationA("�������"));
		root.display(0);
	}
}
