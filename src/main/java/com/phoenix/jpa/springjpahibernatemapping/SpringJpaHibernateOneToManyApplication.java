package com.phoenix.jpa.springjpahibernatemapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.phoenix.jpa.springjpahibernatemapping.repository")
@SpringBootApplication
public class SpringJpaHibernateOneToManyApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringJpaHibernateOneToManyApplication.class, args);
    }
}
