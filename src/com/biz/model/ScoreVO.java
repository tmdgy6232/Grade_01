package com.biz.model;

public class ScoreVO {

	private String Number;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private int average;
	private int rank;
	
	/*
	 * 임의로 생성자를 만들게 되면 기본 생성자가
	 * 자동으로 만들지지 않음.
	 * 그래서 임의로 생성자를 만드는 경우에는
	 * 특별한 경우가 아니면
	 * 기본 생성자도 만들어주어야 한다.
	 */
	public ScoreVO() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * 필드 매개변수가 모두 포함된 임의로 만든 생성자
	 */
	public ScoreVO(String number, int kor, int eng, int math, int total, int average, int rank) {
		super();
		Number = number;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.average = average;
		this.rank = rank;
	}
	/*
	 * 필드 매개변수 중 일부가 포함된 임의로 만든 생성자
	 */
	public ScoreVO(String number, int kor, int eng, int math) {
		super();
		Number = number;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	
	public ScoreVO(String number, int kor, int eng, int math,
			int total, int average) {
		super();
		Number = number;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.average = average;
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "ScoreVO [Number=" + Number + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + total
				+ ", average=" + average + ", rank=" + rank + "]";
	}
	
	
}
