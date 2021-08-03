package cc.cm.ysf.changjia;

import cc.cm.ysf.service.USBSell;

/**
 * 厂家 目标类 不接受用户单独购买
 */
public class UsbFactory implements USBSell {
	@Override
	public float sell(int count) {
		/**
		 * 单价和总价
		 */
		float one = 99.99f;
		float tout = one*count;
		return tout;
	}
}
