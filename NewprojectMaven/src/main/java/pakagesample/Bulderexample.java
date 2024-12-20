package pakagesample;

public class Bulderexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer fv=new StringBuffer("hello");
System.out.println(fv);
//appEnd ADD THE NEW STRING AT LAST
fv.append("ramu");
System.out.println(fv);
// insert 
fv.insert(5,"good morning");
System.out.println(fv);
//replace
fv.replace(1, 3, "hai");
System.out.println(fv);
//reverse
fv.reverse();
System.out.println(fv);
//delete
fv.delete(1, 6);
System.out.println(fv);

	}

}
