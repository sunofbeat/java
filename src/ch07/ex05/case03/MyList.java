package ch07.ex05.case03;

import java.util.ArrayList;

public class MyList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		//List�� ������ key, value�� ��������
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		
		System.out.println(list);
		
		for(int i: list) System.out.println(i + " ");
		System.out.println();
		
		System.out.println(list.get(0));//list.add�� 0��°
		
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		System.out.println();
		/*
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.remove(i) + " ");
		*/
		
		//����] remove() list�� ��� ���Ҹ� �����϶�.
		/*int size = list.size();
		for(int i = 0; i < size; i++)
			list.remove(0);
			*/
		for(int i = list.size() - 1; i >= 0; i--)
			list.remove(i);
		System.out.println(list);
	}
}
