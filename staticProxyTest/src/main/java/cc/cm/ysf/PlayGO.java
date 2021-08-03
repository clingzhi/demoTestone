package cc.cm.ysf;

import cc.cm.ysf.changjia.UsbFactory;
import cc.cm.ysf.service.USBSell;
import cc.cm.ysf.shangjia.TaobaoShangJia;
import com.sun.org.apache.bcel.internal.generic.FLOAD;

public class PlayGO {
	public static void main(String[] args) {
		TaobaoShangJia jia = new TaobaoShangJia();
		float jiage = jia.sell(4);
		System.out.println("在淘宝买4个的价格："+jiage);

	}
}
