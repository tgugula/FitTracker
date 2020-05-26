package pl.edu.wszib.dao.impl;

import org.springframework.stereotype.Repository;
import pl.edu.wszib.dao.HealthDataDao;
import pl.edu.wszib.domain.HealthData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class HealthDataDaoImpl implements HealthDataDao {

    private Map<Long, HealthData> healthDataMap;
    private static Long id = 1L;

    public HealthDataDaoImpl() {
        this.healthDataMap = new HashMap<>();
        showHealthData();
    }

    @Override
    public List<HealthData> getHealthData() {
        return new ArrayList<>(healthDataMap.values());
    }

    @Override
    public void saveHealthData(HealthData healthData) {
        if (healthData.getId() < 1) {
            healthData.setId(id);
            id++;
        }

        healthDataMap.put(healthData.getId(), healthData);
    }

    @Override
    public void removeHealthData(Long id) {
        healthDataMap.remove(id);
    }

    @Override
    public HealthData getById(Long id) {
        return healthDataMap.get(id);
    }

    private void showHealthData() {
        HealthData healthData = new HealthData();
        healthData.setMedicine("Uzupełnij nazwy oraz dawki leków, które zażywasz.");
        healthData.setBloodType("Podaj swoją grupę krwi.");
        healthData.setDeclaration(false);
        healthData.setNotes("Informacje dotyczące Twojego stanu zdrowia.");
        saveHealthData(healthData);
    }
}