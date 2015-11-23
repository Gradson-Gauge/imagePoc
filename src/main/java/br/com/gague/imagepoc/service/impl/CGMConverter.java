package br.com.gague.imagepoc.service.impl;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import br.com.gague.imagepoc.service.ImageConverter;

public class CGMConverter extends ImageConverter {

	@Override
	public boolean convertToPng(File file) {
		try {
			File outFile = new File(getPngPathDestination(file.getName()));
			BufferedImage image = ImageIO.read(file);
			ImageIO.write(image, "PNG", outFile);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}	
}
