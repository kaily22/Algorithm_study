# 스택/큐 #

**같은 숫자는 싫어! (level1)**

: 주어진 배열에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하는 문제

*혼자 생각해 본 방법

stack에 값들을 담을 때 비교해서 같은 숫자가 오면

pop해서 빼주고 → 배열에 담기..?

→ 대부분의 해설 : ArrayList 사용 

***Stack사용**

```sql
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
    
			//스택 선언
        Stack<Integer> stack = new Stack<>();
        

			//향상된 for문
        for(int n : arr) {

			//스택이 비어있거나 들어오는 값과 같지 않으면
			//스택에 add(push)해줌
         if(stack.isEmpty() || stack.peek()!=n){
             stack.add(n);
         } 
        }

				//stack의 수만큼 answer배열 만듦
        int[] answer = new int[stack.size()];
        int index = 0;

				//들어오는 값, index값을 증가하여 배열 출력
        for(int n:stack) {
            answer[index++] = n;
        }
        return answer;
    }
}
```

***ArrayList를 사용**

```sql
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
    
		//ArrayList 선언
    ArrayList<Integer> list = new ArrayList<Integer>();
    
		//arr 배열 길이만큼 for문 돌리기
    for(int i=0; i<arr.length; i++) {
        if(i==0) {
						//처음 list에 값 넣기
            list.add(arr[i]);
        }else {
						//index하나 전 값과 현재 값이 같지 않으면
            if(arr[i] != arr[i-1]) {
								//list에 값 넣기
                list.add(arr[i]);
            }
        }
    }
        
		//list 개수만큼 answer배열 선언
    int[] answer = new int[list.size()];

		//list개수만큼 for문 돌려서 answer값 출력
    for(int i=0; i<list.size(); i++) {
				//list에 get해서 answer배열에 넣기
        answer[i] = list.get(i);
    }
        
    return answer;
}
}
```
