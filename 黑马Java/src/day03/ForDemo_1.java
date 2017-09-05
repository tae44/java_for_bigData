package day03;

/*
     利用for循环,计算1+4的结果
	 1 + 2 + 3 + 4 = 10
*/
public class ForDemo_1{
	public static void main(String[] args){
		int sum = 0;
		for(int i = 1 ; i <= 4 ; i++){
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
