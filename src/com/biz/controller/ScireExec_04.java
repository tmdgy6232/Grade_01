package com.biz.controller;

import java.util.ArrayList;
import java.util.List;

import com.biz.model.ScoreVO;

public class ScireExec_04 {

	public static void main(String[] args) {

		List<ScoreVO> scList = new ArrayList<ScoreVO>();

		scList.add(new ScoreVO("1", 90, 80, 70));
		scList.add(new ScoreVO("2", 80, 89, 78));
		scList.add(new ScoreVO("3", 70, 67, 16));
		scList.add(new ScoreVO("4", 88, 65, 10));
		scList.add(new ScoreVO("5", 99, 86, 38));
		scList.add(new ScoreVO("6", 96, 82, 100));

		int scLen = scList.size();

		for(int i=0; i<scLen; i++) {
			ScoreVO vo = scList.get(i); //scList의 i위치에 담긴 주소복사
			
			int intTotal = vo.getKor();
			intTotal += vo.getEng();
			intTotal += vo.getMath();
			vo.setTotal(intTotal);
			vo.setAverage(intTotal/3);
			
		}
		for(ScoreVO vo : scList){
			System.out.println(vo.toString());
		}
	}

}
