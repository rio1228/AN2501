package local.hal.an25.androidjavaex.ex01;

public abstract class AbstractAnimal {

	/**
	 * その動物の愛称を示すフィールド
	 */

	private String _name;

	/**
	 * 愛称フィールドのセッター
	 */
	public void setName(String name){
		_name = name;
	}
	/**
	 * 愛称フィールドのゲッター
	 */
	public String getName(){
		return _name;
	}

	/**
	 * 鳴き声のメソッド
	 * @return 鳴き声
	 */
	public abstract String call();//抽象的なものには絶対abstractが必要
}
