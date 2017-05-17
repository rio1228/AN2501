/**
 *
 */
package local.hal.an25.androidjavaex.ex03;

/**
 * @author ohs60275
 *
 */
public class WhiteLady {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Cocktail whiteLady = new Cocktail("ホワイトレディー");


		//Ingredient ing = new Ingredient("ジン",1.5,30);
		//privateで作っているので呼び出すことができない

		whiteLady.addIngredient("ジン", 1.5, 30);
		whiteLady.addIngredient("コアントロー", 4.0,15);
		whiteLady.addIngredient("レモン果汁", 2.0, 15);

		System.out.println(whiteLady.getRecipe());
		System.out.println("原価は"+whiteLady.getCost()+"円");
	}
}
