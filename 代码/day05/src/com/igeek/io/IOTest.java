package com.igeek.io;

import java.io.FileWriter;
import java.io.IOException;

public class IOTest {

	public static void main(String[] args) throws Exception {
		//IO  输入输出流  。InputStream  OutputStream ...
		
		//从计算机硬盘读取内容到java程序    输入  InputStream
		
		//从java程序输出内容到计算机    输出  OutputStream 
		
		//字符流 (主要读取文本相关的内容)。字节流
		
		//输出流 。  注意  先抛出异常  。  注意：针对windows 操作系统 文件的分隔符  可以使 \\  也可以是  /
		// 针对 Linux操作系统   /
		FileWriter fw = new FileWriter("d:/hello.txt",true);//添加true表示不会覆盖原有内容。
		
		fw.write("\r\n");//windows 下的换行    \r\n      linux \n   mac  \r
		fw.flush();
		fw.write("...");
		fw.flush();//方法的作用将内存中的数据，写入到文件中。
		
		fw.write("...");
		fw.flush();//刷新花冲去后，流对象还是可以正常使用 。注意，这种方式会把文件中的原有内容给替换掉。
		
		
		fw.write("ABCDEFG", 2, 3);
		
		char  [] c ={'你','号','中','国'};
		fw.write(c);
		
		fw.write(c, 0, 2);
		
		fw.write(97); // 97 97对应的字符 ？？？   注意：当调用int类型方法的时候，实际写入的是   这个数字所对应的字符(Unicode)
		
		fw.close();//关闭流 。  close 在调用的时候  会先刷新缓冲区中的数据 ，把数据写入到文件中，再关闭流。
		
		//
	}

}
