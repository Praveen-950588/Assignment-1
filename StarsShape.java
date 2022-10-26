package com.praveen;

public class StarsShape {

	public static void main(String[] args) {
		 System.out.println("shape 1");
		shape1(20);
		      
		 shape2(20);
		 shape3(20);
	}
    public static void shape1(int n) {
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<n;j++ ) {
    			if(j==0&&i<=(n-1)/2||i==0||j==0||j==(n-1)||i==(n-1)||i+j<=(n-1)/2||j-i>=(n-1)/2){
    			System.out.print("* ");
    		}else {
    			System.out.print("  ");
    		}
    			
    		}
    		System.out.println();
    	}
    	System.out.println("shape 2");
    }
    
    public static void shape2(int n) {
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<n;j++ ) {
    			if(j==0&&i<=(n-1)/2||i==0||j==0||j==(n-1)||i==(n-1)||i+j<=(n-1)/2||i-j>=(n-1)/2){
    			System.out.print("* ");
    		}else {
    			System.out.print("  ");
    		}
    			
    		}
    		System.out.println();
    	}
    	System.out.println("shape 3");
    }
    public static void shape3(int n) {
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<n;j++ ) {
    			if(j==0&&i<=(n-1)/2||i==0||j==0||j==(n-1)||i==(n-1)||i+j>=n+(n-1)/2||i-j>=(n-1)/2){
    			System.out.print("* ");
    		}else {
    			System.out.print("  ");
    		}
    			
    		}
    		System.out.println();
    	}
    }
}
