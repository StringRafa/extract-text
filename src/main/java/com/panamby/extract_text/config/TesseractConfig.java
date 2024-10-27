package com.panamby.extract_text.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.sourceforge.tess4j.Tesseract;

@Configuration
public class TesseractConfig {

    @Bean
    public Tesseract tesseract() {
        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath("C:/Program Files (x86)/Tesseract-OCR/tessdata");
        tesseract.setLanguage("por");
        return tesseract;
    }
}
