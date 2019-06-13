package com.biz.controller;

import com.biz.model.ScoreVO;

public class ScoreExec_03 {

	public static void main(String[] args) {

		ScoreVO[] scArray = new ScoreVO[5];
		
		scArray[0] = new ScoreVO("1",100,90,70);
		scArray[1] = new ScoreVO("2",78,99,85);
		scArray[2] = new ScoreVO("3",90,83,76);
		scArray[3] = new ScoreVO("4",80,92,66);
		scArray[4] = new ScoreVO("5",70,96,99);
		
		for(int i=0; i<scArray.length;i++) {
			int intTotal = scArray[i].getKor();
			intTotal += scArray[i].getEng();
			intTotal += scArray[i].getMath();
			
			scArray[i].setTotal(intTotal);
			scArray[i].setAverage(intTotal/3);			
		}
		for(ScoreVO vo : scArray) {
			System.out.println(vo.toString());
		}
	}
	

}
