package com.unla.Grupo8OO22020.controllers.api.v1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unla.Grupo8OO22020.models.PersonModel;

@RestController
@RequestMapping("api/v1/person")
public class PersonRestController {
	
	@GetMapping("/all")
	public ResponseEntity<List<PersonModel>> allPersons(){
		List<PersonModel> persons = new ArrayList<PersonModel>();
		persons.add(new PersonModel(1,"Facundo","Cusato",LocalDate.of(1991,01,19),36363056));
		persons.add(new PersonModel(2,"Yuliana","Cusato",LocalDate.of(1992,8,29),35340056));
		return new ResponseEntity<List<PersonModel>>(persons,HttpStatus.OK);
		
	}

}
