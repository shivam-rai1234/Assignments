package com;

public  class Nidheshree extends EmployeeAbstract implements Runnable{

	@Override
	int roll_no() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	int id() {
		// TODO Auto-generated method stub
		return 1-4;
	}

	@Override
	int mobno() {
		// TODO Auto-generated method stub
		return 223542937;
	}

	@Override
	int adharno() {
		// TODO Auto-generated method stub
		return 873687;
	}

	@Override
	int bankacc() {
		// TODO Auto-generated method stub
		return 1215;
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
		System.out.println("nidhi also use thread");
		
	}
public static void main(String args[])
{
	Thread t4=new Thread("employee 4");
	t4.start();
}
}
