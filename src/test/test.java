package test;

import java.util.HashMap;
import java.util.Map;

/**
 * 
    * @ClassName: test
    * @Description: 
    * @author HUWEIV
    * @date 2020年10月14日
    *
 */
public class test {

	/**
	 * 
	    * @Title: main
	    * @Description: 
	    * @param @param args    参数
	    * @return void    返回类型
	    * @author HUWEIV
	    * @date 2020年10月14日
	    * @throws
	 */
	public static void main(String[] args) {
		String s = "MCMXCVI";
		Integer sum = 0;
		Map<String, Integer> model = new HashMap<String, Integer>();
		model.put("I", 1);
		model.put("V", 5);
		model.put("X", 10);
		model.put("L", 50);
		model.put("C", 100);
		model.put("D", 500);
		model.put("M", 1000);
		model.put("IV", 4);
		model.put("IX", 9);
		model.put("XL", 40);
		model.put("XC", 90);
		model.put("CD", 400);
		model.put("CM", 900);
		for(int i  = 0; i < s.length(); i++) {
			if(i + 1 < s.length() && model.containsKey(s.substring(i, i + 2))) {
				sum += model.get(s.substring(i, i + 2));
				i++;
			}
			else{
				sum += model.get(s.substring(i, i + 1));
			}

		}
		System.out.println(sum);
		
	}

}
