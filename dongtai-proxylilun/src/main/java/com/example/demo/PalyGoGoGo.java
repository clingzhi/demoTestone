package com.example.demo;

import com.example.demo.changjia.UsbFactory;
import com.example.demo.headler.proxyHeadler;
import com.example.demo.service.USBSell;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class PalyGoGoGo {
	/**
	 * 这里完成
	 * 1创建代理对象 2使用Proxy
	 */
	public static void main(String[] args) {
		// 1 创建目标对象
		USBSell factory= new UsbFactory();
		// 2 创建InvocationHandler对象  传入目标对象
		InvocationHandler handler = new proxyHeadler(factory);

		// 3 创建代理对象
		/**
		 * 参数：
		 * (ClassLoader loader,
		 *  @NotNull Class<?>[] interfaces,
		 *  @NotNull reflect.InvocationHandler h
		 *      返回值是Object
		 *      要转换为对象的接口
		 */
		USBSell Proxys = (USBSell) Proxy.newProxyInstance(factory.getClass().getClassLoader(),
								factory.getClass().getInterfaces(),
								handler);
		//通过代理执行方法
		float dailishoujia = Proxys.sell(2);
		System.out.println("动态代理售价"+dailishoujia);

	}
}
