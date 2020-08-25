package com.fis.Training;

public class AreaCalculation {
	
	float length,breadth;
	float areaRectangle;
	float areacube;
	float side;
	
	
	AreaCalculation(float l,float b,float side){
		this.length=l;
		this.breadth=b;
		this.side=side;
		
	}
	
	public float areaRectangle() {
		
		areaRectangle=length*breadth;
		return areaRectangle;
	}
		
		public float areaCube() {
			areacube=6*side;
			return areacube;
			
		}
	}


