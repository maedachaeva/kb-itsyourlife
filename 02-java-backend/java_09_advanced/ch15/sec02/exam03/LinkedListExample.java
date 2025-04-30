package java_09_advanced.ch15.sec02.exam03;

import java_09_advanced.ch15.sec02.exam01.Board;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Board> boards = new LinkedList<>();

        //subject content writer
        boards.add(new Board("subject1", "content1", "writer1"));
        boards.add(new Board("subject2", "content2", "writer2"));
        boards.add(new Board("subject3", "content3", "writer3"));
        boards.add(new Board("subject4", "content4", "writer4"));
        boards.add(new Board("subject5", "content5", "writer5"));

        // ArrayList에 저장된 요소의 개수
        System.out.println(boards.size());
        System.out.println();

        // 3번째 데이터
        System.out.println(boards.get(2).getSubject() + " " + boards.get(2).getContent() + " " + boards.get(2).getWriter());
        System.out.println();

        // 일반 for문 - 리스트의 각 요소
        for (int i = 0; i < boards.size(); i++) {
            System.out.println(boards.get(i).getSubject() + " " + boards.get(i).getContent() + " " + boards.get(i).getWriter());
        }
        System.out.println();

        boards.remove(2);
        boards.remove(2);

        for (Board board : boards) {
            System.out.println(board.getSubject() + " " + board.getContent() + " " + board.getWriter());
        }
    }
}