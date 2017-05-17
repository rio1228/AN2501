package local.hal.an25.androidjavaex.ex04;

/**
 * { AnimalInterfaceを使った実行クラス
 * @author ohs60275
 *
 */
public class CallAnimals2 {

	/**
	 * 動物の愛称とその鳴き声を表示するメソッド
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		AnimalInterface cat = new AnimalInterface(){
			@Override
			public String getName() {
				return "たま";

			}
			@Override
			public String call() {
				return "にゃあ";

			}
		};

		print(cat);
		print(new AnimalInterface() {

			@Override
			public String getName() {
				return "とんこ";

			}
			@Override
			public String call() {
				return "ぶうぶう";

			}
		});

	}
	/**
	 *
	 * @param animal
	 */
	private static void print(AnimalInterface animal) {
		System.out.println(animal.getName() + ":"+animal.call());
	}

}
