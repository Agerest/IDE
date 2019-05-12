package com.spring.ide.rest;

import com.spring.ide.model.File;
import com.spring.ide.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FileController {

    @Autowired
    private FileRepository fileRepository;

    @PostMapping({"/update"})
    public ResponseEntity<File> update(File file) {

        fileRepository.save(file);

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
