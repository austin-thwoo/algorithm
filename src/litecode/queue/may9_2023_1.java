package litecode.queue;

import java.util.PriorityQueue;

class may9_2023_1 {

    public int findKthLargest(int[] nums, int k) {


        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);

        for (int num : nums) {
            heap.offer(num);//순서대로 들어감?지않음
        }


        for (int i = 0; i < k - 1; i++) {
            heap.poll();//히피파이 같이됨?
        }
        return heap.poll();

    }

//    public int kthSmallest(int[][] matrix, int k) {
//
//        // 이차원 배열을 List<int[]>으로 변환
//        int[][] list = Arrays.stream(matrix)
//                .map(row -> Arrays.stream(row).toArray())
//                .toArray(int[][]::new);
//
//        // List<int[]>의 요소를 우선순위 큐에 추가
//        PriorityQueue<Integer> pq = Arrays.stream(list)
//                .flatMapToInt(Arrays::stream)
//                .boxed()
//                .collect(Collectors.toCollection(PriorityQueue::new));
//// 우선순위 큐에 리스트의 모든 요소를 추가
//        q.addAll(list);
//        for (int i = 0; i < k - 1; i++) {
//            q.poll();//히피파이 같이됨?
//        }
//        return q.poll();
//    }
}

