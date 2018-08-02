package pro.ofitserov.crudservice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.ofitserov.crudservice.backend.Service;

@RestController
@RequestMapping("crud")
public class Controller {

    @Autowired
    private Service service;

    @PostMapping("create")
    public HttpStatus create(@RequestBody String content) {
        service.create(content);
        return HttpStatus.OK;
    }

    @GetMapping("get")
    public ResponseEntity readAccount(@RequestHeader Long id) {
        return new ResponseEntity(service.read(id), HttpStatus.OK);
    }

    @PutMapping("update/{id}")
    public HttpStatus updateAccount(@PathVariable Long id,
                                    @RequestHeader String content) {
        service.update(id, content);
        return HttpStatus.OK;
    }

    @DeleteMapping("delete/{id}")
    public HttpStatus deleteAccount(@PathVariable Long id) {
        service.delete(id);
        return HttpStatus.OK;
    }
}
