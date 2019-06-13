package com.biz.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreExec_06 {

	public static void main(String[] args) {

		/*
		 * ScoreVO를 이용해서 리스트를 생성하고 5명의 학생의 성적을 키보드로 입력받아 리스트에 추가하고 총점과 평균을 구하시오
		 */
		List<ScoreVO> scList = new ArrayList<ScoreVO>();
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			System.out.println((i + 1) + "번학생 국어점수 >>");
			String strKor = scan.nextLine();
			int intKor = Integer.valueOf(strKor);
			
			System.out.println((i + 1) + "번학생 영어점수 >>");
			String strEng = scan.nextLine();
			int intEng = Integer.valueOf(strEng);
			
			System.out.println((i + 1) + "번학생 수학점수 >>");
			String strMath = scan.nextLine();
			int intMath = Integer.valueOf(strMath);
				
			int intTotal = intKor + intEng + intMath;
			int intAvg = intTotal / 3;

			scList.add(new ScoreVO("" + (i + 1), intKor, intEng, intMath, intTotal, intAvg));

		}
		int scLen = scList.size();
		for (ScoreVO vo : scList) {
			System.out.println(vo.toString());
		}
	}

}
