package com.dlu.task.mgmt.activitytrack;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ActivityRestController {

    private ActivityRepository activityRepository;

    public ActivityRestController(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }


    @GetMapping(value = "/activity/{username}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Activity> getActivityByUser( @PathVariable("username") String userName){
        return this.activityRepository.findActivitiesByUserName(userName);
    }

    @GetMapping(value = "/activity", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Activity> getActivities(){
        return this.activityRepository.findAll();
    }


    @PostMapping(value = "/activity", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Activity newActivity(@RequestBody Activity activity){
       return this.activityRepository.save(activity);
    }

    @DeleteMapping(value = "/activity/{id}")
    public void deleteActivity(@PathVariable("id") long id){
        this.activityRepository.deleteById(id);
    }


    @PutMapping(value = "/activity", consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public Activity updateActivity(Activity activity){
        Optional<Activity> origin = this.activityRepository.findById(activity.getId());

        return origin.get();

    }






}
