package ss7;

public class TestInvoiceItem {
	public static void main(String[] args) {
		InvoiceItem mItem = new InvoiceItem();
		mItem.setId("1a2b3c");
		mItem.setDesc("che huy");
		mItem.setQty(12);
		mItem.setUnitprice(10000);
		System.out.println(mItem);
		mItem.Total();
		
		
	}
}
class InvoiceItem{
	private String id;
	private String desc;
	private int qty;
	private double unitprice;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}
	public void Total() {
		System.out.println("tong tien la: "+(unitprice*qty));
	}
	@Override
	public String toString() {
		return "InvoiceItem [id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitprice=" + unitprice + "]";
	}
	
	
}
