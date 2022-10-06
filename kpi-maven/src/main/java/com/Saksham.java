package com;

public  class Saksham extends EmployeeAbstract implements Runnable{

	@Override
	int roll_no() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	int id() {
		// TODO Auto-generated method stub
		return 1-6;
	}

	@Override
	int mobno() {
		// TODO Auto-generated method stub
		return 873648724;
	}

	@Override
	int adharno() {
		// TODO Auto-generated method stub
		return 977634;
	}

	@Override
	int bankacc() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	long salary() {
		// TODO Auto-generated method stub
		return 17800;
	}

	@Override
	long height() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	long weight() {
		// TODO Auto-generated method stub
		return 72;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("saksham is also using thread");
		
	}
public static void main(String args[])
{
	Thread t6=new Thread("employee 6");
	t6.start();
	
}
}
