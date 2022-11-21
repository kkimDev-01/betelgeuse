package com.example.betelgeuse.BeanPostProcessorExample;

import com.example.betelgeuse.BeanScopeExample.Person;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.MatcherAssert.assertThat;


@ContextConfiguration(classes = {CustomAnnotationConfiguration.class})
class GenericDAOTest {

    @DataAccess(entity = Person.class)
    private GenericDAO<Person> personGenericDAO;

    @DataAccess(entity = Person.class)
    private GenericDAO<Person> anotherPersonGenericDAO;

    @Test
    public void whenGenericDaoInjected_thenItIsSingleton() {
        assertThat(personGenericDAO, sameInstance(anotherPersonGenericDAO));

    }
}