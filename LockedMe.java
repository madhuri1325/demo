package com.simplilearn.phase1project;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class LockedMe {
	

public static void main(String[] args) throws IOException  {

	Scanner sc= new Scanner(System.in);
	boolean flag5=true;
	while(true)
	{
	System.out.println("select 1 option to display all  file");
	System.out.println("select 2 for submenu");
	
	System.out.println("select 3 to exit from files");
	int choice= sc.nextInt();
	
	String path = "D:\\files";
	boolean flag1=true;
	while(true) {
		switch(choice)
	
	{
	case 1 :
	
	
	File f=new File(path);
	File[] files =f.listFiles();
	for(File ff:files)
	{
		System.out.println(ff.getName());
	}
	case 2:
	System.out.println("Enter choice \n a.add \n b.search \n c.delete");
	
	char ch =sc.next().charAt(0);
	switch(ch)
	{
	
	case'a':
		
		System.out.println("enter the file in the directory ");
		String filename51=sc.next();
		//File
		File f1=new File(path+filename51);
		//create a new file
		boolean b15=f1.createNewFile();
		if(b15!=true) {
			System.out.println("file not created");
		}
		else {
			System.out.println("file created in the path" +path);
		}
		break;
	case 'b':
		String path1 = "D:\\files";
		System.out.println("enter the file to be searched" );
	String filename1=sc.next();
	//File
	File f2=new File(path1);
	File filenames[]=f2.listFiles();
	int flag=0;
	for(File ff: filenames) {
		System.out.println(ff.getName()+ "   " +filename1);
		if(ff.getName().equals(filename1)) {
			flag=1;
			break;
		}
		else {
			flag=0;
		}
	}
	
	if(flag==1) {
		System.out.println("the file is found");
	}
	else {
		System.out.println("file is not found");
	}
	
	break;
	case 'c':
		
		System.out.println("enter the file to be deleted");
		String filename511=sc.next();
		//File
		File f11=new File(path+filename511);
		//delete a file
		f11.delete();
		
		System.out.println("file is deleted");
		break;

	case 3:
		System.out.println("exit from program");
		System.exit(0);
	default:
		
		System.out.println("Invalid Input \nValid Input ");
		break;
}
	
}
	
break;

	
}
	
}
}

}	

