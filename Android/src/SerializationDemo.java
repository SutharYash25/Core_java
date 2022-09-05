import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class data implements Serializable{
	int id;
	String name;
	float per;
	data(int id,String name,float per){
		this.id=id;
		this.name=name;
		this.per=per;
	}
	@Override
	public String toString() {
		return "id : "+id+" name : "+name+" per : "+per;
	}
}
public class SerializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("ser.txt");
		data d = new data(1, "java",45.6f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		oos.flush();
		oos.close();
		System.out.println("data insertedin file");
		
		FileInputStream fis = new FileInputStream("ser.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		data d1 = (data)ois.readObject();
		System.out.println(d1);
	}
}
