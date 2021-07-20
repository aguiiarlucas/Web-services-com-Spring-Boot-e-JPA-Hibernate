package com.aguiiarlucas.project.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.aguiiarlucas.project.entities.User;
import com.aguiiarlucas.project.repositories.UserRepository;
import com.aguiiarlucas.project.services.exceptions.DatabaseException;
import com.aguiiarlucas.project.services.exceptions.ResourceNotFoundException;


@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}

	 public User findById( Long id ) {
		 Optional<User> obj = repository.findById(id);
		 return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	 }
	 public User insert (User obj ) { //[Insere um novo obj User]
		 return repository.save(obj);
	 }
	 
	 public void delete ( Long id ) {
		 try {
		 repository.deleteById(id);
	 }catch(EmptyResultDataAccessException e ) {
		 e.printStackTrace();
		 throw new ResourceNotFoundException(id);
	 }catch(DataIntegrityViolationException e) {
		 throw new DatabaseException(e.getMessage());
	 }
		 
	 }

	 
	 public User updateData ( Long id , User obj) {
		 
		 try{
			 User entity = repository.getOne(id);
			 updateData(entity, obj);
			 return repository.save(entity);
		 }catch (EntityNotFoundException e) {
			 e.printStackTrace();
			 throw new ResourceNotFoundException(id);
		}
	 }
		
	 

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
