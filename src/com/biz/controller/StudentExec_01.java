package com.biz.controller;

import com.biz.service.StudentService;

public class StudentExec_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentService ss = new StudentService();
		
		for(int i=0; i<2;i++) {
		
			try {
			if (!ss.inputStudent(i))		break;
			
		} catch (Exception e) {
			System.out.println("점수 입력 오류!!!");
			System.out.println((i+1)+"번째 점수 다시입력!!!");
			i--;
			
		}
		

		ss.viewStudents();
		
		
	}

}
}
