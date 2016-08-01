package com.swollenbrains.imagedescriptor;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

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
	public void testReadMetadata() throws IOException {
		File sampleImage = new File("sampleImage.jpg");
		imageDescriptor.readMetadata(sampleImage);
	}

}
