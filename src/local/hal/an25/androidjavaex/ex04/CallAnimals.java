package local.hal.an25.androidjavaex.ex04;

public class CallAnimals {

	/**
	 * 動物の愛称とその鳴き声を表示するメソッド
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Cat cat = new Cat();
		//CallAnimals ca = new CallAnimals();
		print(cat);

		print(new Pig());

	}
	/**
	 *
	 * @param animal
	 */
	private static void print(AnimalInterface animal) {
		System.out.println(animal.getName() + ":"+animal.call());
	}

	private static class Cat implements AnimalInterface {

		@Override
		public String getName() {
			return "たま";

		}
		@Override
		public String call() {
			return "にゃあ";

		}
	}

private static class Pig implements AnimalInterface {

		@Override
		public String getName() {
			return "とんこ";

		}
		@Override
		public String call() {
			return "ぶうぶう";

		}
	}
}
