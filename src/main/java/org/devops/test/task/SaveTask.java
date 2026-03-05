package org.devops.test.task;

import org.devops.test.entity.SaveTimeEntity;
import org.devops.test.repository.SaveTimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@EnableScheduling
public class SaveTask {
    @Autowired
    SaveTimeRepository saveTimeRepository;

    @Scheduled(fixedRate = 1000)
    public void saveDate(){
        SaveTimeEntity saveTimeEntity = new SaveTimeEntity();
        saveTimeEntity.setSavedTime((new Date()).toString());
        saveTimeRepository.save(saveTimeEntity);
    }
}
