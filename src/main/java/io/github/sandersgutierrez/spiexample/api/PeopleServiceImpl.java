package io.github.sandersgutierrez.spiexample.api;

import com.google.auto.service.AutoService;

import java.util.ArrayList;
import java.util.List;

@AutoService(PeopleService.class)
public class PeopleServiceImpl implements PeopleService {
    private static final List<Person> peopleList = new ArrayList<>();

    @Override
    public List<Person> getPeople() {
        fillPeopleList();
        return peopleList;
    }

    private void fillPeopleList() {
        peopleList.add(new Person("Sanders", "Gutiérrez"));
        peopleList.add(new Person("Dayhana", "Rojas"));
    }
}
