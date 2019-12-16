package example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
class Employee   {
	private int id;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

public class CheckingEmployeeObjects {

	public static void main(String[] args) {
		

		
     List<Employee> l1=new ArrayList<Employee>();
     Employee e1=new Employee();
     e1.setId(1);
     e1.setName("aaa");
     e1.setAge(12);
     Employee e2=new Employee();
     e2.setId(2);
     e2.setName("bbb");
     e2.setAge(14);
     Employee e3=new Employee();
     e3.setId(3);
     e3.setName("ppp");
     e3.setAge(16);
     Employee e4=new Employee();
     e4.setId(3);
     e4.setName("ppp");
     e4.setAge(16);
     
    l1.add(e1);
    l1.add(e2);
    l1.add(e3);
  

    boolean b=l1.contains(e4);
    System.out.println(b);

	}

}
