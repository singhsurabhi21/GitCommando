package com.saintgobain.sunday1;

public class innerouter {
	int x=10;
	class inner{
		int y=5;
	}

	}
class tt{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		innerouter io=new innerouter();
		innerouter.inner it=io.new inner();
		System.out.println(it.y+io.x);

	}

}
