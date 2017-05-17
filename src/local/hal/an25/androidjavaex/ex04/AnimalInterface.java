/**
 *
 */
package local.hal.an25.androidjavaex.ex04;

/**
 * 動物を表すインターフェース
 * @author ohs60275
 *
 */
public interface AnimalInterface {
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
