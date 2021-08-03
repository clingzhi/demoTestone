package cc.cm.ysf.service;

/**
 * U盘销售
 * 表示功能 商家 厂家 都要完成的功能
 */
public interface USBSell {
	/**
	 * 参数表示销售的数量
	 * 返回值为价格
	 * @param count
	 * @return
	 */
	float sell(int count);


	/**
	 * ...
	 * 还可以继续定义其他多个接口
	 */
}
