package local.hal.an25.androidjavaex.ex01;

public class CallAnimals{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//AbstractAnimal pet = new AbstractAnimal();//この記述だとエラーが出る。
		//pet.setName("動物");

		Cat pet0 = new Cat();
		pet0.setName("たま");
		Dog pet1 = new Dog();
		pet1.setName("しろ");

		String name = pet0.getName();
		String call = pet0.call();
		System.out.println(name +":"+ call);

		name = pet1.getName();
		call = pet1.call();
		System.out.println(name +":"+ call);
	}

}
