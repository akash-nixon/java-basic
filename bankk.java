
interface interest{
	public void interestRate(float x);
}

class bank implements interest{
	public void interestRate(float a){
		System.out.println(a);
	}

}
class sbi extends bank{
	float x;
	public sbi(){x=12;}
}
class hdfc extends bank{
	float x;
	public hdfc(){x=9.8f;}
}
class axis extends bank{
	float x;
	public axis(){x=10;}
}
public class bankk{
public static void main(String args[]){
	sbi obj = new sbi();
	System.out.print("Sbi:");
    obj.interestRate(obj.x);
    hdfc obj1 = new hdfc();
	System.out.print("HDFC:");
    obj1.interestRate(obj1.x);
    axis obj2 = new axis();
	System.out.print("Axis:");
    obj2.interestRate(obj2.x);
}
}
