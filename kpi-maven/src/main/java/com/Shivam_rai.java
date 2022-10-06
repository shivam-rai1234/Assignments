package com;

public  class Shivam_rai extends EmployeeAbstract implements Runnable{

	@Override
	int roll_no() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	int id() {
		// TODO Auto-generated method stub
		return 1-8;
	}

	@Override
	int mobno() {
		// TODO Auto-generated method stub
		return 884040589;
	}

	@Override
	int adharno() {
		// TODO Auto-generated method stub
		return 97834;
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
		return 6;
	}

	@Override
	long weight() {
		// TODO Auto-generated method stub
		return 68;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("try hard to achive your dream one day");
		
	}
public static void main(String args[])
{
	Thread t8=new Thread("need more practice");
	t8.start();
}
}
