# 정렬 #
**1.K번째 수**

*혼자 생각해본 방법

```java
import java.util.Arrays;

public class Programmers_sort1 {
    public static void main(String[] args) {

        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};

        for(int a=0; a<commands.length; a++) {
            int i = commands[a][0];
            int j = commands[a][1];
            int k = commands[a][2];

            for(int b=0; b<array.length; b++){
//                int[] result = array[i-1]~array[j-1] 출력
                //            Arrays.sort(result);
                //result에서 k값 -> result[k-1];
            }
            //answer에 result[k-1]값들 넣어주자
        }

    }
}
```

*풀이

i,j,k 구하는 것 까진 맞음

**Arrays.copyOfRange(원본 배열, 복사할 시작인덱스, 복사할 끝 인덱스)**

→ 쉽게 풀 수 있다.

1. **가장 큰 수**
- 내가 생각해 본 풀이
    
    1) 배열에서 for문으로 첫번째 자리 비교해서 → 가장 높은게 먼저
    
    2) 첫번째 자리 비교는 가장 앞
    
    3) sort → String 으로 변환
    
    *풀이
    
    ```java
    import java.util.*;
    class Solution {
        public String solution(int[] numbers) {
            String[] stringNumbers = new String[numbers.length];
            //int형 배열 -> String으로 바꿈
            for(int i =0; i<numbers.length; i++) {
                stringNumbers[i]  = Integer.toString(numbers[i]);
            }
            
            //두 수를 번갈아가며 합친 수 중 큰 값을 앞으로 정렬(내림차순)
            Arrays.sort(stringNumbers, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return (o2+o1).compareTo(o1+o2);
                }
            });
            
            if(stringNumbers[0].equals("0")) return "0";
            
            //문자열을 delimiter("") 기준으로 합침
            return String.join("", stringNumbers);
        }
    }
    ```
    
    *new Comparator Override를 사용하여 값을 비교한다.
    
    `Comparator`는 Java에서 두 개 이상의 객체를 비교할 때 사용하는 인터페이스입니다.
    
    `Comparator` 인터페이스를 구현하는 클래스에서는 `compare` 메서드를 **오버라이딩하여 두 객체를 비교합니다.**
    
    보통 `Comparator`는 **정렬 알고리즘에**서 사용됩니다.
    
    위 예시에서는 `Arrays.sort` 메서드를 사용하여 `String` 배열을 정렬할 때 `compare` 메서드를 구현한 `Comparator` 클래스를 인자로 넘겨주었습니다.
    
    `compare` 메서드에서는 두 문자열을 이어 붙인 결과를 비교하여 크기를 비교하고, 그 결과를 반환합니다. 이를 통해 두 개의 문자열을 비교하여 정렬할 수 있습니다.
    
1. **h-Index**
- 내림차순으로 정렬
- h번 이상 인용된 논문의 수가 h편 이상이면 h의 최댓값
- h번 이상 인용된 논문이 h편 미만이면 h는 h번 이상 인용된 논문의 수와 같음

*내가 생각한 풀이

1) Arrays.sort로 오름차순

2) for문 돌려서 값 비교

```java
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
```
