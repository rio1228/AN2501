package local.hal.an25.androidjavaex.ex05;

/**
 *
 * @author ohs60275
 *
 */
public class AnimalDefinition {

	/**
	 * 動物を表すフィールド
	 */
	private AnimalInterface _animal;

	/**
	 * 動物を表すメンバインターフェース
	 */
	interface AnimalInterface {
		/**
		 * 動物の愛称を得るメソッド
		 * @return 動物の愛称
		 */
		String getName();

		/**
		 * 動物の鳴き声を得るメソッド
		 * @return 動物の鳴き声
		 */
		String call();
	}

	public void setAnimal(AnimalInterface animal){
		_animal = animal;
	}

	public void print() {
		System.out.println(_animal.getName() + ":"+_animal.call());
	}

}
