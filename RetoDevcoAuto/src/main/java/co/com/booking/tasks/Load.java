package co.com.booking.tasks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static co.com.booking.models.Data.getMap;
import static co.com.booking.models.Data.setMap;
import static co.com.booking.utils.ActualDate.getActualDate;

public class Load implements Task {

    private List<Map<String, Object>> data;

    public Load(List<Map<String, Object>> data){
        this.data = data;
    }
    public static Load the(List<Map<String, Object>> data) {
        return instrumented(Load.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(!data.isEmpty()){
            Set<Map.Entry<String,Object>> setMapAux = data.get(0).entrySet();
            Map<String, Object> mapAux = setMapAux.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            if(getMap()==null){
                setMap(mapAux);
                setMap(mapAux);
                getMap().put("horaFlujo", getActualDate("HHmmss"));
                getMap().put("fechaFlujo", getActualDate("yyyyMMdd"));

            }else{
                getMap().putAll(mapAux);
            }
        }else{
            actor.remember("", new HashMap<>());
        }
    }
}
