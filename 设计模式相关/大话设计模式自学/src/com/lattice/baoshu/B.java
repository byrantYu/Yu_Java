package com.lattice.baoshu;

public class B {  
	   
    public static void main(String[] args) {  
        String srcStr1 = "我ABC";  
        String srcStr2 = "我ABC汉DEF";  
   
        splitString(srcStr1, 4);  
        splitString(srcStr2, 6);  
    }  
   
    public static void splitString(String src, int len) {  
        int byteNum = 0;  
   
        if (null == src) {  
            System.out.println("The source String is null!");  
            return;  
        }  
   
        byteNum = src.length();  
        byte bt[] = src.getBytes(); // 将String转换成byte<a href="https://www.baidu.com/s?wd=%E5%AD%97%E8%8A%82%E6%95%B0%E7%BB%84&tn=44039180_cpr&fenlei=mv6quAkxTZn0IZRqIHckPjm4nH00T1Y3nyf3PycYm1IWrHT4njf10ZwV5Hcvrjm3rH6sPfKWUMw85HfYnjn4nH6sgvPsT6KdThsqpZwYTjCEQLGCpyw9Uz4Bmy-bIi4WUvYETgN-TLwGUv3EnWmvnHb3njfkrHfsP1Dkrj6d" target="_blank" class="baidu-highlight">字节数组</a>  
   
        if (len > byteNum) {  
            len = byteNum;  
        }  
   
        // 判断是否出现了截半，截半的话字节对于的ASC码是小于0的值  
        if (bt[len] < 0) {  
            String subStrx = new String(bt, 0, --len);  
            System.out.println("subStrx==" + subStrx);  
        } else {  
            String subStrx = new String(bt, 0, len);  
            System.out.println("subStrx==" + subStrx);  
        }  
    }  
   
}