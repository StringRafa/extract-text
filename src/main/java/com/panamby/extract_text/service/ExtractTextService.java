package com.panamby.extract_text.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface ExtractTextService {

	String extractText(MultipartFile imagem) throws IOException;
}
