package com.vn.code.mokup.type.api;

import com.vn.code.mokup.entity.Type;
import com.vn.code.mokup.type.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TypeController {

    @Autowired
    private TypeService typeService;


    //-------------------Retrieve All Type--------------------------------------------------------

    @GetMapping("/type")
    public ResponseEntity<Iterable<Type>> listAllType() {
        Iterable<Type> types = typeService.findAll();
        boolean check = ((List) types).isEmpty();
        if (check) {
            return new ResponseEntity<Iterable<Type>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Iterable<Type>>(types, HttpStatus.OK);
    }

    //-------------------Retrieve Single Type--------------------------------------------------------

    @GetMapping("/type/{id}")
    public ResponseEntity<Type> getType(@PathVariable("id") Long id){
        Optional<Type> types = typeService.findById(id);
        boolean check;
        if (types == null){
            return  new ResponseEntity<Type>(HttpStatus.NO_CONTENT);
        }
        return  new ResponseEntity<Type>(types.get(),HttpStatus.OK);
    }

    //-------------------Create a Type--------------------------------------------------------

    @PostMapping("/type")
    public ResponseEntity<Void> createType(@RequestBody Type type, UriComponentsBuilder uriComponentsBuilder){
        typeService.save(type);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uriComponentsBuilder.path("/type/{id}").buildAndExpand(type.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @PutMapping("/type/{id}")
    public ResponseEntity<Type> updateType(@PathVariable Long id,
                                           @RequestBody Type type){

        Optional<Type>  types  = typeService.findById(id);
        if (type == null) {
            return new ResponseEntity<Type>(HttpStatus.NOT_FOUND);
        }
        types.get().setId(type.getId());
        types.get().setName(type.getName());
        types.get().setDescription(type.getDescription());
        typeService.save(types.get());
        return  new ResponseEntity<Type>(types.get(), HttpStatus.OK);
    }

    @DeleteMapping("/type/{id}")
    public ResponseEntity<Type> deleteType(@PathVariable("id") long id) {

        Optional<Type> type = typeService.findById(id);
        if (type == null) {
            return new ResponseEntity<Type>(HttpStatus.NOT_FOUND);
        }

        typeService.remove(id);
        return new ResponseEntity<Type>(HttpStatus.NO_CONTENT);
    }
}
