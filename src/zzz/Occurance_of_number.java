package zzz;

import java.util.HashSet;

public class Occurance_of_number {

	public static void main(String[] args) {
		int a[]= {7,3,5,3,7,3,6,9,3,0};
		
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}

		for(Integer ie:set)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(ie==a[i])
				{
					count++;
				}
			}
		}
	}

}
