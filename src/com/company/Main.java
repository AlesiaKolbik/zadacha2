package com.company;

public class Main {

    public static void main(String[] args) {
	int n=(int)(Math.random()*25+1000);
        {
            if (n % 10 == 1) {
                System.out.println(+n + " рубль");}
            if (n % 10 >= 2 && n % 10 <= 4 ) {
                System.out.println(+n + " рубля");}
             if(n%10>=5 && n%10<=19 || n%10==0){
                System.out.println(+n+" рублей");}
            }
        }
    }
