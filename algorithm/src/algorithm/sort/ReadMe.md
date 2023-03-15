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
