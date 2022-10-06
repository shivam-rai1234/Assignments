package com;

public  class Anam_tamboli extends EmployeeAbstract implements Runnable{

	@Override
	int roll_no() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	int id() {
		// TODO Auto-generated method stub
		return 1-2;
	}

	@Override
	int mobno() {
		// TODO Auto-generated method stub
		return 987654321;
	}

	@Override
	int adharno() {
		// TODO Auto-generated method stub
		return 97764234;
	}

	@Override
	int bankacc() {
		// TODO Auto-generated method stub
		return 1318;
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
		return 56;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("anam is used in thread");
		
		
	}
 public static void main(String args[]) {
	 Thread t2=new Thread("employee 2");
	 t2.start();
 }
}
