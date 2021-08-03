package cc.xx.ysf.serviceImpl;

import cc.xx.ysf.service.SayHello;

public class SayHelloImpl implements SayHello {

	@Override
	public void toSayHellos(String name) {
		System.out.println("你好：" + name);
	}
}
