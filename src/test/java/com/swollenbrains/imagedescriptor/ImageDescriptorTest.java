package com.swollenbrains.imagedescriptor;

import org.junit.Test;

import junit.framework.Assert;

public class ImageDescriptorTest {

	@Test
	public void testGetName() {
		ImageDescriptor imageDescriptor = new ImageDescriptor();
		Assert.assertEquals("abcd", imageDescriptor.getName());
	}

}
