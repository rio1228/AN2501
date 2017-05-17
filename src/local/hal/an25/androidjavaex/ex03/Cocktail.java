package local.hal.an25.androidjavaex.ex03;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * カクテルを表すクラス
 * @author ohs60275
 *
 */
public class Cocktail {

	/**
	 * カクテルで使われる材料を表すクラス
	 * @author ohs60275
	 *
	 */
	private class Ingredient {//カクテルクラスのメンバとしてクラスが宣言されている

		/**
		 * 1mlあたりの単価
		 */
		private double _price;
		/**
		 * 材料
		 */
		private String _name;
		/**
		 * 分量
		 */
		private int _quantity;

		/**
		 * コンストラクタ
		 * @param name 材料名
		 * @param price 1mlあたりの単価
		 * @param quantity 分量
		 */
		public Ingredient(String name, double price, int quantity){
			_name = name;
			_price = price;
			_quantity = quantity;
		}

		/**
		 * この材料のコストを計算するメソッド
		 * @return この材料のコスト
		 */
		public int getCost() {
			BigDecimal bigCost = new BigDecimal(_price * _quantity);
			bigCost = bigCost.setScale(0, BigDecimal.ROUND_HALF_EVEN);
			return bigCost.intValue();

		}
	}
		/**
		 * 材料リスト
		 */
		private ArrayList<Ingredient> _ingredients = new ArrayList<Ingredient>();

		/**
		 * カクテル名
		 */
		private String _name;

		/**
		 * コンストラクタ
		 * @param name　カクテル名
		 */
		public Cocktail(String name) {
			_name = name;
		}

		/**
		 * カクテルの材料を登録するメソッド
		 * @param name
		 * @param price
		 * @param quantity
		 */
		public void addIngredient(String name, double price, int quantity) {
			// TODO 自動生成されたメソッド・スタブ
			Ingredient ingredient = new Ingredient(name, price, quantity);
			_ingredients.add(ingredient);
		}

		/**
		 * このカクテルのレシピを得るメソッド
		 * @return
		 */
		public String getRecipe() {
			StringBuffer sb = new StringBuffer();
			sb.append(_name);
			sb.append("のレシピ\n");
			for(Ingredient ing : _ingredients) {
				sb.append(ing._name);
				sb.append(":");
				sb.append(ing._quantity);
				sb.append("mm\t");
			}
			return sb.toString();

		}

		public int getCost() {
			int cost = 0;
			for(Ingredient ing : _ingredients) {
				cost += ing.getCost();
			}
			return cost;
		}

	}

