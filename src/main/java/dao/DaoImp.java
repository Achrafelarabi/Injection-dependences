package dao;

import org.springframework.stereotype.Component;

@Component("dao")

public class DaoImp implements Idiao{
    @Override
    public double getData() {

        /*
        Se connecter BD
        */
       System.out.println("version base de données");
        double temp= Math.random()*40;
        return temp;
    }
}
