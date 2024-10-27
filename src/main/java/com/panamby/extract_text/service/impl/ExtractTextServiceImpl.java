package com.panamby.extract_text.service.impl;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.panamby.extract_text.service.ExtractTextService;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

@Service
public class ExtractTextServiceImpl implements ExtractTextService {
	
    @Autowired
    private Tesseract tesseract;

	@Override
	public String extractText(MultipartFile imagem) throws IOException {
        BufferedImage bufferedImage = ImageIO.read(imagem.getInputStream());
        try {
            return tesseract.doOCR(bufferedImage);
        } catch (TesseractException e) {
            throw new RuntimeException("Error extracting text", e);
        }
	}

}
