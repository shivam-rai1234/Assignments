package com;

public class Payal_pitale extends EmployeeAbstract implements Runnable{

	@Override
	int roll_no() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	int id() {
		// TODO Auto-generated method stub
		return 1-5;
	}

	@Override
	int mobno() {
		// TODO Auto-generated method stub
		return 736482642;
	}

	@Override
	int adharno() {
		// TODO Auto-generated method stub
		return 286434;
	}

	@Override
	int bankacc() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	long salary() {
		// TODO Auto-generated method stub
		return 1216;
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
		System.out.println("payal using thread");
		
	}
public static void main(String args[])
{
	Thread t5=new Thread("employee 5");
	t5.start();
	}
}
