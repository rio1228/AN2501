package local.hal.an25.androidjavaex.ex01;

public class CallAnimals2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		AbstractAnimal pet[] = new AbstractAnimal[2];
		pet[0] = new Cat();
		pet[1] = new Dog();
		pet[0].setName("たま");
		pet[1].setName("しろ");


		for(int i =0; i< pet.length; i++){
			String name = pet[i].getName();
			String call = pet[i].call();
			System.out.println(name +":"+ call);
		}
	}

}
