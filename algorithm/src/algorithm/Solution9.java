package algorithm;

//프로그래머스 level1 가운데 글자 가져오기
public class Solution9 {

	public static void main(String[] args) {
		
	String s = "abcde";
	String answer = "";
	
	if(s.length()%2==0) {
		answer = s.substring(s.length()/2-1, s.length()/2+1);
	}else {
		answer = s.substring(s.length()/2, s.length()/2+1);
	}
		System.out.println(answer);
	}

}
