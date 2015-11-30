package br.com.gague.imagepoc.service.impl;

import java.io.File;

import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;

import br.com.gague.imagepoc.service.ImageConverter;

public class ImageMacickConverter extends ImageConverter {

	@Override
	public boolean convertToPdf(File file) {
		try {
			// create the operation, add images and operators/options
			IMOperation op = new IMOperation();
			op.addImage(file.getAbsolutePath()); // source file
			op.addImage(getPdfPathDestination(file.getName())); // destination file

			// execute the operation
			ConvertCmd cmd = new ConvertCmd();
			cmd.run(op);
			
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}