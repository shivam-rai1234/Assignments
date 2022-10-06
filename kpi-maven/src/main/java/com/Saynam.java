package com;

public class Saynam extends EmployeeAbstract implements Runnable{

	@Override
	int roll_no() {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	int id() {
		// TODO Auto-generated method stub
		return 1-7;
	}

	@Override
	int mobno() {
		// TODO Auto-generated method stub
		return 973864734;
	}

	@Override
	int adharno() {
		// TODO Auto-generated method stub
		return 897384;
	}

	@Override
	int bankacc() {
		// TODO Auto-generated method stub
		return 1217;
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
		return 100;
	}

	public void run() {
		// TODO Auto-generated method stub
	System.out.println("saynam is big big doctor");	
	}
public static void main(String args[])
{
	Thread t7=new Thread("saynam is aslo oldest living creature");
	t7.start();
	
}
}
