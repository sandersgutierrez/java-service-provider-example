package io.github.sandersgutierrez.spiexample;

import io.github.sandersgutierrez.spiexample.api.PeopleService;

import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<PeopleService> serviceLoader = ServiceLoader.load(PeopleService.class);
        Map<String, PeopleService> services = new HashMap<>();
        for (PeopleService service: serviceLoader) {
            System.out.println("I've found a service called '" + service.getClass().getSimpleName() + "' !");
            services.put(service.getClass().getSimpleName(), service);
        }
        System.out.println("Found " + services.size() + " services!");
        services.get("PeopleServiceImpl").getPeople().forEach(System.out::println);
    }
}
