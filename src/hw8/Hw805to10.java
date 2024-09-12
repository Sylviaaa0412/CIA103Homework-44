package hw8;

import java.util.*;

/*
• 請寫一隻程式,能印出不重複的Train物件

• 請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出

• 承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件

• (以上三題請根據使用的集合,練習各種取值寫法,如迭代器、for迴圈或foreach等)
*/
public class Hw805to10 {
	public static void main(String[] args) {

		// 1.main方法中建立train陣列存入所有train資訊
		Train trainArr[] = { new Train(202, "普悠瑪", "樹林", "花蓮", 400), new Train(1254, "區間", "屏東", "基隆", 700),
				new Train(118, "自強", "高雄", "台北", 500), new Train(118, "區間", "新竹", "基隆", 400),
				new Train(122, "自強", "台中", "花蓮", 600), new Train(1222, "區間", "樹林", "七堵", 300),
				new Train(1254, "區間", "屏東", "基隆", 700) };

		Hw805to10 a = new Hw805to10();
		a.hashSetTrain(trainArr);
		a.arrayListTrain(trainArr);
		a.treeMapTrain(trainArr);
	}

	// 2.建立HashSet存入train陣列排除重複train物件
	public void hashSetTrain(Train[] trainArr) {
		Set<Train> set = new HashSet<Train>();
		// 迴圈存入trainain
		for (int i = 0; i < trainArr.length; i++) {
			set.add(trainArr[i]);
		}

		// foreach印出train
		for (Train train : set) {
			train.printMes(train);
		}
		System.out.println("============================================");
	}

	// 3.ArrayList照順序排列保留重複
	public <T> void arrayListTrain(Train[] trainArr) {
		List<Train> list = new ArrayList<Train>();
		for (int i = 0; i < trainArr.length; i++) {
			list.add(trainArr[i]);
		}
		// 將list以reverse降冪排序
		Collections.reverse(list);
		// 迭代器取值印出
		Iterator<Train> it = list.iterator();
		while (it.hasNext()) {
			Train train = it.next();
			train.printMes(train);
		}
		System.out.println("=================================================");
	}

	// 4.TreeMap存入train陣列排序並去重
	public void treeMapTrain(Train[] trainArr) {
		Map<Integer, Train> map = new TreeMap<Integer, Train>();
		// 迴圈加入train資訊，以車次當key
		for (int i = 0; i < trainArr.length; i++) {
			map.put(trainArr[i].getNumber(), trainArr[i]);
		}
		// foreach取值
		for (Train train : map.values()) {
			train.printMes(train);
		}
		System.out.println("=================================================");
	}

}
