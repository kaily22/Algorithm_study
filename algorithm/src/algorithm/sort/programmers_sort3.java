import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        //오름차순으로 정렬
        Arrays.sort(citations);
        
        //n편 중 h번 이상 인용된 논문이 h편 이상일 때 h의 최대값이 h-Max
        int h; 
        for(int i=0; i<citations.length; i++) {
            //i 일때 가장 큰 h값(논문 편수)
            h = citations.length-i;
            if(citations[i] >= h) {
                answer = h;
                break;
            }   
        }
        return answer;
    }
}
