package week4;

public class address {

	private String country;
	private String sheng;
	private String city;
	private String jiedao;
	private String youbian;

	public address() {
		this.country="�й�";
		this.sheng="����";
		this.city="�˳�";
		this.jiedao="۳�ǽֵ�";
		this.youbian= "441400";
	}
	public address(String country, String sheng,String city,String jiedao,String youbian) {
		this.country=country;
		this.sheng=sheng;
		this.city=city;
		this.jiedao=jiedao;
		this.youbian= youbian;
	}
	public void displayAddress() {
		System.out.println("���ң�"+this.country);
		System.out.println("ʡ��"+this.sheng);
		System.out.println("���У�"+this.city);
		System.out.println("�ֵ���"+this.jiedao);
		System.out.println("�ʱࣺ"+this.youbian);
		System.out.println("**********************************************");
	}
}