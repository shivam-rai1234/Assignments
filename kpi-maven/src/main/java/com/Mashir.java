package com;

public class Mashir extends EmployeeAbstract implements Runnable{

	@Override
	int roll_no() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	int id() {
		// TODO Auto-generated method stub
		return 1-3;
	}

	@Override
	int mobno() {
		// TODO Auto-generated method stub
		return 678921345;
	}

	@Override
	int adharno() {
		// TODO Auto-generated method stub
		return 87387462;
	}

	@Override
	int bankacc() {
		// TODO Auto-generated method stub
		return 1214;
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
		return 57;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Mashir is also using thread");
		
	}
public static void main(String args[])
{
	Thread t3=new Thread("employee 3");
	t3.start();
	}
}
