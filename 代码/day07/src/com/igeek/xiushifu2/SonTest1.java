package com.igeek.xiushifu2;

import com.igeek.xiushifu.Test1;

// 对于类的修饰符而言只能是public 或者 default  
public class SonTest1 extends Test1 {
	public void show(){
		System.out.println(age);
	}
	// 我们只演示了  修饰属性  ，修饰方法的时候  跟修饰属性的访问规则一致。
}
