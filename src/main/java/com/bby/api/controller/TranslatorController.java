package com.bby.api.controller;


import io.github.millij.poi.SpreadsheetReadException;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TranslatorController {

    private static final Logger log = LoggerFactory.getLogger(TranslatorController.class);


    @Autowired
    private Environment environment;

    @ApiOperation(value = "Sample api", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getPrintData(@RequestParam String ref, HttpServletResponse response) throws IOException, InvalidFormatException, SpreadsheetReadException {
        List<?> responseJson=null;

        try {
           //write your code here
        }  catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<String>("Exception", HttpStatus.OK);
        }
            return new ResponseEntity<List<?>>(responseJson, HttpStatus.OK);
    }
}
