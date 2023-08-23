/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

/**
 *
 * @author ianut
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final double M = 1.989e30;
        final double G = 6.6743015e-11;
        //final double metersPerAU;
        
        final long metersPerAU = 149597870700L;
        
        double AUMercury = 0.38710;
        double AUVenus = 0.72333;
        double AUEarth = 1;
        double AUMars = 1.52366;
        double AUJupiter = 5.20336;
        double AUSaturn = 9.53707;
        double AUUranus = 19.1913;
        double AUNeptune = 30.0690;
        double AUPluto = 39.4821;
        
        double aMercury = metersPerAU * AUMercury;
        double aVenus = metersPerAU * AUVenus;
        double aEarth = metersPerAU * AUEarth;
        double aMars = metersPerAU * AUMars;
        double aJupiter = metersPerAU * AUJupiter;
        double aSaturn = metersPerAU * AUSaturn;
        double aUranus = metersPerAU * AUUranus;
        double aNeptune = metersPerAU * AUNeptune;
        double aPluto = metersPerAU * AUPluto;
        
        double mMercury = 3.285e23;
        double mVenus = 4.867e24;
        double mEarth = 5.972e24;
        double mMars = 6.39e23;
        double mJupiter = 1.898e27;
        double mSaturn = 5.683e26;
        double mUranus = 8.681e25;
        double mNeptune = 1.024e26;
        double mPluto = 1.309e22;
        
        double bottomMercury = (M + mMercury);
        double bottomVenus = (M + mVenus);
        double bottomEarth = (M + mEarth);
        double bottomMars = (M + mMars);
        double bottomJupiter = (M + mJupiter);
        double bottomSaturn = (M +mSaturn);
        double bottomUranus = (M + mUranus);
        double bottomNeptune = (M +mNeptune);
        double bottomPluto = (M+ mPluto);
        
        double denomMercury = G * bottomMercury;
        double denomVenus = G * bottomVenus;
        double denomEarth = G * bottomEarth;
        double denomMars = G * bottomMars;
        double denomJupiter = G * bottomJupiter;
        double denomSaturn = G * bottomSaturn;
        double denomUranus = G * bottomUranus;
        double denomNeptune = G * bottomNeptune;
        double denomPluto = G * bottomPluto;
        
        double aCubedMercury = Math.pow(aMercury,3);
        double aCubedVenus = Math.pow(aVenus, 3);
        double aCubedEarth = Math.pow(aEarth,3);
        double aCubedMars = Math.pow(aMars,3);
        double aCubedJupiter = Math.pow(aJupiter,3);
        double aCubedSaturn = Math.pow(aSaturn,3);
        double aCubedUranus = Math.pow(aUranus,3);
        double aCubedNeptune = Math.pow(aNeptune, 3);
        double aCubedPluto = Math.pow(aPluto,3);
        
        double areaMercury = Math.PI * Math.PI * aCubedMercury;
        double areaVenus = Math.PI * Math.PI * aCubedVenus;
        double areaEarth = Math.PI * Math.PI * aCubedEarth;
        double areaMars = Math.PI * Math.PI * aCubedMars;
        double areaJupiter = Math.PI * Math.PI * aCubedJupiter;
        double areaSaturn = Math.PI * Math. PI * aCubedSaturn;
        double areaUranus = Math.PI * Math.PI * aCubedUranus;
        double areaNeptune = Math.PI * Math.PI * aCubedNeptune;
        double areaPluto = Math.PI * Math.PI * aCubedPluto;
        
        double numMercury = 4 * areaMercury;
        double numVenus = 4 * areaVenus;
        double numEarth = 4 * areaEarth;
        double numMars = 4 * areaMars;
        double numJupiter = 4 * areaJupiter;
        double numSaturn = 4 * areaSaturn;
        double numUranus = 4 * areaUranus;
        double numNeptune = 4 * areaNeptune;
        double numPluto = 4 * areaPluto;
        
        double totalMercury = numMercury / denomMercury;
        double totalVenus = numVenus / denomVenus;
        double totalEarth = numEarth / denomEarth;
        double totalMars = numMars / denomMars;
        double totalJupiter = numJupiter / denomJupiter;
        double totalSaturn = numSaturn / denomSaturn;
        double totalUranus = numUranus / denomUranus;
        double totalNeptune = numNeptune / denomNeptune;
        double totalPluto = numPluto / denomPluto;
        
        double tSecondsMercury = Math.sqrt(totalMercury);
        double tSecondsVenus = Math.sqrt(totalVenus);
        double tSecondsEarth = Math.sqrt(totalEarth);
        double tSecondsMars = Math.sqrt(totalMars);
        double tSecondsJupiter = Math.sqrt(totalJupiter);
        double tSecondsSaturn = Math.sqrt(totalSaturn);
        double tSecondsUranus = Math.sqrt(totalUranus);
        double tSecondsNeptune = Math.sqrt(totalNeptune);
        double tSecondsPluto = Math.sqrt(totalPluto);
        
        final double secondsToDays = 86400;
        
        double Mercury = tSecondsMercury / secondsToDays;
        double Venus = tSecondsVenus / secondsToDays;
        double Earth = tSecondsEarth / secondsToDays;
        double Mars = tSecondsMars / secondsToDays;
        double Jupiter = tSecondsJupiter / secondsToDays;
        double Saturn = tSecondsSaturn / secondsToDays;
        double Uranus = tSecondsUranus / secondsToDays;
        double Neptune = tSecondsNeptune / secondsToDays;
        double Pluto = tSecondsPluto / secondsToDays;
        
        System.out.print("The time it takes for Mercury to orbit the Sun:");
        System.out.printf("%9.2f", Mercury);
        System.out.printf(" days\n");
        System.out.print("The time it takes for Venus to orbit the Sun:");
        System.out.printf("%11.2f", Venus);
        System.out.printf(" days\n");
        System.out.print("The time it takes for Earth to orbit the Sun:");
        System.out.printf("%11.2f", Earth);
        System.out.printf(" days\n");        
        System.out.print("The time it takes for Mars to Orbit the Sun:");
        System.out.printf("%12.2f", Mars);
        System.out.printf(" days\n");
        System.out.print("The time it takes for Jupiter to orbit the Sun:  ");
        System.out.printf("%6.2f", Jupiter);
        System.out.printf(" days\n");
        System.out.print("The time it takes for Saturn to orbit the Sun:");
        System.out.printf("%10.2f", Saturn);
        System.out.printf(" days\n");
        System.out.print("The time it takes for Uranus to orbit the Sun:");
        System.out.printf("%10.2f", Uranus);
        System.out.printf(" days\n");
        System.out.print("The time it takes for Neptune to orbit the Sun:");
        System.out.printf("%9.2f", Neptune);
        System.out.printf(" days\n");
        System.out.print("The time it takes for Pluto to orbit the Sun:");
        System.out.printf("%11.2f", Pluto);
        System.out.printf(" days");
         
    }
    
}
