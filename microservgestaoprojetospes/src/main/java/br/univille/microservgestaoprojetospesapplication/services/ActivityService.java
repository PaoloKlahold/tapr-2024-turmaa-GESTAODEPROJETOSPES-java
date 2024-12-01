package br.univille.microservgestaoprojetospesapplication.services;

import java.util.List;

import br.univille.microservgestaoprojetospesapplication.entities.Activity;

public interface ActivityService {
    List<Activity> getAll();
    Activity save(Activity activity);
    Activity update(String cdActivity, Activity activity);
    Activity delete(String cdActivity);
}
