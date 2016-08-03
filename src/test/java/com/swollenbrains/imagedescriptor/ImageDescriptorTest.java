package com.swollenbrains.imagedescriptor;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import com.drew.imaging.ImageProcessingException;

import junit.framework.Assert;

public class ImageDescriptorTest {

	private ImageDescriptor imageDescriptor = new ImageDescriptor();
	
	@Test
	public void testGetName() {
		Assert.assertEquals("abcd", imageDescriptor.getName());
	}
	
	@Test
	public void testGetFileName() {
		File sampleImage = new File("sampleImage.jpg");
		Assert.assertEquals("sampleImage.jpg", imageDescriptor.getFileName(sampleImage));
	}
	
	@Test
	public void testReadMetadata() throws IOException, ImageProcessingException {
		InputStream sampleImage = this.getClass().getResourceAsStream("sampleImage.jpg");
		imageDescriptor.readMetadata(sampleImage);
	}

}
