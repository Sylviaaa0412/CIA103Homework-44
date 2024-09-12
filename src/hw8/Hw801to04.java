package hw8;

import java.math.BigInteger;
import java.util.*;

/*
• 請建立一個Collection物件並將以下資料加入:
	Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、
	Double(5.1)、“Kitty”、Integer(100)、
	Object物件、“Snoopy”、BigInteger(“1000”)

• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
• 移除不是java.lang.Number相關的物件
• 再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功
*/
public class Hw801to04 {
	public static void main(String[] args) {
		
		//1.創建Map存入元素
		Map<Integer, Object> myMap = new HashMap();
		myMap.put(0, 100);
		myMap.put(1, 3.14);
		myMap.put(2, 21L);
		myMap.put(3, (short) (100));
		myMap.put(4, 5.1);
		myMap.put(5, "Kitty");
		myMap.put(6, 100);
		myMap.put(7, "Snoopy");
		myMap.put(8, new BigInteger("1000"));
		
		//keySet取得key集合
		Set keySet = myMap.keySet();
		
		//7.new一個此class並調用各種創建的方法
		Hw801to04 aMap=new Hw801to04();
		aMap.iteratorMap(keySet, myMap);
		aMap.forMap(myMap);
		aMap.foreachMap(keySet, myMap);
		Map newMap=aMap.removeNum(myMap);
		aMap.iteratorMap(keySet, newMap);

	}

	//3.建立方法以iterator取得元素並印出
	public void iteratorMap(Set keySet, Map map) {
		Iterator it = keySet.iterator();
		System.out.println("\n"+"-----iterator-----" + "\n");
		while (it.hasNext()) {
			Object myKey = it.next();
			System.out.println("Key: " + myKey + "  Value: " + map.get(myKey));
		}
	}

	//4.建立方法以for取值並印出
	public void forMap(Map map) {
		System.out.println("\n" + "-------for-------" + "\n");

		for (int i = 0; i < map.size(); i++) {
			System.out.println("Key: " + i + "  Value: " + map.get(i));
		}
	}

	//5.建立方法以foreach取值並印出
	public void foreachMap(Set keySet, Map map) {
		System.out.println("\n" + "-----for-each-----" + "\n");

		for (Object key : keySet) {
			System.out.println("Key: " + key + "  Value: " + map.get(key));
		}
	}

	//6.建立移除無法轉型成Number的元素的方法
	public Map<Integer, Object> removeNum(Map map) {

		for (int i = 0; i <= map.size(); i++) {
			if (!(map.get(i) instanceof Number)) {
				map.remove(i);
			}
		}
		return map;
	}

}
