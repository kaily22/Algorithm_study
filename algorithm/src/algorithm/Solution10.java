package algorithm;

//프로그래머스 leve1 부족한 금액 계산하기
public class Solution10 {

	public static void main(String[] args) {
		
		int price = 3;	//놀이기구 가격
		int money = 20;	//현재 가지고있는 돈
		int count = 4;	//놀이기구를 탈 수 있는 횟수(놀이기구 가격만큼 증가)
		 
		int sum = 0;
		long answer = -1;
		
		for(int i=1; i<=count; i++) {
			sum+=price*i;
		}
		if(sum>money) 
			answer = sum - money;
			System.out.println(answer);
		
	}
}
