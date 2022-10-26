package com.praveen;

public class Stars {

	public static void main(String[] args){
	  ineuron(10);
	}
	public static void ineuron(int n) {
		
    	for(int i=0;i<n;i++) {
    		
    		for(int j=0;j<n;j++ ) {
    			if(i==0||i==(n-1)||j==(n-1)/2){
    			System.out.print(" * ");
    		}else {
    			System.out.print("   ");
    		}
    		}
    		System.out.print(" ");
    		
    		for(int j=0;j<n;j++ ) {
    			if(j==0||j==(n-1)||i==j){
    			System.out.print("* ");
    		}else {
    			System.out.print("   ");
    		}
    		}
    		System.out.print("  ");
    		for(int j=0;j<n;j++ ) {
    			if(i==0||i==(n-1)||i==(n-1)/2||j==0){
    			System.out.print("* ");
    		}else {
    			System.out.print("   ");
    		}
    		}
    		System.out.print("  ");
    		
    		for(int j=0;j<n;j++) {
    			if(j==0||j==(n-1)){
    			System.out.print("* ");
    		}else {
    			System.out.print("   ");
    		}
    		}
    		System.out.print(" ");
    		for(int j=0;j<n;j++ ) {
    			if(j==0||i==0||j<=(n-1)/2){
    			System.out.print("* ");
    		}else {
    			System.out.print("   ");
    		}
    		}
    		System.out.println();
    	}
    	
	}

}
