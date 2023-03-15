package Str;

import java.util.ArrayList;

public class Person {
	private String id;
	private String firstName;
	private String lastName;
	private String ngaySinh;
	private String noiSinh;
	private char gioitinh;
	private String quequan;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getNoiSinh() {
		return noiSinh;
	}
	public void setNoiSinh(String noiSinh) {
		this.noiSinh = noiSinh;
	}
	public char getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(char gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getQuequan() {
		return quequan;
	}
	public void setQuequan(String quequan) {
		this.quequan = quequan;
	}
	public Person(String id, String firstName, String lastName, String ngaySinh, String noiSinh, char gioitinh,
			String quequan) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ngaySinh = ngaySinh;
		this.noiSinh = noiSinh;
		this.gioitinh = gioitinh;
		this.quequan = quequan;
	}
	public String toString() {
		return String.format("P[id: %s,FullName: %s %s,Ngay Sinh: %s,Que Quan: %s,gioitinh: %c,Noi sinh: %s",id,firstName,lastName,ngaySinh,quequan,gioitinh,noiSinh);
	}
	public static Person parse(String str) {
	    String[] rs = str.split("\\|");
	    char g = rs[5].charAt(0);
	    if (g == '0') {
	        g = 'm';
	    } else if (g == '1') {
	        g = 'f';
	    } else {
	        g = 'u'; // unknown gender
	    }
	    Person p = new Person(rs[0], rs[1], rs[2], rs[3], rs[4], g, rs[6]);
	    return p;
	}
	public static ArrayList<Person> parse(String [] arrayStr){
		ArrayList<Person> rs = new ArrayList<Person>();
		for(String s : arrayStr) {
			Person p = Person.parse(s);
			rs.add(p);
		}
		return rs;
	}
}