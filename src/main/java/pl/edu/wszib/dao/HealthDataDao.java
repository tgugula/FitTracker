package pl.edu.wszib.dao;
import pl.edu.wszib.domain.HealthData;
import java.util.List;

public interface HealthDataDao {
    List<HealthData> getHealthData();
    void saveHealthData(HealthData healthData);
    void removeHealthData(Long id);
    HealthData getById (Long id);
}
