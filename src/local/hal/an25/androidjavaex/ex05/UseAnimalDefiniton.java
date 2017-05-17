/**
 *
 */
package local.hal.an25.androidjavaex.ex05;

/**
 * @author ohs60275
 *
 */
public class UseAnimalDefiniton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		AnimalDefinition pigDef = new AnimalDefinition();

		pigDef.setAnimal(new Pig());
		pigDef.print();

		AnimalDefinition dogDef = new AnimalDefinition();
		dogDef.setAnimal(new AnimalDefinition.AnimalInterface() {

			@Override
			public String getName() {
				// TODO 自動生成されたメソッド・スタブ
				return "ポチ";
			}

			@Override
			public String call() {
				// TODO 自動生成されたメソッド・スタブ
				return "わん、わん";
			}
		});
		dogDef.print();
	}

	private static class Pig implements AnimalDefinition.AnimalInterface {
		@Override
		public String getName() {
			// TODO 自動生成されたメソッド・スタブ
			return "とんとん";
		}

		@Override
		public String call() {
			// TODO 自動生成されたメソッド・スタブ
			return "ぶうぶう";
		}
	}

}
