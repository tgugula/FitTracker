package pl.edu.wszib.dao;

import pl.edu.wszib.domain.Parameter;
import java.util.List;

public interface ParameterDao {
    List<Parameter> getParameter();
    void saveParameter(Parameter parameter);
    void removeParameter(Long id);
    Parameter getById(Long id);
}
