package local.hal.an25.androidjavaex.ex02;

public interface InterfaceExample {

	int NUM = 200;

	/**
	 * 名前を得るメソッド
	 * @return
	 */
	String getName();

	/**
	 * NUMの何倍かを計算するメソッド。何倍かは実装クラスによって違う
	 * @return NUMを何倍かした値を得るメソッド
	 */
	int fooTimes();

	/**
	 * このインターフェースを実装したクラスのコメントを得るメソッド
	 * @return コメントを表す文字列
	 */
	String getComment();

	/**
	 * 無意味なメソッド
	 */
	void fooMethod();
}
