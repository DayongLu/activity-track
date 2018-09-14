package com.dlu.task.mgmt.activitytrack;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Activity {

    @Id @GeneratedValue
    private long id;

    private String sfdcOpp;
    private String subDivision;
    private Date date;
    private String AccountName;
    private String cityName;
    private String userName;
    private String specialtySeName;
    private double duration;
    private String taskName;
    private String targetMeetingOutcome;
    private String nextAction;
    private String fYear;
    private String fQuator;
    private String fWeek;



}
