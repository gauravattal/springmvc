package springmvc;



public class student {

   private String id;
   private String name;
   
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "student [id=" + id + ", name=" + name + "]";
}
public student(String id, String name) {
	super();
	this.id = id;
	this.name = name;
}
   
	
	
}
