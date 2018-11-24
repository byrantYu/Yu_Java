package com.lattice.interpreter;

/**
 * @use 以音乐播放器代码测试解释器模式
 * @author lattice
 * @date 2017-01-10
 */
public class Interpreter {

	public static void main(String[] args) {
		PlayContext context=new PlayContext();
		context.playText="0 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5"
				+ " A 0.5 0 3 C 1 0 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ";
		Expression expression=null;
		try {
			while(context.playText.length()>0){
				String str=context.playText.substring(0, 1);
				switch(str){
				case "0":
					expression=new Scale();
					break;
				case "C":
				case "D":
				case "E":
				case "F":
				case "G":
				case "A":
				case "B":
				case "P":
					expression=new Note();
					break;
				}
				expression.interpret(context);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		/**
		 * 输出结果
		 * 中音356352356高音1中音65132
		 */

	}

}
/**
 * 播放内容类
 * @author lattice
 *
 */
class PlayContext{
	private String text;
	public String playText;
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
/**
 * 表达式类
 * @author lattice
 *
 */
abstract class Expression{
	//解释器
	public void interpret(PlayContext context){
		if(context.playText.length()==0){
			return;
		}else{
			String playKey=context.playText.substring(0, 1);
			context.playText=context.playText.substring(2);
			double playValue=Double.parseDouble(context.playText.substring(0, context.playText.indexOf(" ")));
			context.playText=context.playText.substring(context.playText.indexOf(" ")+1);
			excute(playKey, playValue);
		}
	}
	public abstract void excute(String key,double value);
}
/**
 * 音符类
 * @author lattice
 *
 */
class Note extends Expression{

	@Override
	public void excute(String key, double value) {
		String note="";
		switch(key){
		case "C":
			note="1";
			break;
		case "D":
			note="2";
			break;
		case "E":
			note="3";
			break;
		case "F":
			note="4";
			break;
		case "G":
			note="5";
			break;
		case "A":
			note="6";
			break;
		case "B":
			note="7";
			break;
		}
		System.out.print(note);
	}
	
}
/**
 * 音符类
 * @author lattice
 *
 */
class Scale extends Expression{

	@Override
	public void excute(String key, double value) {
		String scale="";
		int intValue=(int)value;
		switch(intValue){
		case 1:
			scale="低音";
			break;
		case 2:
			scale="中音";
			break;
		case 3:
			scale="高音";
			break;
		}
		System.out.print(scale);
	}
}

