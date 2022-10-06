package com;

public class Vaishnavi extends EmployeeAbstract implements Runnable{

	@Override
	int roll_no() {
		// TODO Auto-generated method stub
		return 9;
	}

	@Override
	int id() {
		// TODO Auto-generated method stub
		return 1-9;
	}

	@Override
	int mobno() {
		// TODO Auto-generated method stub
		return 836428914;
	}

	@Override
	int adharno() {
		// TODO Auto-generated method stub
		return 24343;
	}

	@Override
	int bankacc() {
		// TODO Auto-generated method stub
		return 1219;
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
		return 60;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("vaishnavi is also use thread");
		
	}
public static void main(String args[])
{
	Thread t9=new Thread("employee 9");
	t9.start();
}
}
