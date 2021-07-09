package com.ict.service;

import org.springframework.stereotype.Service;

@Service("myProcess")
public class MyProcess 
{
	// 총점, 평군, 학점
	public int getSum(int kor, int eng, int math)
	{
		
		return kor + eng + math;
	}
	
	// 오버로드
	public int getSum(String kor, String eng, String math)
	{
		int k = Integer.parseInt(kor);
		int e = Integer.parseInt(eng);
		int m = Integer.parseInt(math);
		return k + e + m;
	}

	
	public double getAvg(int sum)
	{
		return (int)(sum/3.0*10)/10.0;
	}
	
	public String getHak(double avg)
	{
		String hak="";
		if (avg >= 90) 
		{
			hak = "A";
		}else if(avg >= 80)
		{
			hak = "B";
		}else if(avg >= 70)
		{
			hak = "C";
		}else
		{
			hak = "F";
		}
		return hak;
	}
}
