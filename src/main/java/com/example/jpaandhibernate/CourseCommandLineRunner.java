package com.example.jpaandhibernate;

import com.example.jpaandhibernate.jdbc.CourseJdbcRepository;
import com.example.jpaandhibernate.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CourseCommandLineRunner implements CommandLineRunner {


    @Autowired
//    private CourseJdbcRepository repository;
    private  CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception{
//            repository.insert(new Course(1,"Learn AWS now", "sayinmehmet"));
//            repository.insert(new Course(2,"Learn Azure now", "sayinmehmet"));
//            repository.insert(new Course(3,"Learn Angular now", "sayinmehmet"));
//            repository.delete(2);
//            System.out.println(repository.findById(1));
//            System.out.println(repository.findById(3));

        repository.save(new Course(1,"Learn AWS","sayinmehmet"));
        repository.save(new Course(2,"Learn Azure","sayinmehmet"));
        repository.save(new Course(3,"Learn Angular","sayinmehmet"));

        repository.deleteById(2L);


        System.out.println(repository.findById(1L));
        System.out.println(repository.findById(3L));
        System.out.println(repository.findAll());
        System.out.println(repository.count());
        System.out.println(repository.findByAuthor(""));
        System.out.println(repository.findByAuthor("sayinmehmet"));
        System.out.println(repository.findByName("Learn AWS"));
    }
}
