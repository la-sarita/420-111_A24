
/**
 * Décrivez votre classe ConverstionTypesPrimitifsEtReferences ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class ConverstionTypesPrimitifsEtReferences
{
    public static void main (String[] args){
        convertionEntreTypesPrimitifs();
        convertStringVersNumeriquesReferences();
        convertStringVersNumeriquesPrimitifs();
        convertNumeriquesVersStringAvecValueOf();
        convertNumeriquesVersStringAvecToString();
        convertNumeriquesPrimitifsVersStringAvecToString();
        convertNumeriquesPrimitifsVersStringAvecValueOf();
    }
    
    public static void convertionEntreTypesPrimitifs(){
        double a = 25.5;
        int b = 10;
        double c;
        
        c = b;        // conversion implicite de int vers double
        b = (int) a;  // conversion explicite de double vers int (casting)
        
        double d = 2000.23;
        float f = (float)d;
        long l = (long) f;
        
        float x = 4.53F;
        System.out.println((int) x); //4
    }
    
    public static void convertStringVersNumeriquesReferences(){
        Byte b = Byte.valueOf("20");
        Short s = Short.valueOf("20");
        Integer i = Integer.valueOf("20");
        Long l = Long.valueOf("20");
        Float f = Float.valueOf("20");
        Double d = Double.valueOf("20");
        
        System.out.println(b + s + i + l + f + d);
    }
    
    public static void convertNumeriquesVersStringAvecValueOf(){
        Byte b = 20;
        String bs = String.valueOf(b);
        Short s = 20;
        String ss = String.valueOf(s);
        Integer i = 20;
        String is = String.valueOf(i);
        Long l = 20L;
        String ls = String.valueOf(l);
        Float f = 20.20f; 
        String fs = String.valueOf(f);
        Double d = 20.225;
        String ds = String.valueOf(d);
        
        System.out.println(bs + ss + is+ ls + fs + ds);
    }
    
    public static void convertNumeriquesVersStringAvecToString(){
        Byte b = 20;
        String bs = Byte.toString(b);
        Short s = 20;
        String ss = Short.toString(s);
        Integer i = 20;
        String is = Integer.toString(i);
        Long l = 20L;
        String ls = Long.toString(l);
        Float f = 20.20f; 
        String fs = Float.toString(f);
        Double d = 20.225;
        String ds = Double.toString(d);
        
        System.out.println(bs + ss + is+ ls + fs + ds);
    }
    
    public static void convertStringVersNumeriquesPrimitifs(){
        byte b = Byte.parseByte("20");
        short s = Short.parseShort("20");
        int i = Integer.parseInt("20");
        long l = Long.parseLong("20");
        float f = Float.parseFloat("20");
        double d = Double.parseDouble("20");
        
        System.out.println(b + s + i+ l + f + d);
    }
    
    public static void convertNumeriquesPrimitifsVersStringAvecToString(){
        byte b = 20;
        String bs = Byte.toString(b);
        short s = 20;
        String ss = Short.toString(s);
        int i = 20;
        String is = Integer.toString(i);
        long l = 20L;
        String ls = Long.toString(l);
        float f = 20.20f; 
        String fs = Float.toString(f);
        double d = 20.225;
        String ds = Double.toString(d);
        
        System.out.println(bs + ss + is+ ls + fs + ds);
    }
    
    public static void convertNumeriquesPrimitifsVersStringAvecValueOf(){
        byte b = 20;
        String bs = String.valueOf(b);
        short s = 20;
        String ss = String.valueOf(s);
        int i = 20;
        String is = String.valueOf(i);
        long l = 20L;
        String ls = String.valueOf(l);
        float f = 20.20f; 
        String fs = String.valueOf(f);
        double d = 20.225;
        String ds = String.valueOf(d);
        
        System.out.println(bs + ss + is+ ls + fs + ds);
    }
}
