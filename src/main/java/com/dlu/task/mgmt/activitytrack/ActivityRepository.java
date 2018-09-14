package com.dlu.task.mgmt.activitytrack;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActivityRepository extends JpaRepository<Activity, Long> {

    List<Activity> findActivitiesByUserName(String userName);

}
