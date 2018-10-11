package main.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FachKlasse {
	private int[] zahlen;
	
	public FachKlasse(int amount){
		zahlen = new int[amount];
		init();
	}
	
	private void init(){
		for(int i=0;i<zahlen.length;i++){
			zahlen[i] = 0;
		}
	}
	
	public void sortieren(){
		Arrays.sort(zahlen);
	}
	
	public void print(){
		for(int i=0;i<zahlen.length;i++){
			if(zahlen[i]!=0){
				System.out.println(zahlen[i]);
			}
		}
	}
	
	public void set(int ptr, int number){
		zahlen[ptr] = number;
	}
	
	public int get(int ptr){
		return zahlen[ptr];
	}
	
	public int[] getArray(){
		return zahlen;
	}
	
	public int size(){
		return zahlen.length;
	}
	
	public boolean isFull(){
		int amount = 0;
		for(int num : zahlen){
			if(num != 0)
				amount++;
		}
		if(amount == zahlen.length)
			return true;
		return false;
	}
	
	@SuppressWarnings("resource")
	public void scan(int ptr){
		Scanner sc = new Scanner(System.in);
		zahlen[ptr] = sc.nextInt();
	}
	
}
