package com.example.demo.changjia;


import com.example.demo.service.USBSell;

/**
 *  目标类 厂家不接受用户单独购买
 */
public class UsbFactory implements USBSell {
	@Override
	public float sell(int count) {
		/**
		 * 单价和总价
		 */
		System.out.println("目标类中开始执行目标方法。。。。。");
		float one = 50.1f;
		float tout = one*count;
		return tout;

	}
}
