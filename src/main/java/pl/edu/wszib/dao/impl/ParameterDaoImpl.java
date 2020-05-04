package pl.edu.wszib.dao.impl;

import org.springframework.stereotype.Repository;
import pl.edu.wszib.dao.ParameterDao;
import pl.edu.wszib.domain.Parameter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ParameterDaoImpl implements ParameterDao {
    private Map<Long, Parameter> parameterMap;
    private static Long id = 1L;

    public ParameterDaoImpl() {
        this.parameterMap = new HashMap<>();
        prepareParameterList();
    }

    @Override
    public List<Parameter> getParameter() {
        return new ArrayList<>(parameterMap.values());
    }

    @Override
    public void saveParameter(Parameter parameter) {
        if (parameter.getId() < 1) {
            parameter.setId(id);
            id++;
        }
        parameterMap.put(parameter.getId(), parameter);
    }

    @Override
    public void removeParameter(Long id) {
        parameterMap.remove(id);
    }

    @Override
    public Parameter getById(Long id) {
        return parameterMap.get(id);
    }



    private void prepareParameterList() {
        Parameter parameter = new Parameter();
        parameter.setFoots(5200);
        parameter.setWater(750);
        parameter.setCalories(1500);
        parameter.setCoffeine(200);
        /*parameter.setDate*/
        saveParameter(parameter);
    }
}
