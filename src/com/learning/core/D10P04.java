package com.learning.core.day10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class D10P04 {
	public static void main(String[] args) throws IOException {

			FileInputStream r=new FileInputStream("C:\\Users\\l_nirbhay_l\\Desktop\\source.txt");

			FileOutputStream w=new FileOutputStream("C:\\Users\\l_nirbhay_l\\Desktop\\destination.txt");
			
			int i;
			
			while((i=r.read())!=-1)

			{
				w.write((char)i);

			}

			System.out.println("file copied");			
			}
		}
