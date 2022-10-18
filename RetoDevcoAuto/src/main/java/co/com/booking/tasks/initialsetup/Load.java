package co.com.booking.tasks.initialsetup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static co.com.booking.models.Data.getMap;
import static co.com.booking.models.Data.setMap;
import static co.com.booking.utils.ActualDate.getActualDate;
import static co.com.booking.utils.NumberConstants.ZERO;
import static co.com.booking.utils.StringConstants.DATE_FLOW;
import static co.com.booking.utils.StringConstants.DATE_FORMAT;
import static co.com.booking.utils.StringConstants.TIME_FLOW;
import static co.com.booking.utils.StringConstants.TIME_FROMAT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Load implements Task {

    private List<Map<String, Object>> data;

    public Load(List<Map<String, Object>> data){
        this.data = data;
    }
    public static Load the(List<Map<String, Object>> data) {
        return instrumented(Load.class, data);
    }

    @Override
    @Step("{1} load the necessary data for the execution of the test")
    public <T extends Actor> void performAs(T actor) {
        if(!data.isEmpty()){
            Set<Map.Entry<String,Object>> setMapAux = data.get(ZERO.getValue()).entrySet();
            Map<String, Object> mapAux = setMapAux.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            if(getMap()==null){
                setMap(mapAux);
                setMap(mapAux);
                getMap().put(TIME_FLOW.getValue(), getActualDate(TIME_FROMAT.getValue()));
                getMap().put(DATE_FLOW.getValue(), getActualDate(DATE_FORMAT.getValue()));

            }else{
                getMap().putAll(mapAux);
            }
        }else{
            actor.remember("", new HashMap<>());
        }
    }
}
