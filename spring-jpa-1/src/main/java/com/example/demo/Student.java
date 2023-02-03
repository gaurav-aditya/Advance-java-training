package com.example.demo;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Student {
	@Id
	Integer sid;
	String sname;
	Integer score;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", score=" + score + "]";
	}
	

}
