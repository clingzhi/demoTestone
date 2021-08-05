package cc.cm.ysf.shangjia;

import cc.cm.ysf.changjia.UsbFactory;
import cc.cm.ysf.service.USBSell;

/**
 * 淘宝是商家 是代理King的代理 实现销售功能
 */
public class TaobaoShangJia implements USBSell {
	/**
	 * 声明厂家是谁
	 */
	private USBSell usbSellFactoy = new UsbFactory();
	//商家销售
	@Override
	public float sell(int count) {
		//出厂价
		float chuchangjia = usbSellFactoy.sell(count);
		//售价
		float shoujia = ((chuchangjia/count)+20) * count;
		return shoujia;
	}
}
