package fi.utu.tech.ooj.exercise1.teht3;

public class DensityCalculator {


    public static Double laskeTiheys(Double massa, Double tilavuus) {

        return (massa / tilavuus);
    }


    public static Double laskeTiheysTotaalisesti(Double massa, Double tilavuus) throws IllegalArgumentException{
        if (massa < 0){  // ehdot
            throw new IllegalArgumentException();
        }
        if (tilavuus <= 0){
            throw new IllegalArgumentException();
        }

        Double tiheys = (massa/tilavuus); // tiheys määrittely

        if (tiheys < 0){ // ehdot
            throw new IllegalArgumentException();
        }
        if (tiheys >= 250){
            throw new IllegalArgumentException();
        }
        return tiheys; //tiheys palautus
    }
}



}
