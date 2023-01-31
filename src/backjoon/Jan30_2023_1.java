package backjoon;

import java.util.Scanner;

import java.util.*;

class Jan30_2023_1 {
    public class Position{
        public int x; // 좌표
        public int y;// 좌표
        public int level;

        public Position(int x, int y,int level) {
            this.x = x;
            this.y = y;
            this.level =level;

        }
    }
    public int solution(int[][] maps) {

    int count=1;
        int answer = -1;
        int n = maps.length;
        int m = maps[0].length;

        Queue<Position> queue = new LinkedList<>();
        //1은 갈수이뜸
        //0은 못감!
        queue.add(new Position(0, 0,1));
        maps[0][0] = 0;


        while(!queue.isEmpty()) {
            Position current = queue.poll();//올라탄놈 위치 지우고 반환

            if(current.x == n-1 && current.y == m-1) {//마지막 maps[n][m]에 도착하면 멈춰
                answer = current.level;
                break;
            }
            if(current.x > 0 && maps[current.x-1][current.y] == 1) {
                // 현재 x가 0보다 크고  맵스의 위쪽이 갈수 있으면
                maps[current.x-1][current.y] = 0;//한번 갔으니 명시적 목적 으로 0대입
                 queue.add(new Position(current.x-1, current.y, current.level+1)); //큐에 자리 연결

            }

            if(current.x < n-1 && maps[current.x+1][current.y] == 1) {
                //맨밑에 아니고  밑에 갈수 있으면
                maps[current.x+1][current.y] = 0;//
                queue.add(new Position(current.x+1, current.y,current.level+1));
            }

            if(current.y > 0 && maps[current.x][current.y-1] == 1) {
                //좌
                maps[current.x][current.y-1] = 0;
                queue.add(new Position(current.x, current.y-1,current.level+1));
            }

            if(current.y < m-1 && maps[current.x][current.y+1] == 1) {
                maps[current.x][current.y+1] = 0;
                queue.add(new Position(current.x, current.y+1,current.level+1));
            }
        }

        return answer;
    }


}

