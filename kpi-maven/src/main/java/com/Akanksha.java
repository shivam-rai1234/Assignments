package com;

public class Akanksha extends EmployeeAbstract implements Runnable{

	@Override
	int roll_no() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	int id() {
		// TODO Auto-generated method stub
		return 1-1;
	}

	@Override
	int mobno() {
		// TODO Auto-generated method stub
		return 1234567890;
	}

	@Override
	int adharno() {
		// TODO Auto-generated method stub
		return 987654578;
	}

	@Override
	int bankacc() {
		// TODO Auto-generated method stub
		return 1218;
	}

	@Override
	long salary() {
		// TODO Auto-generated method stub
		return 17800;
	}

	@Override
	long height() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	long weight() {
		// TODO Auto-generated method stub
		return 52;
	}
//this is method of thread which is interface of Runnable
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("akanksha is used in thread");
		
	}
	
	public static void main(String arg[]) {
//here with the help of Thread class we directly create obj and inherit there property
		Thread t1=new Thread(" employee number 1");
		t1.start();
		
	}
}
