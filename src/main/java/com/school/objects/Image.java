/**
 * Copyright the original author or authors.
 */
package com.school.objects;

import com.school.interfaces.ImageInterface;

/**
 * @author Branislav
 *
 */
public class Image implements ImageInterface{

	private int id;
	private byte[] imageBytes;
	/**
	 * @param id2
	 * @param bytes must not be null
	 */
	public Image(int id2, byte[] bytes) {
		this.id= id2;
		this.imageBytes=bytes;
	}

	/**
	 *  must not be null
	 */
	public Image() { 
	}

	@Override
	public void setImageId(int id) {
		this.id= id;
		
	}

	@Override
	public void setImageBytes(byte [] bytes) {
		this.imageBytes=bytes;
	}

	@Override
	public int getImageId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public byte[] getImageBytes() {
		
		return this.imageBytes;
	}
	
}
