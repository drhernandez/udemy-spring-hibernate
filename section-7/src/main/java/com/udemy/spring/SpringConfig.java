package com.udemy.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.udemy.spring") //Componentes
@PropertySource("classpath:file.properties") //Archivos properties
public class SpringConfig {

    @Bean // Al tener un scope Singleton, si hago un new dentro de este método se va a ejecutar una sola vez porque
    // la anotación @Bean va a hacer que se guarde dentro del spring container y no se repita la creación del objeto que sea
    public String myRandomConfiguration() {
        return "This is a random configuration";
    }
}
