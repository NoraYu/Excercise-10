package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<ToDo, Long>
{
}
