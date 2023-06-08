package com.kh.practice3.model;

import java.util.Objects;

public class Farm {

	private String kind;
	private String name;

	public Farm() {
	}

	public Farm(String kind, String name) {
		this.kind = kind;
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Farm [kind=" + kind + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(kind, name);
	}

	@Override
	public boolean equals(Object obj) { //같은지 비교해줄때 필요!
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Farm other = (Farm) obj;
		return Objects.equals(kind, other.kind) && Objects.equals(name, other.name);
	}
	
	
	
}
