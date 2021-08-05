package com.example.demo.headler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理类
 */
public class proxyHeadler implements InvocationHandler {
	// 设置动态的对象
	private Object targer = null;
	// 动态代理 ，代理的对象是活动的 是传入进来的
	// 传入的是谁 就给谁创建对象
	public proxyHeadler (Object targer){
		//此时就是目标对象 赋值为目标对象
		this.targer=targer;
	}
	/**
	 * 实现InvocationHandler 重写 invoke()方法
	 *  此处要完成 1调用目标方法 2 功能增强
	 *
	 * @param proxy  --参数一 Object proxy： 代理对象，
	 * @param method --参数二  Method method ： 代表方法；
	 * @param args   --参数二 Object[] args :参数
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//原来静态中调用目标方法 	//出厂价
//float chuchangjia = usbSellFactoy.sell(count);
		/**
		 * 现在 动态传入 目标对象 和参数
		 * method.invoke 就是执行目标对象中的 方法
		 * 传的是哪个对象 就执行谁的方法
		 * 返回值为Object
		 */
		Object res = method.invoke(targer, args);
//原来静态中增强   //售价
//float shoujia = ((chuchangjia/count)+20) * count;
		/**
		 *动态增强部分
		 */
		if (res != null){
			float chuchangjia = (float) res;
			float shoujia = chuchangjia+100;
			res =  shoujia;
		}
		System.out.println("增强后，由动态代理输出"+res);
		return res;
	}
}
