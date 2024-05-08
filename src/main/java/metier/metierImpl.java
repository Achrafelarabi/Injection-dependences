package metier;

import dao.Idiao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("metier")

public class metierImpl implements Imetier {
    //couplage faible
    private Idiao dao;

    public metierImpl(Idiao dao)
    {

        this.dao = dao;
    }

    @Override
    public double calcul() {
        double temp= dao.getData();
        double res=temp*540/Math.cos(temp*Math.PI);
        return res;
    }
  /*
  Injecter dans la variable diao objet class implement inter Idiao
  */
    public void setDao(Idiao dao) {
        this.dao = dao;
    }
}
