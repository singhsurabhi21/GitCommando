package com.saintgobain.sunday1;

public class getsetmethod {
	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getsetmethod gm=new getsetmethod();
		System.out.println(gm.name="surabhi");
		System.out.println(gm.age=10);

	}

}
