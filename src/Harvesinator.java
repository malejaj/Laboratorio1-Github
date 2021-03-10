import java.util.*;

public class Harvesinator {

    public double lon1, lat1, lon2, lat2, EARTH;

    public double calculateDistance(double longitude1, double latitude1, double longitude2, double latitude2) {
        /*Meter latitud y longitud de las dos ubicaciones en radianes.*/
        lon1 = longitude1;
        lat1 = latitude1;
        lon2 = longitude2;
        lat2 = latitude2;
        EARTH = 6371.0088; // En Km


        double dlon = lon2 - lon1;
        double dlat = lat2 - lat1;
        double a = Math.pow(Math.sin(dlat / 2), 2)
                + Math.cos(lat1) * Math.cos(lat2)
                * Math.pow(Math.sin(dlon / 2),2);

        double c = 2 * Math.asin(Math.sqrt(a));

        return c * EARTH;
    }
}


/*
* https://es.wikipedia.org/wiki/F%C3%B3rmula_del_semiverseno
* */