package backjoon;

import java.util.*;

class Jan30_2023_2 {

    public int solution() {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        int answer = 1;
        PriorityQueue<Integer> que = new PriorityQueue<>(Comparator.reverseOrder());//우선순위가 반대로 구성되는 큐를 생성한다
        for (int i : priorities) {//큐순서대로 정렬--> 가장큰값이 첫번째로 온다.
            que.offer(i);
            System.out.println(que);

        }
        System.out.println("큐앞값:" + que.peek());
        while (!que.isEmpty()) {//큐가빈값이아님
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i]==que.peek()) {//prioriti가 최댓값이면
                    if (location==i){
                        return answer;

                    }
                    answer++;
                    que.poll();//최댓값 뺴준다-->

                }

            }


        }
        return answer;
   }
}

