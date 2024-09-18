package fi.utu.tech.ooj.exercise1.teht3;

public class DensityCalculator {
    /**
     * alkuehto: massa ja tilavuus ovat Double tyyppisiä olioita, ei saa olla null. Massa >= 0 ja Tilavuus > 0
     * loppuehto: palauttaa uuden Double olion, joka edustaa tiheyttä. Palautus >= 0. Ei sivuvaikuksia. Ei poikkeuksia.
     */
    public static Double laskeTiheys(Double massa, Double tilavuus) {
        return (massa / tilavuus);p
    }
    /**
     * Alkuehto: true
     * Loppuehto: palautusarvo on (massa / tilavuus) ja palautusarvo > 0
     * Poikkeukset: Nostaa poikkeuksen IllegalArgumentException, jos massa < 0, tilavuus <= 0, massa tai tilavuus on null,
     * tiheys <0 ja tiheys >= 250.
     */
    public static Double laskeTiheysTotaalisesti(Double massa, Double tilavuus) throws IllegalArgumentException{
        if (massa < 0){  // ehdot
            throw new IllegalArgumentException();
        }
        if (tilavuus <= 0){
            throw new IllegalArgumentException();
        }
        if (massa == null){
            throw new IllegalArgumentException();
        }
        if (tilavuus == null){
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


