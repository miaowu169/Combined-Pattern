package com.game.heroShopTest;
/*
  * 测试类
 */

import com.game.heroShop.ClassificationB;
import com.game.heroShop.ProfessionType;
import com.game.heroShop.ClassificationA;
import com.game.heroShop.Type;

public class HeroShopTest {
	public static void main(String[] args) {
		//创建合成部件实例
		Type root=new ProfessionType();
		root.setName("所有英雄");
		//法师，射手，打野组合成所有英雄
		Type master = new ProfessionType("法师");
		Type shooter = new ProfessionType("射手");
		Type killBeast = new ProfessionType("打野");
		root.add(master);
		root.add(shooter);
		root.add(killBeast);
		//中国法师和外国法师组合成法师职业
		Type master1=new ProfessionType("中国法师");
		Type master2=new ProfessionType("外国法师");
		master.add(master1);
		master.add(master2);
		//中国法师由钟馗等英雄组合而成
		master1.add(new ClassificationB("钟馗"));
		//外国法师由米莱迪等英雄组合而成
		master2.add(new ClassificationB("米莱迪"));
		
		//中国射手和外国射手组合成射手职业
		Type shooter1=new ProfessionType("中国射手");
		Type shooter2=new ProfessionType("外国射手");
		shooter.add(shooter1);
		shooter.add(shooter2);
		//中国射手由鲁班七号和虞姬等英雄组合而成
		shooter1.add(new ClassificationA("鲁班七号"));
		shooter1.add(new ClassificationA("虞姬"));
		//外国射手由马可波罗等英雄组合而成
		shooter2.add(new ClassificationA("马可波罗"));
		
		//中国打野和外国打野组合成打野职业
		Type killBeast1=new ProfessionType("中国打野");
		Type killBeast2=new ProfessionType("外国打野");
		killBeast.add(killBeast1);
		killBeast.add(killBeast2);
		//中国打野由李白，韩信等英雄组合而成
		killBeast1.add(new ClassificationA("韩信"));
		killBeast1.add(new ClassificationA("李白"));
		//外国打野由宫本武藏等英雄组合而成
		killBeast2.add(new ClassificationA("宫本武藏"));
		root.display(0);
	}
}
