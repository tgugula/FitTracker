package pl.edu.wszib.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.model.SelectedHabit;

@Repository
public interface SelectedHabitDao extends CrudRepository<SelectedHabit, Integer> {
    SelectedHabit findByHabit(String habit);
}
