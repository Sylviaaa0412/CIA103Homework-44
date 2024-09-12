package hw8;

/*請設計一個Train類別,並包含以下屬性:
- 班次 number,型別為int - 車種 type,型別為String - 出發地 start,型別為String
- 目的地 dest,型別為String - 票價 price,型別為double
設計對應的getter/setter方法,並在main方法裡透過建構子產生以下7個Train的物件,放到每小題
需使用的集合裡
- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
- (1254, “區間”, “屏東”, “基隆”, 700)
- (118, “自強”, “高雄”, “台北”, 500)
- (1288, “區間”, “新竹”, “基隆”, 400)
- (122, “自強”, “台中”, “花蓮”, 600)
- (1222, “區間”, “樹林”, 七堵, 300)
- (1254, “區間”, “屏東”, “基隆”, 700)*/
//1.Train實作Comparable介面才能照順序排列
public class Train implements Comparable<Train>{
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	public Train() {
	};

	public Train(int number, String type, String start, String dest, double price) {
		setNumber(number);
		setType(type);
		setStart(start);
		setDest(dest);
		this.price = price;
	};

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getStart() {
		return start;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public String getDest() {
		return dest;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	//override train equals 以便進行比較排除重複
	public boolean equals(Train t) {
		if (this == t) {
			return true;
		} else if ((this.number == t.number) && (this.type.equals(t.type)) && (this.dest.equals(t.dest))
				&& (this.start.equals(t.start)) && (this.price == t.price)) {
			return true;
		}
		return false;
	}

	//override HashCode 以便進行比較排除重複
	public int hashCode(double price) {
		final int prime = 31;
		int result = 1;

		result = result * prime + number;
		result = result * prime + (int) price;
		return result;
	}

	//印出車輛資訊的方法
	public void printMes(Train t) {
		System.out.print(
				"班次:" + t.getNumber() + "\t車種:" + t.getType() + "\t起點:" + t.getStart() + "\t目的地:" + t.getDest() + "\n");
	}
	
	//實作cpmpareTo以進行比較排序
	public int compareTo(Train aTrain) {
		if(this.getNumber()>aTrain.getNumber()) {
			return 1;
		}else if(this.getNumber()==aTrain.getNumber()) {
			return 0;
		}return-1;
	}

}
