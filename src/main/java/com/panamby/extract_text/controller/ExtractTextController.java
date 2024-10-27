package com.panamby.extract_text.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public interface ExtractTextController {

	String extrairTexto(@RequestParam MultipartFile image);
}
