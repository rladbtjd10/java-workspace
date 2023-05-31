package com.kh.polymorphism.controller;

import com.kh.polymorphism.model.child.Engineer;
import com.kh.polymorphism.model.parent.Employee;

public class EmployeeController {
	
	//Employee 객체배열과 이름을 가지고 와서 일치한 사람 반환
	public Employee findEmployeeByName(Employee[] ea, String name){
		
//		Employee emp = null; //1번 방법
		
		for(Employee employee : ea) {
			if(employee.getName().equals(name)) {
//				emp = employee; //1번 방법
				return employee; //2번 방법
			} 
		}  
//		   return emp; //1번 방법
		   return null; //2번 방법
		
//	    for(int i=0; i < ea.length; i++ ) {              //3번방법
//	    	if(ea[i].equals(name)) { return ea[i];}    
//	    	}
//		return null; //String인데 반환값이 없을때 null을 씀   //3번방법
	}
	
	//연봉계산 : engineer인 경우 보너스가 있음!
	public int getAnnualSalary(Employee e) {
		
		int annualSalary = e.getSalary()*12;
		
		//instanceof 연산자 : 현재 참조변수가 실제로 어떤 클래스 형의 객체의 주소를 참조하고 있는지 확인 할 때 사용
		if(e instanceof Engineer) {
			Engineer eg = (Engineer) e; //부모 -> 자식 : 강제 형 변환!
			annualSalary += eg.getBouns();
//			return eg.getBouns() + e.getSalary()*12;
		}
		return annualSalary;
//		return e.getSalary()*12;
	}
	
	//전체 연봉 총 합계
	public int getTotalCoast(Employee[] ea) { //Employee[] ea ->ea는 아무거나 줘도 상관없음
		int total = 0;
		
		for(Employee employee : ea) {
			total += getAnnualSalary(employee);
		}
		return total;
	}

}
