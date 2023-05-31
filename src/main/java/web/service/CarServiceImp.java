package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService{
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car(15,"Lada","Blue"));
        cars.add(new Car(8,"Honda","Red"));
        cars.add(new Car(5,"BMW","Green"));
        cars.add(new Car(19,"Mercedec","Yelow"));
        cars.add(new Car(1,"Kia","Black"));
    }
    @Override
    public List<Car> getCarByCount(Integer count) {
        if(count == null){
            return cars;
        }
        return cars.stream().limit(count).toList();
    }
}
