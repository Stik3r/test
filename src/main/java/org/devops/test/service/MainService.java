package org.devops.test.service;

import org.devops.test.repository.SaveTimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    @Autowired
    SaveTimeRepository saveTimeRepository;

    public String getSaveTime(){
        String lastTime = saveTimeRepository.findFirstByOrderByIdDesc().getSavedTime();
        Long count = saveTimeRepository.count();
        return String.format("Последнее сохраненное время %s общее количество %d", lastTime, count);
    }
}
