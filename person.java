public class person {
	
	public String name;
	public int age=18;
	
	
	
	

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
		

		person p1= new person();
		p1.setName("sanjai");
		p1.setAge(23);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		
		


	
	}

}