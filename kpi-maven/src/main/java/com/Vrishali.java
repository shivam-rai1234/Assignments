package com;

public class Vrishali extends EmployeeAbstract  implements Runnable{

	@Override
	int roll_no() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	int id() {
		// TODO Auto-generated method stub
		return 1-10;
	}

	@Override
	int mobno() {
		// TODO Auto-generated method stub
		return 987654323;
	}

	@Override
	int adharno() {
		// TODO Auto-generated method stub
		return 876765;
	}

	@Override
	int bankacc() {
		// TODO Auto-generated method stub
		return 1210;
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
		return 57;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("vrishali is also using thread");
		
	}
public static void main(String args[])
{
	
	Thread t10=new Thread("employee 10");
	t10.start();
}
}
