package List;

public class staticData implements Comparable<staticData>{
	
	private float totalPay;
	private String name;
	
	public staticData(float totalPay, String name) {
		super();
		this.totalPay = totalPay;
		this.name = name;
	}
	
	public float getTotalPay() {
		return totalPay;
	}
	
	public void setTotalPay(float totalPay) {
		this.totalPay = totalPay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int compareTo(staticData o) {
		return (int) (o.getTotalPay()-this.totalPay);
	}
	
	@Override
	public String toString() {
		return "staticData [totalPay=" + totalPay + ", name=" + name + "]";
	}
	
	
}
