package br.univille.microservgestaoprojetospesapplication.services.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.univille.microservgestaoprojetospesapplication.entities.Activity;
import br.univille.microservgestaoprojetospesapplication.entities.Objective;
import br.univille.microservgestaoprojetospesapplication.entities.Problem;
import br.univille.microservgestaoprojetospesapplication.entities.Project;
import br.univille.microservgestaoprojetospesapplication.entities.Team;
import br.univille.microservgestaoprojetospesapplication.repositories.ActivityRepository;
import br.univille.microservgestaoprojetospesapplication.repositories.ProjectRepository;

@Service
public class ActivityServiceImpl {

    @Autowired
    private ActivityRepository activityRepository;

    public List<Activity> getAll() {
        var returnIterator = activityRepository.findAll();
        var listActivities = new ArrayList<Activity>();
        returnIterator.forEach(listActivities::add);
        return listActivities;
    }

    public Activity createNewActivity(Team team, Objective objective, Problem problem) {
        Activity newActivity = new Activity();
        return activityRepository.save(newActivity);
    }

    public Activity save(Activity activity) {
        return activityRepository.save(activity);
    }

    public Activity update(String cdActivity, Activity activity) {
        var getActivity = activityRepository.findById(cdActivity);

        if(!getActivity.isPresent()) {
            throw new RuntimeException("Activity not found with id: " + cdActivity);
        }

        var oldActivity = getActivity.get();
        oldActivity.setActivityTitle(activity.getActivityTitle());
        activityRepository.save(oldActivity);
        return oldActivity;
    }

    public Activity delete(String cdActivity) {
        var getActivity = activityRepository.findById(cdActivity);

        if(!getActivity.isPresent()) {
            throw new RuntimeException("Activity not found with id: " + cdActivity);
        }

        var oldActivity = getActivity.get();
        activityRepository.delete(oldActivity);
        return oldActivity;
    }

   
    
}
