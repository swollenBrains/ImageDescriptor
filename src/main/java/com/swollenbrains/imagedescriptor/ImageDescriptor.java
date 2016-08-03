package com.swollenbrains.imagedescriptor;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;

public class ImageDescriptor {
	
	public String getName(){
		return "abcd";
	}
	
	public String getFileName(File file) {
		return file.getName();
	}
	
	public void readMetadata(InputStream inputStream) throws ImageProcessingException, IOException {
		Metadata metadata = ImageMetadataReader.readMetadata(inputStream);
		Map<String,String> metadataMap = new HashMap<String, String> ();
		for (Directory directory : metadata.getDirectories()) {
			System.out.println(directory.getName()+ "****");
		    for (Tag tag : directory.getTags()) {
		        System.out.println(tag);
		    }
		}
	}

}
