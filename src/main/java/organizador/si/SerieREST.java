package organizador.si;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by matheus on 20/07/17.
 */

@RestController
public class SerieREST {

    private SerieReposity serieReposity;



    @Autowired
    public SerieREST(SerieReposity serieReposity) {
        this.serieReposity = serieReposity;
    }

    @RequestMapping(value = "/salvar", method = RequestMethod.POST)
    public List<SeriePOJO> salvar(@RequestBody SeriePOJO serie){
        for (SeriePOJO serieBD:serieReposity.findAll()){
            if(serieBD.getId_imbdb().equals(serie.getId_imbdb())){
                return  null;
            }
        }


        serieReposity.save(serie);
        return serieReposity.findAll();
    }


    

    @RequestMapping(value="/serie", method = RequestMethod.POST)
    public List<SeriePOJO> getSeriesSalvas(@RequestBody String userId){
        List<SeriePOJO> array = new ArrayList<>();

        for (SeriePOJO serieBD:serieReposity.findAll()){
            if(serieBD.getUserId().equals(userId)){
                array.add(serieBD);
            }
        }


        return array;
    	
    	
    }

    @RequestMapping(value = "/removeSerie",method = RequestMethod.POST)
    public void removeSerie(@RequestBody SeriePOJO serie){
        for (SeriePOJO serieBD:serieReposity.findAll()){
            if(serieBD.getId_imbdb().equals(serie.getId_imbdb())){
                serieReposity.delete(serieBD);
            }
        }

    }

    @RequestMapping(value = "/watchlist", method = RequestMethod.POST)
    public void addWatchlist(@RequestBody SeriePOJO serie){
        if(this.seriesNoPerfil(serie)){
            return;
        }else{
            serieReposity.save(serie);
        }


    }


    @RequestMapping(value = "/seriesperfil", method = RequestMethod.POST)
    public boolean seriesNoPerfil(@RequestBody SeriePOJO serie){
    	for (SeriePOJO serieBD:serieReposity.findAll()){
            if(serieBD.getId_imbdb().equals(serie.getId_imbdb())){
                return  true;
            }
        }
        return false;
    }
}
