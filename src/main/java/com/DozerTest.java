package com;

import com.dozertest.Person;
import com.dozertest.PersonClone;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

public class DozerTest {
    public static void main(String[] args) {
        DozerBeanMapper mapper = new DozerBeanMapper();
        Person object = new Person("Ivan", 29);
        PersonClone objectCopy =
                mapper.map(object, PersonClone.class);

        System.out.println(objectCopy);

    }
}
