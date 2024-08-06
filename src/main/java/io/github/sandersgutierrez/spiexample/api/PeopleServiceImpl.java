package io.github.sandersgutierrez.spiexample.api;

import com.google.auto.service.AutoService;

import java.util.ArrayList;
import java.util.List;

@AutoService(PeopleService.class)
public class PeopleServiceImpl implements PeopleService {
    private static final List<Person> peopleList = new ArrayList<>();

    static {
        peopleList.add(new Person("Sanders", "Gutiérrez"));
        peopleList.add(new Person("Celeste", "Gutiérrez"));
    }

    @Override
    public List<Person> getPeople() {
        return peopleList;
    }
}
