package local.hal.an25.androidjavaex.ex02;

/**
 * InterfaceExampleの使った実行クラス
 * @author ohs60275
 *
 */
public class UseInterfaceExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//InterfaceExample interfaceExample = new InterfaceExample();

		InterfaceExample ie1= new ImplementEx1();
		InterfaceExample ie2= new ImplementEx2();

		useClass(ie1);
		useClass(ie2);

	}

	private static void useClass(InterfaceExample interEx) {
		System.out.println("----表示します");
		String name = interEx.getComment();
		int foo = interEx.fooTimes();
		String comment = interEx.getComment();
		System.out.println(name);
		System.out.println("fooTimes="+ foo);
		System.out.println("コメント："+comment);
	}

}
