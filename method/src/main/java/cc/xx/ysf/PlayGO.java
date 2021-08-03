package cc.xx.ysf;

import cc.xx.ysf.service.SayHello;
import cc.xx.ysf.serviceImpl.SayHelloImpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PlayGO {
	public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		/**
		 * 使用对象调用
		 */
//		SayHello sayHello = new SayHelloImpl();
//		sayHello.toSayHellos("王五");

		/**
		 * 使用反射调用
		 * 核心 method类 用它来替代目标类中的方法
		 */
		//使用反射机制执行toSayHellos方法； method是关键
		SayHello target = new SayHelloImpl();
		//获取SayHelo中的方法tosayhello()
		Method method = SayHello.class.getMethod("toSayHellos",String.class);
		//通过method可以执行tasayhello()方法
		/**
		 * invoke()是method中的一个方法 用来表示执行方法的调用
		 *  参数：1 Object 表示对象 要执行这个对象的方法
		 *      2 Object... arg 方法执行时的参数值
		 *返回值 Object
		 */
		//此时 method 代表 toSayHellos 方法
		//方法的执行 指定方法的对象 target
		// 传入方法的参数
		method.invoke(target,"李四");

			//同样的 如果接口有其他的实现 传入新的实例对象 依然用method执行
			//SayHello target2 = new SayHelloImpl2(); //2里有新的实现
			//method.invoke(target2,"李四"); //method上面实现

	}
}
