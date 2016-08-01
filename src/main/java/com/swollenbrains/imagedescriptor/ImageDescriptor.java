package com.swollenbrains.imagedescriptor;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.stream.ImageInputStream;

public class ImageDescriptor {
	
	public String getName(){
		return "abcd";
	}
	
	public String getFileName(File file) {
		return file.getName();
	}
	
	public void readMetadata(File file) throws IOException {
		System.out.println(new File("sampleImage.jpg").getAbsolutePath());
		BufferedImage image = ImageIO.read(new File("sampleImage.jpg"));
		System.out.println(image!=null);
		ImageInputStream iis = ImageIO.createImageInputStream(new File("sampleImage.jpg"));
		System.out.println("yoho: " + iis);
        Iterator<ImageReader> readers = ImageIO.getImageReaders(iis);

        if (readers.hasNext()) {

            // pick the first available ImageReader
            ImageReader reader = readers.next();

            // attach source to the reader
            reader.setInput(iis, true);

            // read metadata of first image
            IIOMetadata metadata = reader.getImageMetadata(0);

            String[] names = metadata.getMetadataFormatNames();
            int length = names.length;
            for (int i = 0; i < length; i++) {
                System.out.println( "Format name: " + names[ i ] );
                //displayMetadata(metadata.getAsTree(names[i]));
            }
        }
		
	}

}
