package com.example.demoretourdevacances;

import org.apache.logging.log4j.message.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonSuperController {

    @RequestMapping(path = "/toto", method = RequestMethod.GET)
    public ResponseEntity<Coucou> getToto() {
        return new ResponseEntity(new Coucou("salut"), HttpStatus.OK);

    }
}
