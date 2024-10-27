package com.panamby.extract_text.controller.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.panamby.extract_text.service.ExtractTextService;

@RestController
@RequestMapping("/extract-text")
public class ExtractTextControllerImpl {

    @Autowired
    private ExtractTextService extractTextService;

    @PostMapping
    public String extrairTexto(@RequestParam MultipartFile image) throws IOException {
        return extractTextService.extractText(image);
    }
}
